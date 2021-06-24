package GUI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import sys.Aluno;
import sys.AlunoJaCadastradoException;

import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class JanelaUm extends JFrame implements ActionListener {
	private sys.SysPlanilha sistema;
	private JTextField textFieldMatricula;
	private JTextField textFieldNome;
	private JTextField textFieldNascimento;
	private JButton newButtonVoltar;
	private JButton newButtonSalvarDados;

	/**
	 * Create the frame.
	 */
	public JanelaUm(sys.SysPlanilha sistema) {
		this.sistema = sistema;
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setResizable(false);
		getContentPane().setBackground(new Color(211, 211, 211));
		setBounds(100, 100, 600, 400);
		getContentPane().setLayout(null);
		
		newButtonVoltar = new JButton("Voltar");
		newButtonVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		newButtonVoltar.setFont(new Font("Open Sans", Font.PLAIN, 15));
		newButtonVoltar.setBackground(new Color(224, 255, 255));
		newButtonVoltar.setBounds(6, 309, 110, 50);
		getContentPane().add(newButtonVoltar);
		
		newButtonSalvarDados = new JButton("Salvar");
		newButtonSalvarDados.addActionListener(this);
		newButtonSalvarDados.setFont(new Font("Open Sans", Font.PLAIN, 15));
		newButtonSalvarDados.setBackground(new Color(224, 255, 255));
		newButtonSalvarDados.setBounds(456, 309, 110, 50);
		getContentPane().add(newButtonSalvarDados);
		
		JLabel NewLabelCadastrarAluno = new JLabel("Cadastrar Aluno");
		NewLabelCadastrarAluno.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 20));
		NewLabelCadastrarAluno.setHorizontalAlignment(SwingConstants.CENTER);
		NewLabelCadastrarAluno.setBounds(115, 30, 324, 16);
		getContentPane().add(NewLabelCadastrarAluno);
		
		JLabel newLabelMatricula = new JLabel("Matr\u00EDcula:");
		newLabelMatricula.setFont(new Font("Open Sans", Font.PLAIN, 15));
		newLabelMatricula.setBounds(6, 113, 96, 16);
		getContentPane().add(newLabelMatricula);
		
		JLabel newLabelNome = new JLabel("Nome:");
		newLabelNome.setFont(new Font("Open Sans", Font.PLAIN, 15));
		newLabelNome.setBounds(6, 166, 96, 16);
		getContentPane().add(newLabelNome);
		
		JLabel newLabelNascimento = new JLabel("Nascimento:");
		newLabelNascimento.setFont(new Font("Open Sans", Font.PLAIN, 15));
		newLabelNascimento.setBounds(6, 212, 96, 28);
		getContentPane().add(newLabelNascimento);
		
		textFieldMatricula = new JTextField();
		textFieldMatricula.setEnabled(false);
		textFieldMatricula.setEditable(false);
		textFieldMatricula.setBounds(115, 107, 272, 28);
		getContentPane().add(textFieldMatricula);
		textFieldMatricula.setColumns(10);
		
		textFieldNome = new JTextField();
		textFieldNome.setBounds(115, 160, 272, 28);
		getContentPane().add(textFieldNome);
		textFieldNome.setColumns(10);
		
		textFieldNascimento = new JTextField();
		textFieldNascimento.setBounds(115, 212, 272, 28);
		getContentPane().add(textFieldNascimento);
		textFieldNascimento.setColumns(10);
		

		setVisible(true);

	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource()==this.newButtonSalvarDados){
			Aluno temp = new Aluno(this.textFieldNome.getText(), this.textFieldNascimento.getText());
			this.textFieldMatricula.setText(temp.getMatricula());
			try {
				this.sistema.cadastrarAluno(temp);
			} catch (AlunoJaCadastradoException e) {
				JOptionPane.showMessageDialog(this, 
						e.getMessage());
			} catch (IOException e) {
				JOptionPane.showMessageDialog(this, 
						"Ocorreu algum erro de sistema, os dados inseridos não serão salvos.");
			}
		}
	}
}