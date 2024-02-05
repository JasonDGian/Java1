// Package the program belongs to.
package unidad1.bucles.ejercicios;

// Imports the scanner utility to read the user's input.
import java.util.Scanner;

//Program main public class.
public class Ejerciciobucles10 {

	// Program main entry point method.
	public static void main(String[] args) {
		//TODO Ejercicio 10. Escribir un programa que dado un número nos diga si es primo o no lo es.
		
		// Instantiates a scanner object called 'scan'.
				Scanner scan = new Scanner(System.in); 
				
				int num; // Declare user input sotrage variable 'num'.
				boolean esPrimo = true; // Declare control variable.
								
				// Prompt the user for an input.
				System.out.println("Enter a number: "); 
				
				// Stores users input in num variable.
				num = scan.nextInt(); 
				
				
				/*
				 * Take a number, check if it is divisible by each number until you reach half of itself
				 * configure a control variable until then.
				 * 
				 * NOTE: Check divisions only up to half of the number itself because is the maximum 
				 * number that it can be divided by.
				 */
				for (int i = 2; i<=(num/2); i++ ) {
					
					System.out.println(num + ":" + i + "=" + ((double)num/i) ); // Optional operation report.
					
					if (num%i==0) { esPrimo = false; break;} // If 'num' is divisible by 'i' then set esPrimo to 'false'.
					
				} // Close for loop.
			
				// Result report on terminal.
				System.out.println("El numero es primo: " + esPrimo);
				
				scan.close(); // Scanner object closure. Done to prevent the alert message.

			} // Closes the main method.
		 
		} // Closes the program class.