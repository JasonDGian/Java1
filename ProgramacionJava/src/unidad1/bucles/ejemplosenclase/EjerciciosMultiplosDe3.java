package unidad1.bucles.ejemplosenclase;

import java.util.Scanner;

public class EjerciciosMultiplosDe3 {

	public static void main(String[] args) {
		// Ejercicios multiples de 3
		
		
		/*
		 * el programa va a coger un numero por pantalla
		 * luego mostrará desde N hasta 3 todos los multiplos de tres.
		 * 
		 * primero: normal con decremento 1
		 * 
		 * luego: programación dinámica para mejorar el algoritmo.
		 * para hacer decremento 3.
		 */
		
		// restas el resto al num  y a partir de ahi decrementar 3.
		
		
		
		// Declare variables.
		int num;	
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Introduce un numero para buscar los multiplos de 3.");
		num = scan.nextInt();
		
		for (int i=num; i>=3; i-=1) {
			
			if (i%3==0) { System.out.println(i); }			
			
		}

		scan.close(); // Closes  scanner to calm alert message.

	} // Closes main method.

} // Closes program class. 