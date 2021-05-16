package sys;

public class Materia {
	
	private NomesMateria nome;
	private double[] notas;

	public Materia(int quantNotas, NomesMateria nome) {
		this.nome = nome;
		this.notas = new double[quantNotas];
		for(int i=0; i< this.notas.length;i++) {
			this.notas[i] = -1;
		}
	}
	
	public void cadastrarNota(int unidade, double nota) {
		this.notas[unidade-1] = nota;
	}
	
	public double calcularMedia() throws NotasNaoCadastradasException {
		double sum = 0;
		for(double n: this.notas) {
			if(n<0) {
				throw new NotasNaoCadastradasException("Uma ou mais notas ainda não foram cadastradas.");
			}
			sum+=n;
		}
		return((sum)/(this.notas.length));
	}
	
	public double[] getNotas() {
		return this.notas;
	}
	
	public NomesMateria getNome() {
		return this.nome;
	}

}
