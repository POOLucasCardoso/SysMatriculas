package sys;

import java.util.HashMap;
import java.util.LinkedList;

public class SysPlanilha {

	private HashMap<String,Aluno> alunos = new HashMap<String,Aluno>();
	
	public SysPlanilha() {
		this.carregarDadosBasicos();
	}
	
	public void cadastrarAluno(Aluno aluno) throws AlunoJaCadastradoException{
		try {
			this.pesquisarAlunoPorMatricula(aluno.getMatricula());
		} catch (AlunoNaoCadastradoException e) {
			this.alunos.put(aluno.getMatricula(), aluno);
		}
	}
	
	public Aluno pesquisarAlunoPorMatricula(String matricula) throws AlunoNaoCadastradoException{
		
		if(!this.alunos.containsKey(matricula)) {
			this.carregarAluno(matricula);
		}
		return this.alunos.get(matricula);
	}
	
	public LinkedList<Aluno> pesquisarAlunosPorNome(String nome) throws AlunoNaoCadastradoException{
		
		LinkedList<Aluno> temp = new LinkedList<Aluno>();
		
		for(Aluno a: this.alunos.values()) {
			if(a.getNome().contains(nome)) {
				temp.add(a);
			}
		}
		for(Aluno a: this.carregarAlunosPorNome(nome)) {
			temp.add(a);
		}
		
		return temp;
	}
	
	public void editarNotaDoAluno(String matricula, NomesMateria materia, double nota, int unidade) throws AlunoNaoCadastradoException{
		this.alunos.get(matricula).cadastrarNota(materia, nota, unidade);
	}
	
	public void excluirAluno(String matricula) throws AlunoNaoCadastradoException{
		this.pesquisarAlunoPorMatricula(matricula);
		this.alunos.remove(matricula);
	}
	
	public void carregarDadosBasicos() {
		//TODO: implementar o load dos dados de matriculas
	}
	
	public void carregarAluno(String matricula)  throws AlunoNaoCadastradoException{
		//TODO: imlementar o lazyload de alunos
	}
	
	public LinkedList<Aluno> carregarAlunosPorNome(String nome) {
		return null;//TODO: imlementar o load de alunos
	}
	
	public void salvarDados() {
		//TODO: implementar o save de todos os dados em cache
	}

}
