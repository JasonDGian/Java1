// Package the program belongs to.
package unidad1.bucles.ejercicios;

// Imports the scanner utility to read the user's input.
import java.util.Scanner;

// Program main public class.
public class Ejerciciobucles5 {
	
	// Class main entry point method.
	public static void main(String[] args) {
		/*
		 *  TODO: Ejercicio 5. Escribir un programa que sume del numero 1 al n con un bucle
		 */		 
		
		// Instantiates a scanner object called 'scan'.
		Scanner scan = new Scanner(System.in); 
		
		int num; // Declare user input sotrage variable 'num'.
		int resultado=0; // Declare accumulator variable for loop iterations.

		// Prompt the user for an input.
		System.out.println("Enter a number: "); 
		
		// Stores users input in num variable.
		num = scan.nextInt(); 

		/*
		 * Loop must sum numbers from 1 to num.
		 * Do this through accumulator variable.
		 * Initialize 'resultado' at 0 and the sum 'i' to it iterating and increasing.
		 */
		for (int i=1; i<=num; i++) {
			
			// Print operation on terminal.
			System.out.println(resultado + "+" +  i + "=" + (resultado+i));
			
			// Execute calculation within code.
			resultado += i;				
		
		} // Closes for loop.
		
		System.out.println("Resultado final: " + resultado); // Prints the result on the terminal.
		
		scan.close(); // Scanner object closure. Done to prevent the alert message.

	} // Closes the main method.
 
} // Closes the program class.
