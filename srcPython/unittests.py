import unittest 
import pickle
from SYS.Aluno import Aluno
from SYS.Materias import NomesMateria
from SYS.SysPlanilha import SysPlanilha

with open("SYS/arquivos","w") as arquivo:
        arquivo.write("")

class TestesUnitarios(unittest.TestCase):

        def teste_de_instancia(self):
                try:
                        sistema = SysPlanilha()
                        self.assertIsInstance(sistema,SysPlanilha)
                except Exception as e:
                        self.fail(f"Excessão não esperada do tipo '{str(e)}'")

        def teste_de_cadastro(self):
                dados = {
                        "quantMatriculas":0,
                        "alunosList":{},
                        }
                with open("arquivos.pkl","wb") as arquivo:
                        pickle.dump(dados, arquivo)

                sistema = SysPlanilha()
                novoAluno = Aluno("joão","05/05/2005")
                sistema.cadastrarAluno(novoAluno)
                self.assertEqual(len(sistema.alunos.keys()),1)
                self.assertEqual(sistema.pesquisarAlunoPorMatricula("0001").nome, "joão")

        def teste_de_cadastro_de_nota(self):
                dados = {
                        "quantMatriculas":0,
                        "alunosList":{},
                        }
                with open("arquivos.pkl","wb") as arquivo:
                        pickle.dump(dados, arquivo)

                sistema = SysPlanilha()
                novoAluno = Aluno("joão","05/05/2005")
                sistema.cadastrarAluno(novoAluno)
                sistema.editarNotaDoAluno("0001",NomesMateria.MATEMATICA,1,0)
                materia = None
                for i in sistema.pesquisarAlunoPorMatricula("0001").materias:
                        if i.nome == NomesMateria.MATEMATICA:
                                materia = i
                                break
                self.assertEqual(materia.notas[1], 0)

        def teste_salvando_carregando_arquivos(self):
                dados = {
                        "quantMatriculas":0,
                        "alunosList":{},
                        }
                with open("arquivos.pkl","wb") as arquivo:
                        pickle.dump(dados, arquivo)

                sistema = SysPlanilha()
                novoAluno = Aluno("joão","05/05/2005")
                sistema.cadastrarAluno(novoAluno)
                sistema.salvarDados()
                sistema = SysPlanilha()
                self.assertEqual(len(sistema.alunos.keys()),1)
                self.assertEqual(sistema.pesquisarAlunoPorMatricula("0001").nome, "joão")


if __name__=="__main__":
        unittest.main()
