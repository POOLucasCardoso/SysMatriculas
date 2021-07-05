# -*- coding: utf-8 -*-

################################################################################
## Form generated from reading UI file 'MainCadastrarnzYlLK.ui'
##
## Created by: Qt User Interface Compiler version 5.15.2
##
## WARNING! All changes made in this file will be lost when recompiling UI file!
################################################################################

from PySide2.QtCore import *
from PySide2.QtGui import *
from PySide2.QtWidgets import *


class Ui_MainWindow(object):
    def setupUi(self, MainWindow):
        if not MainWindow.objectName():
            MainWindow.setObjectName(u"MainWindow")
        MainWindow.resize(800, 500)
        self.centralwidget = QWidget(MainWindow)
        self.centralwidget.setObjectName(u"centralwidget")
        self.label = QLabel(self.centralwidget)
        self.label.setObjectName(u"label")
        self.label.setGeometry(QRect(140, 30, 500, 90))
        font = QFont()
        font.setPointSize(20)
        self.label.setFont(font)
        self.label.setAlignment(Qt.AlignCenter)
        self.layoutWidget = QWidget(self.centralwidget)
        self.layoutWidget.setObjectName(u"layoutWidget")
        self.layoutWidget.setGeometry(QRect(30, 123, 761, 227))
        self.gridLayout = QGridLayout(self.layoutWidget)
        self.gridLayout.setObjectName(u"gridLayout")
        self.gridLayout.setContentsMargins(0, 0, 0, 0)
        self.digitadordenascimento = QTextEdit(self.layoutWidget)
        self.digitadordenascimento.setObjectName(u"digitadordenascimento")

        self.gridLayout.addWidget(self.digitadordenascimento, 2, 2, 1, 1)

        self.verticalLayout_2 = QVBoxLayout()
        self.verticalLayout_2.setObjectName(u"verticalLayout_2")
        self.horizontalSpacer = QSpacerItem(40, 20, QSizePolicy.Expanding, QSizePolicy.Minimum)

        self.verticalLayout_2.addItem(self.horizontalSpacer)

        self.horizontalSpacer_2 = QSpacerItem(40, 20, QSizePolicy.Expanding, QSizePolicy.Minimum)

        self.verticalLayout_2.addItem(self.horizontalSpacer_2)

        self.horizontalSpacer_3 = QSpacerItem(40, 20, QSizePolicy.Expanding, QSizePolicy.Minimum)

        self.verticalLayout_2.addItem(self.horizontalSpacer_3)


        self.gridLayout.addLayout(self.verticalLayout_2, 0, 1, 3, 1)

        self.verticalLayout = QVBoxLayout()
        self.verticalLayout.setObjectName(u"verticalLayout")
        self.textoMatricula = QLabel(self.layoutWidget)
        self.textoMatricula.setObjectName(u"textoMatricula")
        font1 = QFont()
        font1.setPointSize(15)
        self.textoMatricula.setFont(font1)

        self.verticalLayout.addWidget(self.textoMatricula)

        self.barradespaco = QSpacerItem(20, 40, QSizePolicy.Minimum, QSizePolicy.Expanding)

        self.verticalLayout.addItem(self.barradespaco)

        self.textoNome = QLabel(self.layoutWidget)
        self.textoNome.setObjectName(u"textoNome")
        self.textoNome.setFont(font1)

        self.verticalLayout.addWidget(self.textoNome)

        self.verticalSpacer_2 = QSpacerItem(20, 40, QSizePolicy.Minimum, QSizePolicy.Expanding)

        self.verticalLayout.addItem(self.verticalSpacer_2)

        self.textoNascimento = QLabel(self.layoutWidget)
        self.textoNascimento.setObjectName(u"textoNascimento")
        self.textoNascimento.setFont(font1)

        self.verticalLayout.addWidget(self.textoNascimento)


        self.gridLayout.addLayout(self.verticalLayout, 0, 0, 3, 1)

        self.digitadordenome = QTextEdit(self.layoutWidget)
        self.digitadordenome.setObjectName(u"digitadordenome")

        self.gridLayout.addWidget(self.digitadordenome, 1, 2, 1, 1)

        self.digitadordematricula = QTextEdit(self.layoutWidget)
        self.digitadordematricula.setObjectName(u"digitadordematricula")
        self.digitadordematricula.setEnabled(False)

        self.gridLayout.addWidget(self.digitadordematricula, 0, 2, 1, 1)

        self.layoutWidget1 = QWidget(self.centralwidget)
        self.layoutWidget1.setObjectName(u"layoutWidget1")
        self.layoutWidget1.setGeometry(QRect(30, 390, 751, 61))
        self.gridLayout_2 = QGridLayout(self.layoutWidget1)
        self.gridLayout_2.setObjectName(u"gridLayout_2")
        self.gridLayout_2.setHorizontalSpacing(20)
        self.gridLayout_2.setVerticalSpacing(10)
        self.gridLayout_2.setContentsMargins(20, 10, 20, 10)
        self.butaodevoltar = QPushButton(self.layoutWidget1)
        self.butaodevoltar.setObjectName(u"butaodevoltar")
        sizePolicy = QSizePolicy(QSizePolicy.MinimumExpanding, QSizePolicy.MinimumExpanding)
        sizePolicy.setHorizontalStretch(0)
        sizePolicy.setVerticalStretch(0)
        sizePolicy.setHeightForWidth(self.butaodevoltar.sizePolicy().hasHeightForWidth())
        self.butaodevoltar.setSizePolicy(sizePolicy)
        font2 = QFont()
        font2.setPointSize(12)
        self.butaodevoltar.setFont(font2)

        self.gridLayout_2.addWidget(self.butaodevoltar, 0, 0, 1, 1)

        self.horizontalSpacer_4 = QSpacerItem(40, 20, QSizePolicy.Expanding, QSizePolicy.Minimum)

        self.gridLayout_2.addItem(self.horizontalSpacer_4, 0, 1, 1, 1)

        self.butaodesalvardados = QPushButton(self.layoutWidget1)
        self.butaodesalvardados.setObjectName(u"butaodesalvardados")
        sizePolicy.setHeightForWidth(self.butaodesalvardados.sizePolicy().hasHeightForWidth())
        self.butaodesalvardados.setSizePolicy(sizePolicy)
        self.butaodesalvardados.setFont(font2)

        self.gridLayout_2.addWidget(self.butaodesalvardados, 0, 2, 1, 1)

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
        self.label.setText(QCoreApplication.translate("MainWindow", u"Cadastrar Aluno", None))
        self.textoMatricula.setText(QCoreApplication.translate("MainWindow", u"Matr\u00edcula:", None))
        self.textoNome.setText(QCoreApplication.translate("MainWindow", u"Nome:", None))
        self.textoNascimento.setText(QCoreApplication.translate("MainWindow", u"Nascimento:", None))
        self.butaodevoltar.setText(QCoreApplication.translate("MainWindow", u"Voltar", None))
        self.butaodesalvardados.setText(QCoreApplication.translate("MainWindow", u"Salvar Dados", None))
    # retranslateUi

