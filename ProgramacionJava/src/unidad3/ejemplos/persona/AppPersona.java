package unidad3.ejemplos.persona;

import java.util.Scanner;

public class AppPersona {
	
	static boolean enEjecucion = false;
	
	static int variableObjeto=0;
	
	static {
		
		enEjecucion=true;
		
	}
	
	static boolean estaEnEjecucion() {
		return enEjecucion;
	}
	
	public int devuelveVariableObjeto() {
		return variableObjeto;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(AppPersona.enEjecucion);
		
		Scanner sc = new Scanner (System.in);
		
		Persona Jesus = new Persona("Jesús", "Soto", 456, 2004);
		
		System.out.println(Jesus);
		
		System.out.println("Personas creadas " + Persona.getNumPersonas());
		
		Persona alumno = new Persona();
		
		System.out.println("Introduce el nombre.");
		alumno.setNombre(sc.nextLine());
		
		System.out.println("Introduce el apellido.");
		alumno.setApellidos(sc.nextLine());
		
		System.out.println("Introduce el ID.");
		alumno.setId(sc.nextLong());
		
		System.out.println("Introduce el año de nacimiento.");
		alumno.setAnoNacimiento(sc.nextInt());
		
		System.out.println(alumno);
		
		System.out.println(alumno.calculaEdad(2024));

	}

}
