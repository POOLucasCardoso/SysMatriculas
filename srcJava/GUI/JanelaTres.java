package GUI;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import sys.Aluno;
import sys.AlunoNaoCadastradoException;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.JEditorPane;
import java.awt.Color;

public class JanelaTres extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	private JButton btnNewButton_4;
	private JTextField editorPane;
	private sys.SysPlanilha sistema;

	/**
	 * Create the frame.
	 */
	public JanelaTres(sys.SysPlanilha sistema) {
		this.sistema = sistema;
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 600, 400);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(211,211,211));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Excluir aluno");
		lblNewLabel.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 11, 564, 28);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(10, 97, 259, 35);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setEnabled(false);
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		textField_1.setBounds(10, 175, 259, 35);
		contentPane.add(textField_1);
		
		btnNewButton = new JButton("Voltar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		btnNewButton.setBackground(new Color(224, 255, 255));
		btnNewButton.setBounds(10, 308, 110, 50);
		contentPane.add(btnNewButton);
		
		btnNewButton_1 = new JButton("Pesquisar");
		btnNewButton_1.setBackground(new Color(224, 255, 255));
		btnNewButton_1.addActionListener(this);
		btnNewButton_1.setBounds(10, 216, 90, 30);
		contentPane.add(btnNewButton_1);
		
		editorPane = new JTextField();
		editorPane.setEnabled(false);
		editorPane.setForeground(new Color(34, 139, 34));
		editorPane.setFont(new Font("SansSerif", Font.PLAIN, 98));
		editorPane.setHorizontalAlignment(SwingConstants.CENTER);
		editorPane.setText("OK");
		editorPane.setEditable(false);
		editorPane.setBounds(334, 51, 240, 159);
		contentPane.add(editorPane);
		
		btnNewButton_2 = new JButton("Cancelar");
		btnNewButton_2.addActionListener(this);
		btnNewButton_2.setEnabled(false);
		btnNewButton_2.setBackground(new Color(224, 255, 255));
		btnNewButton_2.setBounds(334, 248, 90, 28);
		contentPane.add(btnNewButton_2);
		
		btnNewButton_3 = new JButton("Excluir");
		btnNewButton_3.addActionListener(this);
		btnNewButton_3.setEnabled(false);
		btnNewButton_3.setBackground(new Color(224, 255, 255));
		btnNewButton_3.setBounds(484, 248, 90, 28);
		contentPane.add(btnNewButton_3);
		
		btnNewButton_4 = new JButton("Confirmar");
		btnNewButton_4.setEnabled(false);
		btnNewButton_4.setBackground(new Color(224, 255, 255));
		btnNewButton_4.setBounds(468, 308, 110, 50);
		contentPane.add(btnNewButton_4);
		
		JLabel lblNewLabel_1 = new JLabel("Matr\u00EDcula");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(10, 74, 259, 13);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Nome do aluno");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(10, 157, 259, 13);
		contentPane.add(lblNewLabel_2);
		
		setVisible(true);
		
	}
	@Override
	public void actionPerformed(ActionEvent arg0){
		if (arg0.getSource()==this.btnNewButton_1){
			try {
				Aluno a = this.sistema.pesquisarAlunoPorMatricula(this.textField.getText());
				this.textField_1.setText(a.getNome());
				this.textField_1.setEnabled(true);
				this.editorPane.setEnabled(true);
				this.btnNewButton_2.setEnabled(true);
				this.btnNewButton_3.setEnabled(true);
			} catch (AlunoNaoCadastradoException e) {
				JOptionPane.showMessageDialog(this, 
						e.getMessage());
			} catch (IOException e) {
				JOptionPane.showMessageDialog(this, 
						"Ocorreu algum erro de sistema, os arquivos não puderam ser lidos.");
			}
		}else if (arg0.getSource()==this.btnNewButton_2){
			this.textField_1.setText("");
			this.textField_1.setEnabled(false);
			this.editorPane.setEnabled(false);
			this.btnNewButton_2.setEnabled(false);
			this.btnNewButton_3.setEnabled(false);
		}else if (arg0.getSource()==this.btnNewButton_3){
			try {
				this.sistema.excluirAluno(this.textField.getText());
				this.textField_1.setText("");
				this.textField_1.setEnabled(false);
				this.editorPane.setEnabled(false);
				this.btnNewButton_2.setEnabled(false);
				this.btnNewButton_3.setEnabled(false);
			} catch (AlunoNaoCadastradoException e) {
				JOptionPane.showMessageDialog(this, 
						e.getMessage());
			} catch (IOException e) {
				JOptionPane.showMessageDialog(this, 
						"Ocorreu algum erro de sistema, os arquivos não puderam ser lidos.");
			}
		}else if (arg0.getSource()==this.btnNewButton_4){
			 
		}
	}
}
