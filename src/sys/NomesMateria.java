package sys;

public enum NomesMateria {
	MATEMATICA("Matematica"),
	POSTUGUES("Português"),
	GEOGRAFIA("Geografia"), 
	CIENCIAS("Ciências"),
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
