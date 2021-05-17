package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JSplitPane;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JTable;

public class JanelaZero {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JanelaZero window = new JanelaZero();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public JanelaZero() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setForeground(new Color(176, 224, 230));
		frame.getContentPane().setBackground(new Color(211, 211, 211));
		frame.setResizable(false);
		frame.setBounds(100, 100, 600, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton newButtonCadastrarAluno = new JButton("Cadastrar aluno");
		newButtonCadastrarAluno.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 14));
		newButtonCadastrarAluno.setForeground(new Color(0, 0, 0));
		newButtonCadastrarAluno.setBackground(new Color(153, 153, 255));
		newButtonCadastrarAluno.setBounds(10, 97, 250, 70);
		frame.getContentPane().add(newButtonCadastrarAluno);
		
		JButton newButtonExcluirAluno = new JButton("Excluir aluno");
		newButtonExcluirAluno.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 14));
		newButtonExcluirAluno.setBackground(new Color(153, 153, 255));
		newButtonExcluirAluno.setBounds(10, 189, 250, 70);
		frame.getContentPane().add(newButtonExcluirAluno);
		
		JButton newButtonAlunosDevedores = new JButton("Aluno devedores");
		newButtonAlunosDevedores.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 14));
		newButtonAlunosDevedores.setBackground(new Color(153, 153, 255));
		newButtonAlunosDevedores.setBounds(10, 281, 250, 70);
		frame.getContentPane().add(newButtonAlunosDevedores);
		
		JButton NewButtonSearch4Matricula = new JButton("Pesquisar aluno por matr\u00EDcula");
		NewButtonSearch4Matricula.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 14));
		NewButtonSearch4Matricula.setBackground(new Color(153, 153, 255));
		NewButtonSearch4Matricula.setBounds(334, 97, 250, 70);
		frame.getContentPane().add(NewButtonSearch4Matricula);
		
		JButton newButtonSearch4Nome = new JButton("Pesquisar aluno por nome");
		newButtonSearch4Nome.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 14));
		newButtonSearch4Nome.setBackground(new Color(153, 153, 255));
		newButtonSearch4Nome.setBounds(334, 189, 250, 70);
		frame.getContentPane().add(newButtonSearch4Nome);
		
		JButton newButtonEditarNotaAluno = new JButton("Editar nota do aluno");
		newButtonEditarNotaAluno.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 14));
		newButtonEditarNotaAluno.setBackground(new Color(153, 153, 255));
		newButtonEditarNotaAluno.setBounds(334, 281, 250, 70);
		frame.getContentPane().add(newButtonEditarNotaAluno);
		
		JLabel lblNewLabel = new JLabel("ACADEMIA CHUUNIN");
		lblNewLabel.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(114, 6, 351, 34);
		frame.getContentPane().add(lblNewLabel);
	}
}
