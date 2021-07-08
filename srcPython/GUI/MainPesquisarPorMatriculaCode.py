# -*- coding: utf-8 -*-

################################################################################
## Form generated from reading UI file 'MainPesquisarPorMatriculaFZkTYY.ui'
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
        MainWindow.resize(726, 591)
        self.centralwidget = QWidget(MainWindow)
        self.centralwidget.setObjectName(u"centralwidget")
        self.textopesquisaluno = QLabel(self.centralwidget)
        self.textopesquisaluno.setObjectName(u"textopesquisaluno")
        self.textopesquisaluno.setGeometry(QRect(60, 10, 571, 71))
        font = QFont()
        font.setPointSize(20)
        self.textopesquisaluno.setFont(font)
        self.textopesquisaluno.setAlignment(Qt.AlignCenter)
        self.scrollArea = QScrollArea(self.centralwidget)
        self.scrollArea.setObjectName(u"scrollArea")
        self.scrollArea.setGeometry(QRect(20, 190, 621, 281))
        self.scrollArea.setWidgetResizable(True)
        self.scrollAreaWidgetContents = QWidget()
        self.scrollAreaWidgetContents.setObjectName(u"scrollAreaWidgetContents")
        self.scrollAreaWidgetContents.setGeometry(QRect(0, 0, 619, 279))
        self.scrollArea.setWidget(self.scrollAreaWidgetContents)
        self.botaovoltar = QPushButton(self.centralwidget)
        self.botaovoltar.setObjectName(u"botaovoltar")
        self.botaovoltar.setGeometry(QRect(20, 490, 200, 50))
        self.layoutWidget = QWidget(self.centralwidget)
        self.layoutWidget.setObjectName(u"layoutWidget")
        self.layoutWidget.setGeometry(QRect(20, 110, 621, 71))
        self.gridLayout_2 = QGridLayout(self.layoutWidget)
        self.gridLayout_2.setSpacing(20)
        self.gridLayout_2.setObjectName(u"gridLayout_2")
        self.gridLayout_2.setContentsMargins(20, 20, 20, 20)
        self.digitadordematricula = QLineEdit(self.layoutWidget)
        self.digitadordematricula.setObjectName(u"digitadordematricula")
        sizePolicy = QSizePolicy(QSizePolicy.MinimumExpanding, QSizePolicy.MinimumExpanding)
        sizePolicy.setHorizontalStretch(0)
        sizePolicy.setVerticalStretch(0)
        sizePolicy.setHeightForWidth(self.digitadordematricula.sizePolicy().hasHeightForWidth())
        self.digitadordematricula.setSizePolicy(sizePolicy)

        self.gridLayout_2.addWidget(self.digitadordematricula, 0, 0, 1, 1)

        self.horizontalSpacer = QSpacerItem(40, 20, QSizePolicy.Expanding, QSizePolicy.Minimum)

        self.gridLayout_2.addItem(self.horizontalSpacer, 0, 1, 1, 1)

        self.gridLayout = QGridLayout()
        self.gridLayout.setObjectName(u"gridLayout")
        self.butaodepesquisa = QPushButton(self.layoutWidget)
        self.butaodepesquisa.setObjectName(u"butaodepesquisa")
        sizePolicy.setHeightForWidth(self.butaodepesquisa.sizePolicy().hasHeightForWidth())
        self.butaodepesquisa.setSizePolicy(sizePolicy)

        self.gridLayout.addWidget(self.butaodepesquisa, 0, 0, 1, 1)


        self.gridLayout_2.addLayout(self.gridLayout, 0, 2, 1, 1)

        MainWindow.setCentralWidget(self.centralwidget)
        self.menubar = QMenuBar(MainWindow)
        self.menubar.setObjectName(u"menubar")
        self.menubar.setGeometry(QRect(0, 0, 726, 21))
        MainWindow.setMenuBar(self.menubar)
        self.statusbar = QStatusBar(MainWindow)
        self.statusbar.setObjectName(u"statusbar")
        MainWindow.setStatusBar(self.statusbar)

        self.retranslateUi(MainWindow)

        QMetaObject.connectSlotsByName(MainWindow)
    # setupUi

    def retranslateUi(self, MainWindow):
        MainWindow.setWindowTitle(QCoreApplication.translate("MainWindow", u"MainWindow", None))
        self.textopesquisaluno.setText(QCoreApplication.translate("MainWindow", u"Pesquisar Aluno por Matr\u00edcula", None))
        self.botaovoltar.setText(QCoreApplication.translate("MainWindow", u"Voltar", None))
        self.butaodepesquisa.setText(QCoreApplication.translate("MainWindow", u"Pesquisar", None))
    # retranslateUi

