package java2_herencias2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Piso piso = new Piso();
		Casa casa = new Casa();
		
		String calle, tipo;
		int tamaño, habitaciones, numPiso, pisoCasa, antig;
		char letraPiso;
		
		System.out.println("Hola, introduce los siguientes datos de la vivienda: \n ");
		
		System.out.println("Tipo de vivienda: (Piso/Casa)");
		tipo = sc.next();
		
		if (tipo.equalsIgnoreCase("piso")) {
			System.out.println("Calle");
			calle = sc.next();
			
			piso.setDireccion(calle);
			
			System.out.println("Tamaño");
			tamaño = sc.nextInt();
			
			piso.setTamaño(tamaño);
			
			System.out.println("Numero de habitaciones");
			habitaciones = sc.nextInt();
			
			piso.setNumHabit(habitaciones);
			
			System.out.println("Planta");
			numPiso = sc.nextInt();
			
			piso.setNumPiso(numPiso);
			
			System.out.println("Puerta");
			letraPiso = sc.next().charAt(0);
			
			piso.setLetraPiso(letraPiso);
			
			System.out.println("Datos de la vivenda");
			System.out.println("**********************");
			System.out.println("\tTipo: " +tipo );
			System.out.println("\tCalle: " +piso.getDireccion());
			System.out.println("\tPlanta: " +piso.getNumPiso());
			System.out.println("\tPuerta: " +piso.getLetraPiso());
			System.out.println("\tTamaño: " +piso.getTamaño());
			System.out.println("\tNumero de habitaciones: " +piso.getNumHabit());
		
		}
		if (tipo.equalsIgnoreCase("Casa")) {
			System.out.println("Calle");
			calle = sc.next();
			
			casa.setDireccion(calle);
			
			System.out.println("Tamaño");
			tamaño = sc.nextInt();
			
			casa.setTamaño(tamaño);
			
			System.out.println("Numero de habitaciones");
			habitaciones = sc.nextInt();
			
			casa.setNumHabit(habitaciones);
			
			System.out.println("Numero de pisos");
			pisoCasa = sc.nextInt();
			
			casa.setNumPisos(pisoCasa);
			
			System.out.println("Antigüedad");
			antig = sc.nextInt();
			
			casa.setAntig(antig);
			
			System.out.println("Datos de la vivenda");
			System.out.println("**********************");
			System.out.println("\tTipo: " +tipo );
			System.out.println("\tCalle: " +casa.getDireccion());
			System.out.println("\tPlanta: " +casa.getNumPiso());
			System.out.println("\tPuerta: " +casa.getLetraPiso());
			System.out.println("\tTamaño: " +casa.getTamaño());
			System.out.println("\tNumero de habitaciones: " +casa.getNumHabit());
			System.out.println("\tAntigüedad : " +casa.getAntig());
			
		}
		

	}

}
