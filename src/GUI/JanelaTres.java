package GUI;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JEditorPane;
import java.awt.Color;
import java.awt.event.ActionListener;

public class JanelaTres extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Create the frame.
	 */
	public JanelaTres() {
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
		textField_1.setColumns(10);
		textField_1.setBounds(10, 175, 259, 35);
		contentPane.add(textField_1);
		
		JButton btnNewButton = new JButton("Voltar");
		btnNewButton.setBackground(new Color(224, 255, 255));
		btnNewButton.setBounds(10, 308, 110, 50);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Pesquisar");
		btnNewButton_1.setBackground(new Color(224, 255, 255));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBounds(10, 209, 90, 30);
		contentPane.add(btnNewButton_1);
		
		JEditorPane editorPane = new JEditorPane();
		editorPane.setBounds(334, 51, 240, 159);
		contentPane.add(editorPane);
		
		JButton btnNewButton_2 = new JButton("Cancelar");
		btnNewButton_2.setBackground(new Color(224, 255, 255));
		btnNewButton_2.setBounds(334, 210, 90, 28);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Excluir");
		btnNewButton_3.setBackground(new Color(224, 255, 255));
		btnNewButton_3.setBounds(484, 210, 90, 28);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Confirmar");
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
	public void actionPerfomed(ActionEvent arg0){
		if(arg0.getSource()==this.btnNewButton){
			dispose();
		}else if (arg0.getSource()==this.btnNewButton_1){

		}else if (arg0.getSource()==this.btnNewButton_2){

		}else if (arg0.getSource()==this.btnNewButton_3){

		}else if (arg0.getSource()==this.btnNewButton_4){
			 
		}
	}
}
