from enum import Enum

class NomesMateria(Enum):

	MATEMATICA = 1
	POSTUGUES = 2
	GEOGRAFIA = 3
	CIENCIAS = 4
	HISTORIA = 5
	ARTES = 6


class Materia(object):
	'''Essa classe irá receber o nome da matéria e as notas do aluno na matéria'''
	def __init__(self,nome:NomesMateria,quantNotas:int):
		self.nome = nome
		#O dicionario anexa índices a valores
		self.notas = dict()
		for i in range(1,quantNotas+1,1):
			self.notas[i] = None

	def cadastrarNota (self, unidade: int, nota: float):
		'''Esse método casdastra uma nota nova dentro da class materia'''
		self.notas[unidade] = nota

	def cauculaMedia (self):
		'''Esse método caucula a média na matéria 
se tiverem todas as notas cadastradas'''
		if None in self.notas.values():
			raise ValueError("Quantidade de notas insuficiente para calcular a média.")
		somaMedia = 0
		for i in self.notas.values():
			somaMedia += i
		mediaTotal = somaMedia/len(self.notas.values())
		return mediaTotal
