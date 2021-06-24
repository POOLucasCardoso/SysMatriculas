from Aluno import Aluno
import yaml
class AlunoJaCadastradoException(Exception):
	def __init__(self,message):
		self.message = message

class AlunoNaoCadastradoException(Exception):
	def __init__(self,message):
		self.message = message

class SysPlanilha:
	
	ARQUIVO_DE_FICHAS = "files.yaml"
	ARQUIVO_DE_DADOS  = "data.yaml"

	def __init__(self):
		self.alunos = dict() #{"matricula":Aluno}

	def cadastrarAluno(self, aluno:Aluno):
		try:
			self.pesquisarAlunoPorMatricula(aluno.matricula):
			raise AlunoJaCadstradoException(f"Já existe um aluno com a matrícula {aluno.matricula} cadastrada.")
		except AlunoNaoCadastradoException:
			self.alunos[aluno.matricula] = aluno

	def pesquisarAlunoPorMatricula(self, matricula:str):
		if matricula not in self.alunos.keys():
			self.carregarAluno(matricula)
		return self.alunos[matricula]

	def pesquisarAlunoPorNome(self, nome:str):
		lista = list()
		for i in self.alunos.values:
			if i.nome == nome:
				

	def carregarAluno(self, matricula):
		raise AlunoNaoCadstradoException(f"Não existe nenhum aluno no banco de dados com a matrícula {matricula}")