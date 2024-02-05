// Package the program belongs to.
package unidad1.bucles.ejercicios;

// Imports the scanner utility to read the user's input.
import java.util.Scanner;

// Program main public class.
public class Ejerciciobucles2 {
	
	// Class main entry point method.
	public static void main(String[] args) {
		// Ejercicio 2. Escribir un programa que recoja un numero n y escriba:
		
		// Instantiates a scanner object called 'scan'.
		Scanner scan = new Scanner(System.in); 
		
		int num; // declares variable num.

		System.out.println("Enter a number: ");
		num = scan.nextInt(); // Stores users input in num variable.

		
		/*
		 * The for loop will print out a sentence until the 'i' variable 
		 * reaches the same value that the user has entered in the 'num' variable..
		 */
		for (int i=1; i<=num; i++) { 
					
			System.out.println("Vuelta " + i);
		}
		
		scan.close(); // Scanner object closure. Done to prevent the alert message.

	} 

}
