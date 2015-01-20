package java2_herencias;

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
	@Override
	public void  vender(){
		super.vender();
		System.out.println("A la venta en 'Inmobiliaria Casas'"); 
	}
	
}

