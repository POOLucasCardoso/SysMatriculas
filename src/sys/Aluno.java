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
	
	public void cadastrarNota(NomesMateria materia, double nota, int unidade) {
		for(Materia m: this.materias) {
			if(m.getNome().equals(materia)) {
				m.cadastrarNota(nota, unidade);
			}
		}
	}
	
	public LinkedList<Materia> exibirNotas(){
		return this.materias;
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
	
	public String toString() {
		return "Aluno: "+this.nome+", Matrícula: "+this.matricula;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((matricula == null) ? 0 : matricula.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		if (matricula == null) {
			if (other.matricula != null)
				return false;
		} else if (!matricula.equals(other.matricula))
			return false;
		return true;
	}

}
