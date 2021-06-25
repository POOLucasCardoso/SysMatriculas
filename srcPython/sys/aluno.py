import yaml

MATRICULA_COUNT = 0
NUMERO_DE_NOTAS = "3"

def geradorDeMatricula():
	global MATRICULA_COUNT
	MATRICULA_COUNT += 1
	return f'{MATRICULA_COUNT}'.zfill(4)

from Materias import NomesMateria,Materia

class Aluno(object):
	
	global NUMERO_DE_NOTAS

	def setMatriculaCount(quant:int):
		global MATRICULA_COUNT
		MATRICULA_COUNT = quant

	def getMatriculaCount():
		global MATRICULA_COUNT
		return MATRICULA_COUNT
	
	def __init__(self,nome:str, dataDeNascimento:str, materiasDumped = []):
		self.nome = nome
		self.dataDeNascimento = dataDeNascimento
		self.matricula = geradorDeMatricula()
		if len(materiasDumped) == 0:
			self.materias = list()
			for i in NomesMateria:
				self.materias.append(Materia(i,self.NUMERO_DE_NOTAS))
		else:
			for i in materiasDumped:
				materia = Materia(NomesMateria(i["nome"]),self.NUMERO_DE_NOTAS)
				materia.notas = i["notas"]
				self.materias.append(materia)

	def cadastrarNota(self, materia:NomesMateria, unidade:int, nota:float):
		for i in self.materias:
			if i.nome == materia:
				i.cadastrarNota(unidade, nota)
				break

	def dump(self):
		dumpedMaterias = list()
		for i in self.Materias:
			dumpedMaterias.append(i.dump())
		return {
			"nome":self.nome,
			"dataDeNascimento":self.dataDeNascimento,
			"matricula":self.matricula,
			"materias":dumpedMaterias,
		}

	def __str__(self):
		return f"Aluno: {self.nome}, matricula: {self.matricula}"
	
	def __eq__(self,obj):
		if obj != None:
			if obj.__class__ == self.__class__:
				if obj.matricula == self.matricula:
					return True
		return False