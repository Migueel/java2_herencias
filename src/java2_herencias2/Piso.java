package java2_herencias2;

public class Piso extends Vivienda{
	
	private int numPiso;
	private char letraPiso;
	
	//Constructor 
	public Piso(){super();}
	
	//Getters y Setters
	public int getNumPiso() {
		return numPiso;
	}

	public void setNumPiso(int numPiso) {
		this.numPiso = numPiso;
	}

	public char getLetraPiso() {
		return letraPiso;
	}

	public void setLetraPiso(char letraPiso) {
		this.letraPiso = letraPiso;
	}

}
