// Package the program belongs to.
package unidad1.bucles.ejercicios;

// Imports the scanner utility to read the user's input.
import java.util.Scanner;

//Program main public class.
public class Ejerciciobucles7 {

	// Program main entry point method.
	public static void main(String[] args) {
		// Ejercicio 7. Realizar un programa que muestre la tabla de multiplicar para un número
		
		// Instantiates a scanner object called 'scan'.
				Scanner scan = new Scanner(System.in); 
				
				int num; // Declare user input sotrage variable 'num'.
				
				// Prompt the user for an input.
				System.out.println("Enter a number: "); 
				
				// Stores users input in num variable.
				num = scan.nextInt(); 
				
				/*
				 * use 'i' variable in each iteration as a multiplier.
				 * iterate until 'i' reaches 10.
				 * each iteration does 'num * i' & 'i++'
				 */
				
				for (int i=1; i<=10; i++) {
					
					// Print operation message.
					System.out.println(num + " x " + i + " = " + num*i);
					
				} // Close for loop.
			
				scan.close(); // Scanner object closure. Done to prevent the alert message.

			} // Closes the main method.
		 
		} // Closes the program class.