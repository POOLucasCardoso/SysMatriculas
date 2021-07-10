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
		else:
			return self.alunos[matricula]

	def editarNotaDoAluno(self, matricula:str, materia:NomesMateria, unidade:int, nota:float):
		self.pesquisarAlunoPorMatricula(matricula)
		self.alunos[matricula].cadastrarNota(materia, unidade, nota)

	def excluirAluno(self, matricula:str):
		self.pesquisarAlunoPorMatricula(matricula)
		del self.alunos[matricula]

	def salvarDados(self):
		#criando o dicinário#
		dados = {#aqui estou criando 2 palavaras chaves para guardar as variaveis que irão ser salvas nos arquivos
		 	"quantMatriculas":Aluno.getMatriculaCount(), #variavel estatica
		 	"alunosList":self.alunos,
		 	}
		 	#abrindo um aquivo para salvar os dados# o With ele fecha automaticamente a stream de dados após a execução do bloco
		with open(self.ARQUIVO_DE_DADOS,"wb") as arquivo: # wb = whrite bytes 
			pickle.dump(dados, arquivo) #escreve dentro da stream, na variável arquivo, os dados
	#		
	def carregarDados(self):
		with open(self.ARQUIVO_DE_DADOS,"rb") as arquivo: #abri o arquivo e ler o arquivo com rb = readbyte
			dados = pickle.load(arquivo) #aqui esta sendo carregado os arquivos para variavel dados
			self.alunos = dados["alunosList"] #ele estar pegado do dicionario todos os dados dos alunos
			quantMatriculas = dados["quantMatriculas"] #aqui estar sendo pega a quantidade de matriculas
		Aluno.setMatriculaCount(quantMatriculas)#está passando para variável estática da classe aluno a quantidade de matrícula
		