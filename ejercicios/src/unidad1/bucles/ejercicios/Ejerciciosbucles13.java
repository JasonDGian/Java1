package unidad1.bucles.ejercicios;

import java.util.Scanner;

public class Ejerciciosbucles13 {

	public static void main(String[] args) {
		// Ejercicio 13. Escribir un programa que pida al usuario un número entero y
		// muestre por pantalla un triángulo rectángulo como el de más abajo, de 
		// altura el número introducido.

		/* 
		 * El bucle interno ciclará hasta que 'j' llegue a 1.
		 * Cada ciclo interno decrementará 1 a 'j'.
		 * 'j' equivale a i, i va aumentando cada ciclo padre ahsta llegar a altura.
		 */
		
		
		Scanner scan = new Scanner(System.in); 

		// Solicita el numero para la altura.
		System.out.println("Introduce un numero entero; "); 
		
		// Almacena el valor en una variable.
		int altura = scan.nextInt(); 
		
		// El bucle se repite tantas veces como definido en la variable.
		for (int i=1; i<=altura; i++) { 
		 
			for ( int j=i; j>=1; j-- ) { // J empieza desde valor i y el bucle continua hasta que j llegue a 1. 
				
				System.out.print( (2*j)-1 + " " ); // Doble de J menos 1 por pantalla.

			} // Cierra el bucle interno.
			 
			System.out.println(); //Introduce un retorno carro.
		
		}  // Cierra el bucle externo.

		scan.close(); 
	}

}
