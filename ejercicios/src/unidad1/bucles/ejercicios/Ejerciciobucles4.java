// Package the program belongs to.
package unidad1.bucles.ejercicios;

// Imports the scanner utility to read the user's input.
import java.util.Scanner;

// Program main public class.
public class Ejerciciobucles4 {
	
	// Class main entry point method.
	public static void main(String[] args) {
		/*
		 *  TODO: Ejercicio 4. Escribir un programa que calcule el factorial de un número N recogido por
		 *  pantalla y muestre el resultado. Mostramos en pantalla 4!= 24
		 */		 
	
		Scanner scan = new Scanner(System.in); // Instantiates a scanner object called 'scan'.
		
		int num; // Declare user input sotrage variable 'num'.
		int resultado=1; // Declara accumulator variable for loop iterations.

		System.out.println("Enter a number: "); // Prompt the user for an input.
		num = scan.nextInt(); // Stores users input in num variable.

		
		for (int i=1; i<=num; i++) { // Will iterate until 'i' is not equal to 'num'.

		resultado *= i; // Stores the result within 'resultado' accumulator variable.
		
		} // Closes for loop.
		
		System.out.println("!" + num + " = " + resultado); // Prints the result on the terminal.
		
		scan.close(); // Scanner object closure. Done to prevent the alert message.

	} // Closes the main method.
 
} // Closes the program class.
