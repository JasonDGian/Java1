package unidad1.bucles.ejerciciosextra;

import java.util.Scanner;

public class ejercicioRefuerzo10 {

	public static void main(String[] args) {
		/*
		 * Ejercicio 10. Hace un programa que recogidas las filas y las columnas por teclado dibuje una
		 * tabla de corchetes como la siguiente. Por ejemplo si las filas son 6 y las columnas 5 el
		 * resultado sería. Usar el carácter \t para hacer el tabulador. Usad bucles anidados
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("introduce el numero de columnas.");
		int columnas = scan.nextInt();
		System.out.println("introduce el numero de filas.");
		int filas = scan.nextInt();
				
		for (int i = 1; i <= filas; i++) { // Comparamos 'i' a la variable de filas.
						
			for (int j = 1; j <= columnas; j++) { // Comparamos 'i'  a la variable de columnas.

				System.out.print("#\t");

			}
			
			System.out.println();
			
		}

	}

}
