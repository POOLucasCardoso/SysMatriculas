package GUI;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import sys.Aluno;
import sys.AlunoNaoCadastradoException;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.ListSelectionModel;
import javax.swing.JSpinner;
import javax.swing.SpinnerListModel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import sys.NomesMateria;
import javax.swing.SpinnerNumberModel;

public class JanelaSeis extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JTextField textField;
	private JTextField txtNome;
	private JButton btnNewButton_1;
	private JButton btnSalvar;
	private JButton btnPesquisar;
	private sys.SysPlanilha sistema;
	private Aluno alunoPesquisado;
	private JSpinner spinnerUnidade;
	private JSpinner spinnerNota;
	private JComboBox comboMaretias;

	/**
	 * Create the frame.
	 */
	public JanelaSeis(sys.SysPlanilha sistema) {
		this.sistema = sistema;
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 600, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Editar nota do aluno");
		lblNewLabel.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 11, 564, 40);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(10, 88, 212, 40);
		contentPane.add(textField);
		textField.setColumns(10);
		
		btnSalvar = new JButton("Salvar");
		btnSalvar.addActionListener(this);
		btnSalvar.setEnabled(false);
		btnSalvar.setBackground(new Color(224, 255, 255));
		btnSalvar.setBounds(464, 300, 110, 50);
		contentPane.add(btnSalvar);
		
		txtNome = new JTextField();
		txtNome.setEnabled(false);
		txtNome.setEditable(false);
		txtNome.setColumns(10);
		txtNome.setBounds(362, 88, 212, 40);
		contentPane.add(txtNome);
		
		btnNewButton_1 = new JButton("Voltar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		btnNewButton_1.setBackground(new Color(224, 255, 255));
		btnNewButton_1.setBounds(10, 300, 110, 50);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_1 = new JLabel("Matr\u00EDcula");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(10, 63, 212, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Nome do aluno");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(362, 63, 212, 14);
		contentPane.add(lblNewLabel_2);
		
		btnPesquisar = new JButton("Pesquisar");
		btnPesquisar.addActionListener(this);
		btnPesquisar.setBackground(new Color(224, 255, 255));
		btnPesquisar.setBounds(234, 94, 90, 30);
		contentPane.add(btnPesquisar);
		
		comboMaretias = new JComboBox();
		comboMaretias.setEnabled(false);
		comboMaretias.setModel(new DefaultComboBoxModel(NomesMateria.values()));
		comboMaretias.setBounds(10, 154, 212, 28);
		contentPane.add(comboMaretias);
		
		spinnerUnidade = new JSpinner();
		spinnerUnidade.setEnabled(false);
		spinnerUnidade.setModel(new SpinnerNumberModel(1, 1, sys.Aluno.NUM_NOTAS, 1));
		spinnerUnidade.setBounds(312, 154, 50, 28);
		contentPane.add(spinnerUnidade);
		
		spinnerNota = new JSpinner();
		spinnerNota.setEnabled(false);
		spinnerNota.setModel(new SpinnerNumberModel(0.0, 0.0, 10.0, 0.1));
		spinnerNota.setBounds(484, 154, 90, 28);
		contentPane.add(spinnerNota);
		
		JLabel lblNewLabel_3 = new JLabel("Unidade");
		lblNewLabel_3.setBounds(261, 154, 63, 28);
		contentPane.add(lblNewLabel_3);
		
		JLabel txtNota = new JLabel("Nota");
		txtNota.setBounds(426, 154, 63, 28);
		contentPane.add(txtNota);
		
		setVisible(true);
		
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource()==this.btnSalvar){
			 try {
				this.sistema.editarNotaDoAluno(
						 this.textField.getText(), 
						 (sys.NomesMateria)this.comboMaretias.getSelectedItem(), 
						 (double)this.spinnerNota.getValue(), 
						 (int)this.spinnerUnidade.getValue());
				JOptionPane.showMessageDialog(this, 
						"Nota cadastrada com sucesso!");
			} catch (AlunoNaoCadastradoException e) {
				JOptionPane.showMessageDialog(this, 
						e.getMessage());
			}
		}else if (arg0.getSource()==this.btnPesquisar){
			try {
				this.alunoPesquisado = this.sistema.pesquisarAlunoPorMatricula(this.textField.getText());
				this.txtNome.setText(this.alunoPesquisado.getNome());
				this.txtNome.setEnabled(true);
				this.comboMaretias.setEnabled(true);
				this.spinnerNota.setEnabled(true);
				this.spinnerUnidade.setEnabled(true);
				this.btnSalvar.setEnabled(true);
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
