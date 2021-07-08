import traceback

from PyQt5.QtWidgets import QMainWindow, QLabel, QLineEdit, QPushButton, QGridLayout

from GUI.TelaMainCode import Ui_MainWindow as TelaMain
from GUI.MainCadastrarCode import Ui_MainWindow as MainCadastrar
from GUI.MainEditarNotaCode import Ui_MainWindow as MainEditarNota
from GUI.MainExcluirCode import Ui_MainWindow as MainExcluir
from GUI.MainPesquisarPorMatriculaCode import Ui_MainWindow as MainPesquisarPorMatricula

from GUI.PopUpExcluirCode import Ui_Form as PopUpExcluir
from GUI.PopUpNaoMatriculaCode import Ui_Form as PopUpNaoMatricula
from GUI.PopUpNaoPossivelCode import Ui_Form as PopUpNaoPossivel
from GUI.PopUpSalvarCode import Ui_Form as PopUpSalvar

from SYS.SysPlanilha import SysPlanilha, AlunoNaoCadastradoException, AlunoJaCadastradoException
from SYS.Aluno import Aluno
from SYS.Materias import NomesMateria

class JanelaMain(QMainWindow,TelaMain):

	sistema = SysPlanilha()

	def __init__(self):
		super(JanelaMain,self).__init__()
		self.setupUi(self)
		self.butaoCadastrar.clicked.connect(self.on_butaoCadastrar_clicked)
		self.butaoPesquisar.clicked.connect(self.on_butaoPesquisar_clicked)
		self.butaoExcluir.clicked.connect(self.on_butaoExcluir_clicked)
		self.butaoEditar.clicked.connect(self.on_butaoEditar_clicked)

	def on_butaoCadastrar_clicked(self):
		self.cadastrar = JanelaCadastrar(self)
		self.cadastrar.show()

	def on_butaoPesquisar_clicked(self):
		self.pesquisarPorMatricula = JanelaPesquisarPorMatricula(self)
		self.pesquisarPorMatricula.show()

	def on_butaoExcluir_clicked(self):
		self.excluir = JanelaExcluir(self)
		self.excluir.show()

	def on_butaoEditar_clicked(self):
		self.editarNota = JanelaEditarNota(self)
		self.editarNota.show()

class JanelaCadastrar(QMainWindow,MainCadastrar):

	def __init__(self, parent):
		self.parent = parent
		self.sistema = parent.sistema
		super(JanelaCadastrar,self).__init__()
		self.setupUi(self)
		self.butaodevoltar.clicked.connect(self.onClose)
		self.butaodesalvardados.clicked.connect(self.cadastrar)

	def onClose(self):
		self.parent.sistema = self.sistema
		self.close()

	def cadastrar(self):
		aluno = Aluno(self.digitadordenome.text(), self.digitadodenascimento.text())
		self.digitadordematricula.setText(aluno.matricula)
		self.sistema.cadastrarAluno(aluno)
		self.sistema.salvarDados()
		self.popup = PopUpSalvar()
		self.popup.show()

class JanelaEditarNota(QMainWindow,MainEditarNota):

	def __init__(self, parent):
		self.parent = parent
		self.sistema = parent.sistema
		super(JanelaEditarNota,self).__init__()
		self.setupUi(self)
		self.pushButton.clicked.connect(self.onClose)
		self.butaopesquisar.clicked.connect(self.pesquisar)
		self.pushButton_2.clicked.connect(self.salvarTudo)

	def onClose(self):
		self.parent.sistema = self.sistema
		self.close()

	def pesquisar(self):
		try:
			self.butaopesquisar.setEnabled(False)
			self.scrollGrid = QGridLayout(self.scrollAreaWidgetContents)
			self.scrollGrid.setObjectName(u"scrollGrid")
			self.aluno = self.sistema.pesquisarAlunoPorMatricula(self.lineEdit_2.text())
			for i in range(len(self.aluno.materias)):
				label = QLabel(self.scrollAreaWidgetContents)
				label.setText(self.aluno.materias[i].nome.name)
				self.scrollGridLabels.append([label])
				self.scrollGrid.addWidget(self.scrollGridLabels[i][0], i, 0, 1, 1)
				for j in range(1,len(self.aluno.materias[i].notas.values())+1):
					label = QLineEdit(self.scrollAreaWidgetContents)
					if self.aluno.materias[i].notas[j] == None:
						label.setPlaceholderText("Digite Nota")
					else:
						label.setEnabled(False)
						label.setText(str(self.aluno.materias[i].notas[j]))
					self.scrollGridLabels[i].append(label)
					self.scrollGrid.addWidget(self.scrollGridLabels[i][j], i, j, 1, 1)
				butaook = QPushButton(self.layoutWidget1)
				butaook.setObjectName(self.aluno.materias[i].nome.name)
				butaook.setText("OK")
				self.scrollGridLabels[i].append(butaook)
				okNum = len(self.scrollGridLabels[i])-1
				self.scrollGrid.addWidget(self.scrollGridLabels[i][okNum], i, okNum, 1, 1)
				self.scrollGridLabels[i][okNum].clicked.connect(self.notaOk)

		except AlunoNaoCadastradoException as ANCe:
			self.popup = PopUpNaoMatricula()
			self.popup.show()
		except Exception as e:
			print(traceback.print_exc())

	def notaOk(self):
		clicked = self.sender().objectName()
		for i in range(1,len(self.scrollGridLabels[NomesMateria[clicked].value-1][1:-1])+1):
			try:
				self.aluno.cadastrarNota(NomesMateria[clicked], i, int(self.scrollGridLabels[NomesMateria[clicked].value-1][i].text()))
			except ValueError as Ve:
				self.popup = PopUpSalvar()
				self.popup.show()
				break

	def salvarTudo(self):
		self.sistema.salvarDados()
		self.popup = PopUpSalvar()
		self.popup.show()

