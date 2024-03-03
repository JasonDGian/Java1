// Package the program belongs to.
package unidad1.bucles.ejercicios;

// Imports the scanner utility to read the user's input.
import java.util.Scanner;

// Program main public class.
public class Ejerciciobucles6 {
	
	// Class main entry point method.
	public static void main(String[] args) {
		/*
		 *  TODO: Ejercicio 6. Realizar un programa que sume n números 
		 *  recogidos por pantalla hasta que el número introducido sea cero.
		 */		 
		
		// Instantiates a scanner object called 'scan'.
		Scanner scan = new Scanner(System.in); 
		
		int num, sum = 0; // Declare user input sotrage variable 'num' and 'sum'.
		
		// Prompt the user for an input.
		System.out.println("Enter a number: "); 
		
		// Stores users input in num variable.
		num = scan.nextInt(); 
		
		while (num != 0) {  // Until the user enters 0 as a value, the program will stay in loop.
			
			// Accumulate and store the num input in sum variable.
			sum = sum+num;
			
			// Report current result.
			System.out.println(sum);
			
			// Prompt the user for another input.
			System.out.println("Enter a number to sum: ");
			
			// Stores users input in num variable.
			num = scan.nextInt(); 
		
		}
		
		System.out.println("Saliendo de calculadora.\nResultado; " + sum); // Print exit message + result.
				
		scan.close(); // Scanner object closure. Done to prevent the alert message.

	} // Closes the main method.
 
} // Closes the program class.
