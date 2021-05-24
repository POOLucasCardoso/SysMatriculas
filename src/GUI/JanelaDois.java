package GUI;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;

import sys.Aluno;
import sys.AlunoNaoCadastradoException;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JPanel;

public class JanelaDois extends JFrame implements ActionListener{
	private JTextField textField;
	private JButton btnNewButton;
	private JButton btnNewButton_2;
	private sys.SysPlanilha sistema;
	private JScrollPane scrollPane;

	/**
	 * Create the frame.
	 */
	public JanelaDois(sys.SysPlanilha sistema) {
		this.sistema = sistema;
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setResizable(false);
		getContentPane().setBackground(new Color(211, 211, 211));
		setBounds(100, 100, 600, 400);
		getContentPane().setLayout(null);
		
		JLabel newLabel = new JLabel("Pesquisar Aluno por Matr\u00EDcula");
		newLabel.setFont(new Font("Microsoft Tai Le", Font.PLAIN, 20));
		newLabel.setHorizontalAlignment(SwingConstants.CENTER);
		newLabel.setBounds(10, 11, 572, 26);
		getContentPane().add(newLabel);
		
		textField = new JTextField();
		textField.setToolTipText("Digite aqui a Matr\u00EDcula");
		textField.setBounds(54, 75, 216, 33);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		btnNewButton = new JButton("Voltar");
		btnNewButton.setBackground(new Color(224, 255, 255));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnNewButton.setBounds(10, 311, 110, 50);
		getContentPane().add(btnNewButton);
		
		btnNewButton_2 = new JButton("Pesquisar");
		btnNewButton_2.setBackground(new Color(224, 255, 255));
		btnNewButton_2.addActionListener(this);
		btnNewButton_2.setBounds(373, 75, 90, 30);
		getContentPane().add(btnNewButton_2);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(54, 106, 410, 175);
		getContentPane().add(scrollPane);

		setVisible(true);

	}
	@Override
	public void actionPerformed(ActionEvent arg0){
		if (arg0.getSource()==this.btnNewButton_2) {
			try {
				Aluno a = this.sistema.pesquisarAlunoPorMatricula(this.textField.getText());
				this.btnNewButton_2.setEnabled(false);
				this.scrollPane.setViewportView(new FichaDeAlunos(a));
			} catch (AlunoNaoCadastradoException e) {
				JOptionPane.showMessageDialog(this, 
						e.getMessage());
			} catch (IOException e) {
				JOptionPane.showMessageDialog(this, 
						"Ocorreu algum erro de sistema, os arquivos não puderam ser lidos.");
			}
		}
	}
}
