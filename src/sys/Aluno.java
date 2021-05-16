package sys;
import java.util.Date;
import java.util.LinkedList;

public class Aluno {
	
	public static final int NUM_NOTAS = 3;
	private static int MATRICULA_COUNT = 1;
	
	private static String geradorDeMatricula() {
		String matricula = String.format("%08d", Aluno.MATRICULA_COUNT);
		Aluno.MATRICULA_COUNT++;
		return matricula;
		
	}
	
	private String matricula;
	private String nome;
	private Date nascimento; //data de nascimento
	private LinkedList<Materia> materias;
	
	public Aluno(String nome, Date nascimento) {
		this.nome = nome;
		this.nascimento = nascimento;
		this.matricula = Aluno.geradorDeMatricula();
		for(NomesMateria m: NomesMateria.values()) {
			this.materias.add(new Materia(Aluno.NUM_NOTAS, m));
		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getNascimento() {
		return nascimento;
	}

	public void setNascimento(Date nascimento) {
		this.nascimento = nascimento;
	}

	public String getMatricula() {
		return matricula;
	}

}
