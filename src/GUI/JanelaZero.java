package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.FileNotFoundException;
import java.io.IOException;

public class JanelaZero extends JFrame implements ActionListener,WindowListener{

	private JButton newButtonCadastrarAluno;
	private JButton newButtonSearch4Matricula;
	private JButton newButtonSearch4Nome;
	private JButton newButtonEditarNotaAluno;
	private JButton newButtonExcluirAluno;
	private JLabel lblNewLabel;
	private sys.SysPlanilha sistema;

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
					window.setVisible(true);
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
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		initialize();
		try {
			this.sistema = new sys.SysPlanilha();
		} catch (FileNotFoundException e) {
			JOptionPane.showMessageDialog(this, "Bem vindo ao programa de planilhas da "+this.lblNewLabel.getText(), 
					null, 1, null);
		} catch (IOException e) {
			JOptionPane.showMessageDialog(this, "Não foi possível ler os dados iniciais do programa, favor contatar um técnico", 
					null, 0, null);
			}
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		this.addWindowListener(this);
		this.getContentPane().setForeground(new Color(176, 224, 230));
		this.getContentPane().setBackground(new Color(211, 211, 211));
		this.setResizable(false);
		this.setBounds(100, 100, 600, 400);
		this.getContentPane().setLayout(null);
		
		newButtonCadastrarAluno = new JButton("Cadastrar aluno");
		newButtonCadastrarAluno.addActionListener(this);
		newButtonCadastrarAluno.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 15));
		newButtonCadastrarAluno.setForeground(new Color(0, 0, 0));
		newButtonCadastrarAluno.setBackground(new Color(153, 153, 255));
		newButtonCadastrarAluno.setBounds(10, 97, 250, 70);
		this.getContentPane().add(newButtonCadastrarAluno);
		
		newButtonExcluirAluno = new JButton("Excluir aluno");
		newButtonExcluirAluno.addActionListener(this);
		newButtonExcluirAluno.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 14));
		newButtonExcluirAluno.setBackground(new Color(153, 153, 255));
		newButtonExcluirAluno.setBounds(10, 189, 250, 70);
		this.getContentPane().add(newButtonExcluirAluno);
		
		JButton newButtonAlunosDevedores = new JButton("Aluno devedores");
		newButtonAlunosDevedores.setEnabled(false);
		newButtonAlunosDevedores.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 14));
		newButtonAlunosDevedores.setBackground(new Color(153, 153, 255));
		newButtonAlunosDevedores.setBounds(10, 281, 250, 70);
		this.getContentPane().add(newButtonAlunosDevedores);
		
		newButtonSearch4Matricula = new JButton("Pesquisar aluno por matr\u00EDcula");
		newButtonSearch4Matricula.addActionListener(this);
		newButtonSearch4Matricula.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 14));
		newButtonSearch4Matricula.setBackground(new Color(153, 153, 255));
		newButtonSearch4Matricula.setBounds(334, 97, 250, 70);
		this.getContentPane().add(newButtonSearch4Matricula);
		
		newButtonSearch4Nome = new JButton("Pesquisar aluno por nome");
		newButtonSearch4Nome.setEnabled(false);
		newButtonSearch4Nome.addActionListener(this);
		newButtonSearch4Nome.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 14));
		newButtonSearch4Nome.setBackground(new Color(153, 153, 255));
		newButtonSearch4Nome.setBounds(334, 189, 250, 70);
		this.getContentPane().add(newButtonSearch4Nome);
		
		newButtonEditarNotaAluno = new JButton("Editar nota do aluno");
		newButtonEditarNotaAluno.addActionListener(this);
		newButtonEditarNotaAluno.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 14));
		newButtonEditarNotaAluno.setBackground(new Color(153, 153, 255));
		newButtonEditarNotaAluno.setBounds(334, 281, 250, 70);
		this.getContentPane().add(newButtonEditarNotaAluno);
		
		lblNewLabel = new JLabel("ACADEMIA CHUUNIN");
		lblNewLabel.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(114, 6, 351, 34);
		this.getContentPane().add(lblNewLabel);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		if(arg0.getSource()==this.newButtonCadastrarAluno) {
			new JanelaUm(this.sistema);
		}else if(arg0.getSource()==this.newButtonSearch4Matricula) {
			new JanelaDois(this.sistema);
		}else if(arg0.getSource()==this.newButtonSearch4Nome) {
			new JanelaQuatro();
		}else if(arg0.getSource()==this.newButtonExcluirAluno) {
			new JanelaTres(this.sistema);
		}else if(arg0.getSource()==this.newButtonEditarNotaAluno) {
			new JanelaSeis(this.sistema);
		}
	}

	@Override
	public void windowActivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosed(WindowEvent arg0) {
		// TODO Auto-generated method stub
	}

	@Override
	public void windowClosing(WindowEvent arg0) {
		System.out.println("Saí");
		try {
			this.sistema.salvarDadosBasicos();
			this.sistema.salvarDados();
			System.exit(-1);
		}catch(Exception e){
			int conf = JOptionPane.showConfirmDialog(this, 
					"Ocorreu algum erro de sistema, os dados inseridos não serão salvos,\ndeseja sair assim mesmo?");
			if (conf == 0) {
				System.exit(-1);
			}
		}
		
		
	}

	@Override
	public void windowDeactivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowOpened(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}