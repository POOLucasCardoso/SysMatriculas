# -*- coding: utf-8 -*-

################################################################################
## Form generated from reading UI file 'TelaMainFsZNoJ.ui'
##
## Created by: Qt User Interface Compiler version 5.15.2
##
## WARNING! All changes made in this file will be lost when recompiling UI file!
################################################################################

from PyQt5.QtCore import *
from PyQt5.QtGui import *
from PyQt5.QtWidgets import *


class Ui_MainWindow(object):
    def setupUi(self, MainWindow):
        if not MainWindow.objectName():
            MainWindow.setObjectName(u"MainWindow")
        MainWindow.resize(800, 550)
        sizePolicy = QSizePolicy(QSizePolicy.Fixed, QSizePolicy.Fixed)
        sizePolicy.setHorizontalStretch(0)
        sizePolicy.setVerticalStretch(0)
        sizePolicy.setHeightForWidth(MainWindow.sizePolicy().hasHeightForWidth())
        MainWindow.setSizePolicy(sizePolicy)
        self.centralwidget = QWidget(MainWindow)
        self.centralwidget.setObjectName(u"centralwidget")
        self.TextoAcademia = QLabel(self.centralwidget)
        self.TextoAcademia.setObjectName(u"TextoAcademia")
        self.TextoAcademia.setGeometry(QRect(150, 10, 500, 50))
        self.TextoAcademia.setBaseSize(QSize(0, 0))
        font = QFont()
        font.setPointSize(20)
        self.TextoAcademia.setFont(font)
        self.TextoAcademia.setTextFormat(Qt.AutoText)
        self.TextoAcademia.setScaledContents(False)
        self.TextoAcademia.setAlignment(Qt.AlignCenter)
        self.layoutWidget = QWidget(self.centralwidget)
        self.layoutWidget.setObjectName(u"layoutWidget")
        self.layoutWidget.setGeometry(QRect(10, 80, 781, 421))
        self.gridLayout = QGridLayout(self.layoutWidget)
        self.gridLayout.setSpacing(20)
        self.gridLayout.setObjectName(u"gridLayout")
        self.gridLayout.setContentsMargins(20, 20, 20, 20)
        self.butaoCadastrar = QPushButton(self.layoutWidget)
        self.butaoCadastrar.setObjectName(u"butaoCadastrar")
        sizePolicy1 = QSizePolicy(QSizePolicy.MinimumExpanding, QSizePolicy.MinimumExpanding)
        sizePolicy1.setHorizontalStretch(0)
        sizePolicy1.setVerticalStretch(0)
        sizePolicy1.setHeightForWidth(self.butaoCadastrar.sizePolicy().hasHeightForWidth())
        self.butaoCadastrar.setSizePolicy(sizePolicy1)
        font1 = QFont()
        font1.setPointSize(12)
        self.butaoCadastrar.setFont(font1)

        self.gridLayout.addWidget(self.butaoCadastrar, 0, 0, 1, 1)

        self.butaoPesquisar = QPushButton(self.layoutWidget)
        self.butaoPesquisar.setObjectName(u"butaoPesquisar")
        sizePolicy1.setHeightForWidth(self.butaoPesquisar.sizePolicy().hasHeightForWidth())
        self.butaoPesquisar.setSizePolicy(sizePolicy1)
        self.butaoPesquisar.setFont(font1)

        self.gridLayout.addWidget(self.butaoPesquisar, 0, 1, 1, 1)

        self.butaoExcluir = QPushButton(self.layoutWidget)
        self.butaoExcluir.setObjectName(u"butaoExcluir")
        sizePolicy1.setHeightForWidth(self.butaoExcluir.sizePolicy().hasHeightForWidth())
        self.butaoExcluir.setSizePolicy(sizePolicy1)
        self.butaoExcluir.setFont(font1)

        self.gridLayout.addWidget(self.butaoExcluir, 1, 0, 1, 1)

        self.butaoPesquisarNome = QPushButton(self.layoutWidget)
        self.butaoPesquisarNome.setObjectName(u"butaoPesquisarNome")
        self.butaoPesquisarNome.setEnabled(False)
        sizePolicy1.setHeightForWidth(self.butaoPesquisarNome.sizePolicy().hasHeightForWidth())
        self.butaoPesquisarNome.setSizePolicy(sizePolicy1)
        self.butaoPesquisarNome.setFont(font1)

        self.gridLayout.addWidget(self.butaoPesquisarNome, 1, 1, 1, 1)

        self.butaoDevedores = QPushButton(self.layoutWidget)
        self.butaoDevedores.setObjectName(u"butaoDevedores")
        self.butaoDevedores.setEnabled(False)
        sizePolicy1.setHeightForWidth(self.butaoDevedores.sizePolicy().hasHeightForWidth())
        self.butaoDevedores.setSizePolicy(sizePolicy1)
        self.butaoDevedores.setFont(font1)

        self.gridLayout.addWidget(self.butaoDevedores, 2, 0, 1, 1)

        self.butaoEditar = QPushButton(self.layoutWidget)
        self.butaoEditar.setObjectName(u"butaoEditar")
        sizePolicy1.setHeightForWidth(self.butaoEditar.sizePolicy().hasHeightForWidth())
        self.butaoEditar.setSizePolicy(sizePolicy1)
        self.butaoEditar.setFont(font1)

        self.gridLayout.addWidget(self.butaoEditar, 2, 1, 1, 1)

        MainWindow.setCentralWidget(self.centralwidget)
        self.menubar = QMenuBar(MainWindow)
        self.menubar.setObjectName(u"menubar")
        self.menubar.setGeometry(QRect(0, 0, 800, 21))
        MainWindow.setMenuBar(self.menubar)
        self.statusbar = QStatusBar(MainWindow)
        self.statusbar.setObjectName(u"statusbar")
        MainWindow.setStatusBar(self.statusbar)

        self.retranslateUi(MainWindow)

        QMetaObject.connectSlotsByName(MainWindow)
    # setupUi

    def retranslateUi(self, MainWindow):
        MainWindow.setWindowTitle(QCoreApplication.translate("MainWindow", u"MainWindow", None))
        self.TextoAcademia.setText(QCoreApplication.translate("MainWindow", u"Academia Python", None))
        self.butaoCadastrar.setText(QCoreApplication.translate("MainWindow", u"Cadastrar aluno", None))
        self.butaoPesquisar.setText(QCoreApplication.translate("MainWindow", u"Pesquisar aluno por matr\u00edcula", None))
        self.butaoExcluir.setText(QCoreApplication.translate("MainWindow", u"Excluir aluno", None))
        self.butaoPesquisarNome.setText(QCoreApplication.translate("MainWindow", u"Pesquisar aluno por nome", None))#Disabled
        self.butaoDevedores.setText(QCoreApplication.translate("MainWindow", u"Alunos devedores", None))#Disabled
        self.butaoEditar.setText(QCoreApplication.translate("MainWindow", u"Editar aluno", None))
    # retranslateUi

