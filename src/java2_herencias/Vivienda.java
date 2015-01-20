package java2_herencias;

public class Vivienda {
	
	private int tamaño, numHabit;
	private String direccion;
	
	
	//Constructor
	public Vivienda(){}
	
	//Getters y Setters
	public int getTamaño() {
		return tamaño;
	}
	public void setTamaño(int tamaño) {
		this.tamaño = tamaño;
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
		System.out.println("\nEsta vivienda está a la venta.");
	}
	
}