package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JanelaZero implements ActionListener{

	private JFrame frame;
	private JButton newButtonCadastrarAluno;
	private JButton newButtonSearch4Matricula;
	private JButton newButtonSearch4Nome;
	private JButton newButtonEditarNotaAluno;
	private JButton newButtonExcluirAluno;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
				        if ("Nimbus".equals(info.getName())) {
				            UIManager.setLookAndFeel(info.getClassName());
				            break;
				        }
				    }
					//UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
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
		
		newButtonCadastrarAluno = new JButton("Cadastrar aluno");
		newButtonCadastrarAluno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new JanelaUm();
			}
		});
		newButtonCadastrarAluno.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 15));
		newButtonCadastrarAluno.setForeground(new Color(0, 0, 0));
		newButtonCadastrarAluno.setBackground(new Color(153, 153, 255));
		newButtonCadastrarAluno.setBounds(10, 97, 250, 70);
		frame.getContentPane().add(newButtonCadastrarAluno);
		
		newButtonExcluirAluno = new JButton("Excluir aluno");
		newButtonExcluirAluno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new JanelaTres();
			}
		});
		newButtonExcluirAluno.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 14));
		newButtonExcluirAluno.setBackground(new Color(153, 153, 255));
		newButtonExcluirAluno.setBounds(10, 189, 250, 70);
		frame.getContentPane().add(newButtonExcluirAluno);
		
		JButton newButtonAlunosDevedores = new JButton("Aluno devedores");
		newButtonAlunosDevedores.setEnabled(false);
		newButtonAlunosDevedores.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 14));
		newButtonAlunosDevedores.setBackground(new Color(153, 153, 255));
		newButtonAlunosDevedores.setBounds(10, 281, 250, 70);
		frame.getContentPane().add(newButtonAlunosDevedores);
		
		newButtonSearch4Matricula = new JButton("Pesquisar aluno por matr\u00EDcula");
		newButtonSearch4Matricula.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new JanelaDois();
			}
		});
		newButtonSearch4Matricula.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 14));
		newButtonSearch4Matricula.setBackground(new Color(153, 153, 255));
		newButtonSearch4Matricula.setBounds(334, 97, 250, 70);
		frame.getContentPane().add(newButtonSearch4Matricula);
		
		newButtonSearch4Nome = new JButton("Pesquisar aluno por nome");
		newButtonSearch4Nome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new JanelaQuatro();
			}
		});
		newButtonSearch4Nome.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 14));
		newButtonSearch4Nome.setBackground(new Color(153, 153, 255));
		newButtonSearch4Nome.setBounds(334, 189, 250, 70);
		frame.getContentPane().add(newButtonSearch4Nome);
		
		newButtonEditarNotaAluno = new JButton("Editar nota do aluno");
		newButtonEditarNotaAluno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new JanelaSeis();
			}
		});
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

	@Override
	public void actionPerformed(ActionEvent arg0) {
		if(arg0.getSource()==this.newButtonCadastrarAluno) {
			new JanelaUm();
		}else if(arg0.getSource()==this.newButtonSearch4Matricula) {
			new JanelaDois();
		}else if(arg0.getSource()==this.newButtonSearch4Nome) {
			new JanelaQuatro();
		}else if(arg0.getSource()==this.newButtonExcluirAluno) {
			new JanelaTres();
		}else if(arg0.getSource()==this.newButtonEditarNotaAluno) {
			new JanelaSeis();
		}
	}
}