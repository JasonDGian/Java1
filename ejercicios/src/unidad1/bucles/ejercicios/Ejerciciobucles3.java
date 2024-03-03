// Package the program belongs to.
package unidad1.bucles.ejercicios;

// Imports the scanner utility to read the user's input.
import java.util.Scanner;

// Program main public class.
public class Ejerciciobucles3 {
	
	// Class main entry point method.
	public static void main(String[] args) {
		// TODO: Ejercicio 3. Crea un programa que muestre una cuenta atrás desde diez hasta cero.
		
		// Esta versión pide el numero por consola en lugar de partir desde 10.
		
		Scanner scan = new Scanner(System.in); // Instantiates a scanner object called 'scan'.
		
		int num; // Declare variable num.

		System.out.println("Enter a number: "); // Prompt the user for an input.
		num = scan.nextInt(); // Stores users input in num variable.

		
		/*
		 * The for loop will print out a count-down based on user input. 
		 * The 'i' variable is assigned the same value as the 'num' variable.
		 * A line is printed on the terminal and then then 'i' is decreased by one.
		 */
		
		for (int i=num; i>0; i--) { 
					
			System.out.println("Cuenta atras: " + i);
		}
		
		scan.close(); // Scanner object closure. Done to prevent the alert message.

	} 

}
