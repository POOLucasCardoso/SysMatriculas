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
	
	public void cadastrarNota(double nota, int unidade) {
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
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
		Materia other = (Materia) obj;
		if (nome != other.nome)
			return false;
		return true;
	}

}
