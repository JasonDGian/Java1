// Package the program belongs to.
package unidad1.bucles.ejercicios;

// Imports the scanner utility to read the user's input.
import java.util.Scanner;

//Program main public class.
public class Ejerciciobucles8 {

	// Program main entry point method.
	public static void main(String[] args) {
		/* 
		 * TODO Ejercicio 8. Escribir un programa que pida al usuario un número entero 
		 * positivo y muestre por pantalla todos los números impares desde 1 hasta ese número.
		*/
		
		// Instantiates a scanner object called 'scan'.
				Scanner scan = new Scanner(System.in); 
				
				int num; // Declare user input sotrage variable 'num'.
				
				// Prompt the user for an input.
				System.out.println("Enter a number: "); 
				
				// Stores users input in num variable.
				num = scan.nextInt();
				
				/*
				 * Start 'i' on value 0 and add 2 each iteration.
				 * Print the obtained value each iteration.
				 */
				for (int i=1; i<=num; i+=2) {
					
					// Print 'i' variable value.
					System.out.println(i);
						
				} // Close for loop.
			
				System.out.println("Done");
				scan.close(); // Scanner object closure. Done to prevent the alert message.

			} // Closes the main method.
		 
		} // Closes the program class.


