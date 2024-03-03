package unidad1.ejerciciosLibro;

import java.util.Scanner;

public class ActividadResuelta1p2 {

	public static void main(String[] args) {
		// Diseñar un programa que pida un numero al usuario por teclado y a continuación lo muestre por consola.
		
		System.out.println("Introduce un numero.");
		
		Scanner scanner = new Scanner (System.in);
		
		int numero = scanner.nextInt();
		
		System.out.print(numero);
		
		scanner.close();
	}

}
