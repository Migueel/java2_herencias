package java2_herencias2;

public class Casa extends Vivienda {
	
	private int numPisos, antig;

	//Constructor
	public Casa(){super();}
	
	//Getters y Setters
	public int getNumPisos() {
		return numPisos;
	}

	public void setNumPisos(int numPisos) {
		this.numPisos = numPisos;
	}

	public int getAntig() {
		return antig;
	}

	public void setAntig(int antig) {
		this.antig = antig;
	}

} 