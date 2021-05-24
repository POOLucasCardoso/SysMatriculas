package sys;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedList;

public class SysPlanilha {
	
	private static final String ARQUIVO_DE_FICHAS = "files.csv";
	private static final String ARQUIVO_DE_DADOS  = "data.csv";

	private HashMap<String,Aluno> alunos = new HashMap<String,Aluno>();
	
	public SysPlanilha() throws IOException {
		this.carregarDadosBasicos();
	}
	
	public void cadastrarAluno(Aluno aluno) throws AlunoJaCadastradoException, IOException{
		try {
			this.pesquisarAlunoPorMatricula(aluno.getMatricula());
			throw new AlunoJaCadastradoException("Já existe um aluno com essa matrícula cadastrada.");
		} catch (AlunoNaoCadastradoException e) {
			this.alunos.put(aluno.getMatricula(), aluno);
		}
	}
	
	public Aluno pesquisarAlunoPorMatricula(String matricula) throws AlunoNaoCadastradoException, IOException{
		
		if(!this.alunos.containsKey(matricula)) {
			this.carregarAluno(matricula);
		}
		return this.alunos.get(matricula);
	}
	
	public LinkedList<Aluno> pesquisarAlunosPorNome(String nome) throws AlunoNaoCadastradoException, IOException{
		
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
	
	public void excluirAluno(String matricula) throws AlunoNaoCadastradoException, IOException{
		this.pesquisarAlunoPorMatricula(matricula);
		this.alunos.remove(matricula);
	}
	
	public void carregarDadosBasicos() throws IOException{/*
		BufferedReader leitor = null;
		String[] dados = null;
		try {
			leitor = new BufferedReader(new FileReader(SysPlanilha.ARQUIVO_DE_DADOS));
			dados = leitor.readLine().split(",");
			Aluno.NUM_NOTAS = Integer.parseInt(dados[0]);
			Aluno.MATRICULA_COUNT = Integer.parseInt(dados[1]);
		}finally{
			if(leitor!=null){
				leitor.close();
			}
		}
	*/}
	
	public void salvarDadosBasicos() throws IOException {/*
		BufferedWriter gravador = null;
		String linha = "quantNotas,matriculaCount\n";
		linha+= Aluno.NUM_NOTAS+","+Aluno.MATRICULA_COUNT;
		
		try {
			gravador = new BufferedWriter( new FileWriter (SysPlanilha.ARQUIVO_DE_DADOS));
			gravador.write(linha);
		}finally{
			if(gravador!=null){
				gravador.close();
			}
		}
	*/}
	
	public void carregarAluno(String matricula)  throws AlunoNaoCadastradoException, IOException{
		throw new AlunoNaoCadastradoException("Não existe nenhum aluno no banco de dados com a matrícula "+matricula);/*
		BufferedReader leitor = null;
		String[] dados = null;
		boolean achado = false;
		try {
			leitor = new BufferedReader(new FileReader(SysPlanilha.ARQUIVO_DE_FICHAS));
			dados = leitor.readLine().split(",");
			while(dados!=null){
				dados = leitor.readLine().split(",");
				if(dados[0].equals(matricula)) {
					Aluno temp = new Aluno(dados[0], dados[1], dados[2]);
					for(int i=1;i<=NomesMateria.values().length;i++) {
						for(int j=1;j<=Aluno.NUM_NOTAS;j++) {
							temp.cadastrarNota(NomesMateria.values()[i], Double.parseDouble(dados[(j*i)+2]), j);
						}
					}
					this.alunos.put(matricula, temp);
					achado = true;
					break;
				}
			}
			if(!achado) {
				throw new AlunoNaoCadastradoException("Não existe nenhum aluno no banco de dados com a matrícula "+matricula);
			}
		}finally{
			if(leitor!=null){
				leitor.close();
			}
		}
	*/}
	
	public LinkedList<Aluno> carregarAlunosPorNome(String nome) throws IOException {return new LinkedList<Aluno>();/*
		BufferedReader leitor = null;
		String[] dados = null;
		LinkedList<Aluno> achados = new LinkedList<Aluno>();
		try {
			leitor = new BufferedReader(new FileReader(SysPlanilha.ARQUIVO_DE_FICHAS));
			dados = leitor.readLine().split(",");
			while(dados!=null){
				dados = leitor.readLine().split(",");
				if(dados[1].startsWith(nome)) {
					Aluno temp = new Aluno(dados[0], dados[1], dados[2]);
					for(int i=1;i<=NomesMateria.values().length;i++) {
						for(int j=1;j<=Aluno.NUM_NOTAS;j++) {
							temp.cadastrarNota(NomesMateria.values()[i], Double.parseDouble(dados[(j*i)+2]), j);
						}
					}
					achados.add(temp);
				}
			}
		}finally{
			if(leitor!=null){
				leitor.close();
			}
		}
		
		return achados;
	*/}
	
	public void salvarDados() throws IOException {/*
		BufferedWriter gravador = null;
		String linha = "matrícula,nome,nascimento,";
		for(NomesMateria m: NomesMateria.values()) {
			for(int i=1;i<=Aluno.NUM_NOTAS;i++) {
				linha+=m.toString()+":nota"+i+",";
			}
		}
		try {
			gravador = new BufferedWriter( new FileWriter (SysPlanilha.ARQUIVO_DE_FICHAS));
			gravador.write(linha+"\n");
			for (Aluno a: this.alunos.values()){
				linha = a.getMatricula()+","+a.getNome()+","+a.getNascimento()+",";
				for(Materia m: a.exibirNotas()) {
					for(double n: m.getNotas()) {
						linha+=n+",";
					}
				}
				gravador.write(linha+"\n");
			}
		}finally{
			if(gravador!=null){
				gravador.close();
			}
		}
	*/}
}
