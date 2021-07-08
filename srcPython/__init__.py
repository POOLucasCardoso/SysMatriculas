from PyQt5.QtWidgets import QApplication
import sys
from janelas import JanelaMain


if __name__=="__main__":
	root = QApplication(sys.argv)
	app = JanelaMain()
	app.show()
	sys.exit(root.exec_())
