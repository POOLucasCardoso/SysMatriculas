package GUI;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.text.JTextComponent;

import sys.Materia;

import javax.swing.JTextField;

import java.util.HashMap;
import java.util.LinkedList;

import javax.swing.JButton;
import javax.swing.Box;
import javax.swing.JScrollPane;

public class TabelaEdicao extends JFrame implements ActionListener {

	private JPanel contentPane;
	private sys.Aluno aluno;
	private JButton btnNewButton_1;
	private HashMap<sys.NomesMateria,JButton> botoesDeMateria;

	/**
	 * Create the frame.
	 */
	public TabelaEdicao(sys.Aluno aluno) {
		this.aluno = aluno;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 10, 435, 340);
		contentPane.add(scrollPane);
		
		Box materiasBox = Box.createVerticalBox();
		scrollPane.setViewportView(materiasBox);

		LinkedList<Materia> notas = aluno.exibirNotas();
		
		for(Materia m: notas) {
			Box horizontalBox = Box.createHorizontalBox();
			horizontalBox.setBorder(new LineBorder(new Color(0, 0, 0)));
			materiasBox.add(horizontalBox);
			
			JButton temp = new JButton(m.getNome().toString());
			temp.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 20));
			temp.addActionListener(this);
			this.botoesDeMateria.put(m.getNome(), temp);
			horizontalBox.add(temp);
			
			for(double n: m.getNotas()) {
				JTextField notaMateriaLabel;
				if(n<0) {
					notaMateriaLabel = new JTextField("Ñ/C");
				}else {
					notaMateriaLabel = new JTextField(""+n);
				}
				notaMateriaLabel.setEditable(false);
				notaMateriaLabel.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 20));
				horizontalBox.add(notaMateriaLabel);
			}
		}
		
		JButton btnNewButton = new JButton("Voltar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		btnNewButton.setBounds(464, 300, 110, 50);
		contentPane.add(btnNewButton);
		
		btnNewButton_1 = new JButton("Salvar");
		btnNewButton_1.addActionListener(this);
		btnNewButton_1.setEnabled(false);
		btnNewButton_1.setBounds(464, 240, 110, 50);
		contentPane.add(btnNewButton_1);

		setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		if (this.botoesDeMateria.containsValue(arg0.getSource())) {
		}
	}
}
