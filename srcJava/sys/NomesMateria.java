package sys;

public enum NomesMateria {
	MATEMATICA("Matematica"),
	POSTUGUES("Portugu�s"),
	GEOGRAFIA("Geografia"), 
	CIENCIAS("Ci�ncias"),
	HISTORIA("Historia"), 
	ARTES("Artes"),;

	private String inString;
	
	NomesMateria(String nome) {
		this.inString = nome;
	}
	
	public String toString() {
		return this.inString;
	}
	
}
