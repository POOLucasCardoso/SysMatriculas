package sys;

import java.util.LinkedList;

public class SysPlanilha {

	private LinkedList<Aluno> alunos = new LinkedList<Aluno>();
	
	public SysPlanilha() {
		this.carregarDadosBasicos();
	}
	
	public void cadastrarAluno(Aluno aluno) throws AlunoJaCadastradoException{
		
	}
	
	public Aluno pesquisarAlunoPorMatricula(String matricula) throws AlunoNaoCadastradoException{
		return null;
	}
	
	public Aluno pesquisarAlunoPorNome(String matricula) throws AlunoNaoCadastradoException{
		return null;
	}
	
	public void editarNotaDoAluno(String matricula, NomesMateria materia, double nota) throws AlunoNaoCadastradoException{
		
	}
	
	public void excluirAluno(String matricula) throws AlunoNaoCadastradoException{
		
	}
	
	public void carregarDadosBasicos() {
		//TODO: implementar o load dos dados de matriculas
	}
	
	public void carregarAluno(String matricula)  throws AlunoNaoCadastradoException{
		//TODO: imlementar o lazyload de alunos
	}
	
	public void salvarDados() {
		//TODO: implementar o save de todos os dados em cache
	}

}