class JanelaExcluir(QMainWindow,MainExcluir):

	def __init__(self, parent):
		self.parent = parent
		self.sistema = parent.sistema
		super(JanelaExcluir,self).__init__()
		self.setupUi(self)
		self.butaovoltar.clicked.connect(self.onClose)
		self.butaocancelar.clicked.connect(self.cancelar)
		self.butaopesquisarnome.clicked.connect(self.pesquisar)
		self.butaoexcluir.clicked.connect(self.excluir)
		self.butaosalvar.clicked.connect(self.salvarTudo)

	def cancelar(self):
		self.lineEdit.setText("")
		self.lineEdit_2.setText("")
		self.aluno = None

	def pesquisar(self):
		try:
			self.aluno = self.sistema.pesquisarAlunoPorMatricula(self.lineEdit_2.text())
			self.lineEdit.setText(self.aluno.nome)
		except AlunoNaoCadastradoException as ANCe:
			self.popup = PopUpNaoMatricula()
			self.popup.show()

	def excluir(self):
		try:
			self.sistema.excluirAluno(self.lineEdit_2.text())
			self.aluno = None
			self.popup = PopUpExcluir()
			self.popup.show()
		except AlunoNaoCadastradoException as ANCe:
			self.popup = PopUpNaoMatricula()
			self.popup.show()
		self.lineEdit.setText("")
		
	def salvarTudo(self):
		self.sistema.salvarDados()
		self.popup = PopUpSalvar()
		self.popup.show()

	def onClose(self):
		self.parent.sistema = self.sistema
		self.close()

class JanelaPesquisarPorMatricula(QMainWindow,MainPesquisarPorMatricula):

	def __init__(self, parent):
		self.parent = parent
		self.sistema = parent.sistema
		super(JanelaPesquisarPorMatricula,self).__init__()
		self.setupUi(self)
		self.botaovoltar.clicked.connect(self.onClose)
		self.butaodepesquisa.clicked.connect(self.pesquisar)

	def onClose(self):
		self.parent.sistema = self.sistema
		self.close()

	def pesquisar(self):
		try:
			self.butaodepesquisa.setEnabled(False)
			self.scrollGrid = QGridLayout(self.scrollAreaWidgetContents)
			self.scrollGrid.setObjectName(u"scrollGrid")
			aluno = self.sistema.pesquisarAlunoPorMatricula(self.digitadordematricula.text())
			self.nome = QLabel(self.scrollAreaWidgetContents)
			self.nome.setText(aluno.nome)
			self.scrollGrid.addWidget(self.nome, 0, 0, 1, 1)
			self.nascimento = QLabel(self.scrollAreaWidgetContents)
			self.nascimento.setText(aluno.dataDeNascimento)
			self.scrollGrid.addWidget(self.nascimento, 0, 1, 1, 1)
			for i in range(len(aluno.materias)):
				label = QLabel(self.scrollAreaWidgetContents)
				label.setText(aluno.materias[i].nome.name)
				self.scrollGridLabels.append([label])
				self.scrollGrid.addWidget(self.scrollGridLabels[i][0], i+1, 0, 1, 1)
				for j in range(1,len(aluno.materias[i].notas.values())+1):
					label = QLabel(self.scrollAreaWidgetContents)
					if aluno.materias[i].notas[j] == None:
						label.setText("N/C")
					else:
						label.setText(str(aluno.materias[i].notas[j]))
					self.scrollGridLabels[i].append(label)
					self.scrollGrid.addWidget(self.scrollGridLabels[i][j], i+1, j, 1, 1)
		except AlunoNaoCadastradoException as ANCe:
			self.popup = PopUpNaoMatricula()
			self.popup.show()
			
		except Exception as e:
			print(traceback.print_exc())
