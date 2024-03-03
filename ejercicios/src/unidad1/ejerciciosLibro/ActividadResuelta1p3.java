package unidad1.ejerciciosLibro;

import java.util.Scanner;

public class ActividadResuelta1p3 {

	public static void main(String[] args) {
		// Pedir al usuario su edad y mostrar la que tendrá el próximo año.
		
		System.out.println("Introduce tu edad actual.");
		
		Scanner scanner = new Scanner (System.in);
		
		int edadUsuario = scanner.nextInt();
		
		edadUsuario++;
		
		System.out.print(edadUsuario);
		
		scanner.close();
	}

}
