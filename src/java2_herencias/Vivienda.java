package java2_herencias;

public class Vivienda {
	
	private int tama�o, numHabit;
	private String direccion;
	
	
	//Constructor
	public Vivienda(){}
	
	//Getters y Setters
	public int getTama�o() {
		return tama�o;
	}
	public void setTama�o(int tama�o) {
		this.tama�o = tama�o;
	}
	public int getNumHabit() {
		return numHabit;
	}
	public void setNumHabit(int numHabit) {
		this.numHabit = numHabit;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public void vender(){
		System.out.println("\nEsta vivienda est� a la venta.");
	}
	
}