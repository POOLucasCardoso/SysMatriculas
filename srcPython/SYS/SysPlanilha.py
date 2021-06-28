from Aluno import Aluno
from Materias import NomesMateria
import yaml

class AlunoJaCadastradoException(Exception):
	def __init__(self,message):
		self.message = message

class AlunoNaoCadastradoException(Exception):
	def __init__(self,message):
		self.message = message

class SysPlanilha:
	
	ARQUIVO_DE_DADOS  = "arquivos.yaml"

	def __init__(self):
		self.alunos = dict() #{"matricula":Aluno}
		self.carregarDados()

	def cadastrarAluno(self, aluno:Aluno):
		try:
			self.pesquisarAlunoPorMatricula(aluno.matricula):
			raise AlunoJaCadstradoException(f"Já existe um aluno com a matrícula {aluno.matricula} cadastrada.")
		except AlunoNaoCadastradoException:
			self.alunos[aluno.matricula] = aluno

	def pesquisarAlunoPorMatricula(self, matricula:str):
		if matricula not in self.alunos.keys():
			raise AlunoNaoCadstradoException(f"Não existe nenhum aluno no banco de dados com a matrícula {matricula}")
		return self.alunos[matricula]

	def pesquisarAlunoPorNome(self, nome:str):
		lista = list()
		for i in self.alunos.values:
			if i.nome == nome:
				lista.append(i)
		return lista

	def editarNotaDoAluno(self, matricula:str, materia:NomesMateria, unidade:int, nota:float):
		self.pesquisarAlunoPorMatricula(matricula)
		self.alunos[matricula].cadastrarNota(materia, unidade, nota)
		

	def excluirAluno(self, matricula:str):
		self.pesquisarAlunoPorMatricula(matricula)
		del self.alunos[matricula]

	def salvarDados(self):
		alunosDumped = list()
		for i in self.alunos:
			alunosDumped.append(i.dump())
		dados = yaml.dump({
			"quantMatriculas":Aluno.getMatriculaCount(),
			"alunosList":alunosDumped,
			})
		with open(self.ARQUIVO_DE_DADOS,"w") as arquivo:
			arquivo.write(dados)

	def carregarDados(self):
		dados = ""
		with open(self.ARQUIVO_DE_DADOS,"r") as arquivo:
			dados = arquivo.read()
		quantMatriculas,alunosDumped = yaml.load(dados)
		for i in alunosDumped:
			aluno = Aluno(i["nome"], i["dataDeNascimento"], i["matricula"], i["materias"])
			self.alunos[aluno.matricula] = aluno
