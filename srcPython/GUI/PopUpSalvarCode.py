# -*- coding: utf-8 -*-

################################################################################
## Form generated from reading UI file 'Pop-upSalvartIGWCF.ui'
##
## Created by: Qt User Interface Compiler version 5.15.2
##
## WARNING! All changes made in this file will be lost when recompiling UI file!
################################################################################

from PyQt5.QtCore import *
from PyQt5.QtGui import *
from PyQt5.QtWidgets import *


class Ui_Form(QWidget):
    def setupUi(self, Form):
        if not Form.objectName():
            Form.setObjectName(u"Form")
        Form.resize(300, 200)
        self.pushButton = QPushButton(Form)
        self.pushButton.setObjectName(u"pushButton")
        self.pushButton.setGeometry(QRect(210, 150, 75, 23))
        self.label = QLabel(Form)
        self.label.setObjectName(u"label")
        self.label.setGeometry(QRect(10, 20, 281, 121))
        font = QFont()
        font.setFamily(u"Arial")
        font.setPointSize(13)
        self.label.setFont(font)
        self.label.setAlignment(Qt.AlignCenter)

        self.retranslateUi(Form)

        QMetaObject.connectSlotsByName(Form)
    # setupUi

    def __init__(self):
        super(Ui_Form,self).__init__()
        self.pushButton.clicked.connect(self.close)

    def retranslateUi(self, Form):
        Form.setWindowTitle(QCoreApplication.translate("Form", u"Form", None))
        self.pushButton.setText(QCoreApplication.translate("Form", u"Concluir", None))
        self.label.setText(QCoreApplication.translate("Form", u"Altera\u00e7\u00f5es salvas com sucessos", None))
    # retranslateUi

