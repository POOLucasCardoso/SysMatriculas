from SYS.Aluno import Aluno
from SYS.Materias import NomesMateria
import pickle
from os.path import exists as pathExists

class AlunoJaCadastradoException(Exception):
	def __init__(self,message):
		self.message = message

class AlunoNaoCadastradoException(Exception):
	def __init__(self,message):
		self.message = message

class SysPlanilha:
	
	ARQUIVO_DE_DADOS  = "arquivos.pkl"

	def __init__(self):
		self.alunos = dict() #{"matricula":Aluno}
		if pathExists(self.ARQUIVO_DE_DADOS):
			self.carregarDados()

	def cadastrarAluno(self, aluno:Aluno):
		try:
			self.pesquisarAlunoPorMatricula(aluno.matricula)
			raise AlunoJaCadastradoException(f"Já existe um aluno com a matrícula {aluno.matricula} cadastrada.")
		except AlunoNaoCadastradoException:
			self.alunos[aluno.matricula] = aluno

	def pesquisarAlunoPorMatricula(self, matricula:str):
		if matricula not in self.alunos.keys():
			raise AlunoNaoCadastradoException(f"Não existe nenhum aluno no banco de dados com a matrícula {matricula}")
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
		dados = {
		 	"quantMatriculas":Aluno.getMatriculaCount(),
		 	"alunosList":self.alunos,
		 	}
		with open(self.ARQUIVO_DE_DADOS,"wb") as arquivo:
			pickle.dump(dados, arquivo)

	def carregarDados(self):
		with open(self.ARQUIVO_DE_DADOS,"rb") as arquivo:
			quantMatriculas,self.alunos = pickle.load(arquivo).values()
		Aluno.setMatriculaCount(quantMatriculas)
		