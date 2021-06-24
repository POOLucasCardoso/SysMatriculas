class Materia(object):
'''Essa classe irá receber o nome da matéria e as notas do aluno na matéria'''
	 def __init__(self,nome,quantNotas):
	 	self.nome = nome
	 	#O dicionario anexa índices a valores
	 	self.notas = dict()
	 	for i in range(1,quantNotas+1,1):
	 		self.notas[str(i)] = -1

	 def cadastrarNota (self, unidade: str, nota: int):
	 	'''Esse método casdastra uma nota nova dentro da class materia'''
	 	self.notas[unidade] = nota

	 def cauculaMedia (self):
	 	'''Esse método caucula a média na matéria 
se tiverem todas as notas cadastradas'''
		if -1 in self.notas.values():
			raise ValueError("Quantidade de notas insuficiente para calcular a média.")
		somaMedia = 0
		for i in self.notas.values():
			somaMedia += i
		mediaTotal = somaMedia/len(self.notas.values())
		return mediaTotal
