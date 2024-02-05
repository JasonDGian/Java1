package unidad1.bucles.ejemplosenclase;

import java.util.Scanner;

public class EjerciciosMultiplosDe3Dinamico {

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
		
		// Instantiate a scanner object.
		Scanner scan = new Scanner(System.in);
		
		// Prompt the user for a number input.
		System.out.println("Introduce un numero para buscar los multiplos de 3.");
		
		// Store the input value in the 'num' variable.
		num = scan.nextInt();
			
		// Reduce the input number to the nearest multiple of 3.
		num=num-(num%3);
		
		for (int i=num; i>=3; i-=3) {
			
			System.out.println(i); // Prints the vlaue of 'i'
			
		}
		
		scan.close(); // Closes  scanner to calm alert message.

	} // Closes main method.

} // Closes program class. 
