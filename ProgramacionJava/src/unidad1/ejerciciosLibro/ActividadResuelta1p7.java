package unidad1.ejerciciosLibro;

import java.util.Scanner;

public class ActividadResuelta1p7 {

	public static void main(String[] args) {
		/* 
		 * Solicitar al usuario un numero y mediante booleano declarar si es par o no.
		 */ 
			
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Introduce un numero: ");
		
		int numero = scanner.nextInt();
		
		boolean esPar = (numero%2)==0;
		
		System.out.println("El numero introducido es par: " + esPar);
				
		scanner.close();

	}

}
