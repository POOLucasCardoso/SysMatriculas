package GUI;

import javax.swing.JPanel;

import sys.Aluno;
import sys.Materia;

import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import java.util.LinkedList;

import javax.swing.SwingConstants;
import javax.swing.Box;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JTextField;

public class FichaDeAlunos extends JPanel {

	/**
	 * Create the panel.
	 */
	public FichaDeAlunos(Aluno aluno) {
		setLayout(new BorderLayout(0, 0));
		
		JLabel lblNome = new JLabel(aluno.getNome());
		lblNome.setHorizontalAlignment(SwingConstants.CENTER);
		lblNome.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 20));
		add(lblNome, BorderLayout.NORTH);
		
		Box materiasBox = Box.createVerticalBox();
		add(materiasBox, BorderLayout.CENTER);
		
		LinkedList<Materia> notas = aluno.exibirNotas();
		
		for(Materia m: notas) {
			Box horizontalBox = Box.createHorizontalBox();
			horizontalBox.setBorder(new LineBorder(new Color(0, 0, 0)));
			materiasBox.add(horizontalBox);
			
			JTextField nomeMateriaLabel = new JTextField(m.getNome().toString());
			nomeMateriaLabel.setEditable(false);
			nomeMateriaLabel.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 20));
			horizontalBox.add(nomeMateriaLabel);
			
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
		
		setVisible(true);
		
	}

}
