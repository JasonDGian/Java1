package unidad1.bucles.ejercicios;

import java.util.Scanner;

public class Ejerciciosbucles12 {

	public static void main(String[] args) {
		// Ejercicio 12. Escribir un programa que pida al usuario un número entero y muestre por
		// pantalla un triángulo rectángulo como el de más abajo, de altura el número introducido.

		Scanner scan = new Scanner(System.in);

		System.out.println("Introduce un numero entero; "); 
		
		int alturaArbol = scan.nextInt();

		for (int i=1; i<=alturaArbol; i++) {

			for (int j=1; j<=i; j++) {

				System.out.print("*");
				
			} // Cierra el for interno.

			System.out.println();
			
		} // Cierra el for principal.

		scan.close(); // Cierra scanner para calmar error IDE.
	} // Cierra el punto de entrada.

} // Cierra la clase principal.
