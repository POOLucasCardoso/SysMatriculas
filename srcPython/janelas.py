from PyQt5.QtWidgets import QMainWindow

from GUI.TelaMainCode import Ui_MainWindow as TelaMain
from GUI.MainCadastrarCode import Ui_MainWindow as MainCadastrar
from GUI.MainEditarNotaCode import Ui_MainWindow as MainEditarNota
from GUI.MainExcluirCode import Ui_MainWindow as MainExcluir
from GUI.MainPesquisarPorMatriculaCode import Ui_MainWindow as MainPesquisarPorMatricula

from GUI.PopUpExcluirCode import Ui_Form as PopUpExcuir
from GUI.PopUpNaoMatriculaCode import Ui_Form as PopUpNaoMatricula
from GUI.PopUpNaoPossivelCode import Ui_Form as PopUpNaoPossivel
from GUI.PopUpSalvarCode import Ui_Form as PopUpSalvar

from SYS.SysPlanilha import SysPlanilha
from SYS.Aluno import Aluno

class JanelaMain(QMainWindow,TelaMain):

	def __init__(self):
		super(JanelaMain,self).__init__()
		self.setupUi(self)
		self.butaoCadastrar.clicked.connect(self.on_butaoCadastrar_clicked)
		self.butaoPesquisar.clicked.connect(self.on_butaoPesquisar_clicked)
		self.butaoExcluir.clicked.connect(self.on_butaoExcluir_clicked)
		self.butaoEditar.clicked.connect(self.on_butaoEditar_clicked)

	def on_butaoCadastrar_clicked(self):
		self.cadastrar = JanelaCadastrar()
		self.cadastrar.show()

	def on_butaoPesquisar_clicked(self):
		self.pesquisarPorMatricula = JanelaPesquisarPorMatricula()
		self.pesquisarPorMatricula.show()

	def on_butaoExcluir_clicked(self):
		self.excluir = JanelaExcluir()
		self.excluir.show()

	def on_butaoEditar_clicked(self):
		self.editarNota = JanelaEditarNota()
		self.editarNota.show()

class JanelaCadastrar(QMainWindow,MainCadastrar):

	sistema = SysPlanilha()

	def __init__(self):
		super(JanelaCadastrar,self).__init__()
		self.setupUi(self)
		self.butaodevoltar.clicked.connect(self.close)
		self.butaodesalvardados.clicked.connect(self.cadastrar)

	def cadastrar(self):
		aluno = Aluno(self.digitadordenome.text(), self.digitadordenascimento.text())
		self.digitadordematricula.setText(aluno.matricula)
		self.sistema.cadastrarAluno(aluno)
		self.popup = PopUpSalvar()
		self.popup.show()
		self.sistema.salvarDados()

class JanelaEditarNota(QMainWindow,MainEditarNota):

	sistema = SysPlanilha()

	def __init__(self):
		super(JanelaEditarNota,self).__init__()
		self.setupUi(self)
		self.pushButton.clicked.connect(self.close)

class JanelaExcluir(QMainWindow,MainExcluir):

	sistema = SysPlanilha()

	def __init__(self):
		super(JanelaExcluir,self).__init__()
		self.setupUi(self)
		self.butaovoltar.clicked.connect(self.close)

class JanelaPesquisarPorMatricula(QMainWindow,MainPesquisarPorMatricula):

	sistema = SysPlanilha()

	def __init__(self):
		super(JanelaPesquisarPorMatricula,self).__init__()
		self.setupUi(self)
		self.butaovoltar.clicked.connect(self.close)
