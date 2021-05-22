package sys;

public enum NomesMateria {
	MATEMATICA("Matematica"),
	POSTUGUES("PortuguÍs"),
	GEOGRAFIA("Geografia"), 
	CIENCIAS("CiÍncias"),
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
