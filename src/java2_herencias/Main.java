package java2_herencias;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Piso piso = new Piso();
		Casa casa = new Casa();
		Hashtable<String, String> datos = new Hashtable<String, String>();
		
		String calle, tipo, mostrar;
		int tamaño, habitaciones, numPiso, pisoCasa, antig;
		char letraPiso;
		
		System.out.println("Hola, introduce los siguientes datos de la vivienda: \n ");
		
		System.out.println("Tipo de vivienda: (Piso/Casa)");
		tipo = sc.next();
		
		datos.put("Tipo", tipo);
		
	if (tipo.equalsIgnoreCase("piso")) {
			
			System.out.println("Calle");
			calle = sc.next();
			
			datos.put("Calle", calle);
			piso.setDireccion(calle);
			
			
			System.out.println("Tamaño");
			tamaño = sc.nextInt();
			
			piso.setTamaño(tamaño);
			Integer tam = new Integer(piso.getTamaño());
			datos.put("Tamaño", tam.toString());
			
			System.out.println("Numero de habitaciones");
			habitaciones = sc.nextInt();
			
			piso.setNumHabit(habitaciones);
			Integer habi = new Integer(piso.getNumHabit());
			datos.put("Habitaciones", habi.toString());
			
			System.out.println("Planta");
			numPiso = sc.nextInt();
			
			piso.setNumPiso(numPiso);
			Integer plan = new Integer(piso.getNumHabit());
			datos.put("Planta", plan.toString());
			
			System.out.println("Puerta");
			letraPiso = sc.next().charAt(0);
			piso.setLetraPiso(letraPiso);
			datos.put("Puerta", String.valueOf(piso.getLetraPiso()));
			
			System.out.println("Datos del piso");
			System.out.println("**********************");
			System.out.println("\tCalle: " +datos.get("Calle"));
			System.out.println("\tPlanta: " +datos.get("Planta"));
			System.out.println("\tPuerta: " +datos.get("Puerta"));
			System.out.println("\tTamaño: " +datos.get("Tamaño"));
			System.out.println("\tNumero de habitaciones: " +datos.get("Habitaciones"));
			
			piso.vender();
		
		}
		if (tipo.equalsIgnoreCase("Casa")) {
			System.out.println("Calle");
			calle = sc.next();
			
			casa.setDireccion(calle);
			datos.put("Calle", calle);
			
			System.out.println("Tamaño");
			tamaño = sc.nextInt();
			
			casa.setTamaño(tamaño);
			Integer size = new Integer(casa.getTamaño());
			datos.put("Tamaño", size.toString());
			
			System.out.println("Numero de habitaciones");
			habitaciones = sc.nextInt();
			
			casa.setNumHabit(habitaciones);
			Integer room = new Integer(casa.getNumHabit());
			datos.put("Habitaciones", room.toString());
			
			System.out.println("Numero de pisos");
			pisoCasa = sc.nextInt();
			
			casa.setNumPisos(pisoCasa);
			Integer plantas = new Integer(casa.getNumHabit());
			datos.put("Pisos", plantas.toString());
			
			System.out.println("Antigüedad");
			antig = sc.nextInt();
			
			casa.setAntig(antig);
			Integer años = new Integer(casa.getNumHabit());
			datos.put("Antigüedad", años.toString());
			
			System.out.println("Datos de la casa");
			System.out.println("**********************");
			System.out.println("\tCalle: " +datos.get("Calle"));
			System.out.println("\tTamaño: " +datos.get("Tamaño"));
			System.out.println("\tAntigüedad: " +datos.get("Antigüedad"));
			System.out.println("\tNumero de pisos: " +datos.get("Pisos"));
			System.out.println("\tNumero de habitaciones: " +datos.get("Habitaciones"));
			
			casa.vender();
			
		}
		System.out.println("\nIntroduce 'mostrar' para mostrar Hashtable");
		mostrar = sc.next();
		
		if(mostrar.equalsIgnoreCase(mostrar)){
			System.out.println(datos);
		}
		else {
			System.out.println("Adiós");
		}

	}

}