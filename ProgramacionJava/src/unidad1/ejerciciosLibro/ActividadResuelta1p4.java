package unidad1.ejerciciosLibro;

import java.util.Scanner;

public class ActividadResuelta1p4 {

	// Declaramos las constantes fuera del metodo de de entrada.


	public static void main(String[] args) {
		/* 
		 * Pedir al usuario su año de nacimiento y calcular la edad que tendra si ya ha cumplido años este año.
		 */ 
		
		// Instanciamos el escaner.
		Scanner scanner = new Scanner (System.in);
		
		// declaramos las vars.
		int aNacimiento, aActual;
		
		// Solicitamos las ventas del primer semestre.
		System.out.println("¿En qué año naciste?");
		aNacimiento = scanner.nextInt();
		System.out.println("¿En qué año estamos?");
		aActual = scanner.nextInt();
		
		int edad = aActual - aNacimiento;
		
		// Solicitamos las ventas del segundo semestre.
		System.out.println("La edad del usuario es: " + edad);


		
		scanner.close();
	}

}
