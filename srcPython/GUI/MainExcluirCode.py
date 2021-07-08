# -*- coding: utf-8 -*-

################################################################################
## Form generated from reading UI file 'MainExcluirufqmoD.ui'
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
        MainWindow.resize(800, 534)
        self.centralwidget = QWidget(MainWindow)
        self.centralwidget.setObjectName(u"centralwidget")
        self.label = QLabel(self.centralwidget)
        self.label.setObjectName(u"label")
        self.label.setGeometry(QRect(20, 20, 761, 91))
        font = QFont()
        font.setPointSize(20)
        self.label.setFont(font)
        self.label.setAlignment(Qt.AlignCenter)
        self.layoutWidget = QWidget(self.centralwidget)
        self.layoutWidget.setObjectName(u"layoutWidget")
        self.layoutWidget.setGeometry(QRect(30, 160, 201, 91))
        self.gridLayout_2 = QGridLayout(self.layoutWidget)
        self.gridLayout_2.setObjectName(u"gridLayout_2")
        self.gridLayout_2.setContentsMargins(0, 0, 0, 0)
        self.lineEdit = QLineEdit(self.layoutWidget)
        self.lineEdit.setObjectName(u"lineEdit")

        self.gridLayout_2.addWidget(self.lineEdit, 0, 0, 1, 1)

        self.verticalSpacer = QSpacerItem(20, 40, QSizePolicy.Minimum, QSizePolicy.Expanding)

        self.gridLayout_2.addItem(self.verticalSpacer, 1, 0, 1, 1)

        self.lineEdit_2 = QLineEdit(self.layoutWidget)
        self.lineEdit_2.setObjectName(u"lineEdit_2")

        self.gridLayout_2.addWidget(self.lineEdit_2, 2, 0, 1, 1)

        self.layoutWidget1 = QWidget(self.centralwidget)
        self.layoutWidget1.setObjectName(u"layoutWidget1")
        self.layoutWidget1.setGeometry(QRect(290, 160, 77, 91))
        self.gridLayout = QGridLayout(self.layoutWidget1)
        self.gridLayout.setObjectName(u"gridLayout")
        self.gridLayout.setContentsMargins(0, 0, 0, 0)
        self.butaopesquisarmatricula = QPushButton(self.layoutWidget1)
        self.butaopesquisarmatricula.setObjectName(u"butaopesquisarmatricula")
        font1 = QFont()
        font1.setPointSize(10)
        self.butaopesquisarmatricula.setFont(font1)

        self.gridLayout.addWidget(self.butaopesquisarmatricula, 0, 0, 1, 1)

        self.verticalSpacer_2 = QSpacerItem(20, 40, QSizePolicy.Minimum, QSizePolicy.Expanding)

        self.gridLayout.addItem(self.verticalSpacer_2, 1, 0, 1, 1)

        self.butaopesquisarnome = QPushButton(self.layoutWidget1)
        self.butaopesquisarnome.setObjectName(u"butaopesquisarnome")
        self.butaopesquisarnome.setFont(font1)

        self.gridLayout.addWidget(self.butaopesquisarnome, 2, 0, 1, 1)

        self.layoutWidget2 = QWidget(self.centralwidget)
        self.layoutWidget2.setObjectName(u"layoutWidget2")
        self.layoutWidget2.setGeometry(QRect(500, 120, 258, 247))
        self.gridLayout_3 = QGridLayout(self.layoutWidget2)
        self.gridLayout_3.setObjectName(u"gridLayout_3")
        self.gridLayout_3.setContentsMargins(0, 0, 0, 0)
        self.listView = QListView(self.layoutWidget2)
        self.listView.setObjectName(u"listView")

        self.gridLayout_3.addWidget(self.listView, 0, 0, 1, 2)

        self.verticalSpacer_3 = QSpacerItem(20, 18, QSizePolicy.Minimum, QSizePolicy.Expanding)

        self.gridLayout_3.addItem(self.verticalSpacer_3, 1, 0, 1, 1)

        self.verticalSpacer_4 = QSpacerItem(20, 18, QSizePolicy.Minimum, QSizePolicy.Expanding)

        self.gridLayout_3.addItem(self.verticalSpacer_4, 1, 1, 1, 1)

        self.butaocancelar = QPushButton(self.layoutWidget2)
        self.butaocancelar.setObjectName(u"butaocancelar")
        font2 = QFont()
        font2.setPointSize(12)
        self.butaocancelar.setFont(font2)

        self.gridLayout_3.addWidget(self.butaocancelar, 2, 0, 1, 1)

        self.butaoexcluir = QPushButton(self.layoutWidget2)
        self.butaoexcluir.setObjectName(u"butaoexcluir")
        self.butaoexcluir.setFont(font2)

        self.gridLayout_3.addWidget(self.butaoexcluir, 2, 1, 1, 1)

        self.layoutWidget3 = QWidget(self.centralwidget)
        self.layoutWidget3.setObjectName(u"layoutWidget3")
        self.layoutWidget3.setGeometry(QRect(30, 392, 731, 91))
        self.gridLayout_4 = QGridLayout(self.layoutWidget3)
        self.gridLayout_4.setSpacing(20)
        self.gridLayout_4.setObjectName(u"gridLayout_4")
        self.gridLayout_4.setContentsMargins(20, 20, 20, 20)
        self.butaovoltar = QPushButton(self.layoutWidget3)
        self.butaovoltar.setObjectName(u"butaovoltar")
        sizePolicy = QSizePolicy(QSizePolicy.MinimumExpanding, QSizePolicy.MinimumExpanding)
        sizePolicy.setHorizontalStretch(0)
        sizePolicy.setVerticalStretch(0)
        sizePolicy.setHeightForWidth(self.butaovoltar.sizePolicy().hasHeightForWidth())
        self.butaovoltar.setSizePolicy(sizePolicy)
        self.butaovoltar.setFont(font2)

        self.gridLayout_4.addWidget(self.butaovoltar, 0, 0, 1, 1)

        self.horizontalSpacer = QSpacerItem(208, 20, QSizePolicy.Expanding, QSizePolicy.Minimum)

        self.gridLayout_4.addItem(self.horizontalSpacer, 0, 1, 1, 1)

        self.butaosalvar = QPushButton(self.layoutWidget3)
        self.butaosalvar.setObjectName(u"butaosalvar")
        sizePolicy.setHeightForWidth(self.butaosalvar.sizePolicy().hasHeightForWidth())
        self.butaosalvar.setSizePolicy(sizePolicy)
        self.butaosalvar.setFont(font2)

        self.gridLayout_4.addWidget(self.butaosalvar, 0, 2, 1, 1)

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
        self.label.setText(QCoreApplication.translate("MainWindow", u"Excluir aluno", None))
        self.butaopesquisarmatricula.setText(QCoreApplication.translate("MainWindow", u"Pesquisar", None))
        self.butaopesquisarnome.setText(QCoreApplication.translate("MainWindow", u"Pesquisar", None))
        self.butaocancelar.setText(QCoreApplication.translate("MainWindow", u"Cancelar", None))
        self.butaoexcluir.setText(QCoreApplication.translate("MainWindow", u"Excluir", None))
        self.butaovoltar.setText(QCoreApplication.translate("MainWindow", u"Voltar", None))
        self.butaosalvar.setText(QCoreApplication.translate("MainWindow", u"Salvar", None))
    # retranslateUi

