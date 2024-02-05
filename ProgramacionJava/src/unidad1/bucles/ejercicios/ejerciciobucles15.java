// Package the program belongs to.
package unidad1.bucles.ejercicios;

//Importamos la clase Scanner para leer datos por CLI.
import java.util.Scanner;

public class ejerciciobucles15 {

	public static void main(String[] args) {
		/* 
		 * Ejercicio 15. Realizar un programa que recoja dos número por pantalla y a partir de un
		 * menú con un bucle calcule.
		 * 1. Suma
		 * 2. Resta
		 * 3. Multiplicación
		 * 4. División
		 * 5. Salir
		 */
		
		// Scanner object instantiation for input reads.
		Scanner scan = new Scanner(System.in);
		
		// Declare variables.
		int operation=0;
		int firstNumber = 0, secondNumber = 0;
		
		
		// The first time we enter the loop through the initialization of the operation variable.
		do {
			
			// Prompts the user for an input.
			System.out.println("Which operation do you wish to realize?");
			System.out.println("[1] Addition - [2] Substraction - [3] Muiltiplication - [4] Division - [5] - Exit program");
			
			// Stores the input value in a variable.
			operation = scan.nextInt();
			
			if (operation!=5) {
			// Prompt the user for the first number input.
			System.out.println("Input first operand: ");
			firstNumber = scan.nextInt(); // Stores the value in a variable called 'firstNumber'
			
			// Prompt the user for the second number input.
			System.out.println("Input second operand: ");
			secondNumber = scan.nextInt(); // Stores the value in a variable called 'secondNumber'
			}
			
			switch (operation) { // Evaluates operation variable for case application.
			
				case 1: // Case for addition.
					System.out.println("The result is; " + (firstNumber + secondNumber) + "\n____________________");
					break;
				case 2:  // Case for substraction.
					System.out.println("The result is; " + (firstNumber - secondNumber) + "\n____________________");
					break;
				case 3: //  Case for multiplication.
					System.out.println("The result is; " + (firstNumber * secondNumber) + "\n____________________");
					break;
				case 4: // Case for division.
					System.out.println("The result is; " + (firstNumber / secondNumber) + "\n____________________");
					break;
				case 5: // Case for exiting program.
					break;
					
				default: System.out.println("Unexcpected operation."); // Sort of an error catching case.
				
			} // Close the switch case.
			
			
			
		} while (operation != 5);  // Close the parent while loop.
		
		System.out.println("Exiting calculator.");

		scan.close(); // Close the scanner to calm the IDE error message.
		
	} // Close main entry point method.
 
} // Close program class
 