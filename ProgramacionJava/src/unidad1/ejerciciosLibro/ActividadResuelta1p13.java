package unidad1.ejerciciosLibro;

import java.util.Scanner;

public class ActividadResuelta1p13 {

	public static void main(String[] args) {
		/* 
		 * Escribir un programa que solitice las notas del primer, segundo y tercer trimestre. Solicitud en forma de enteros.
		 * El programa debe de mostrar la media del curso como se utiliza en el boletin de calificaciones, solo la parte entera, 
		 * y como se usa en el expediente academico, con decimales.
		 */ 
		
		Scanner scanner = new Scanner (System.in);
		
		int notaPrimerTrim, notaSegundoTrim, notaTercerTrim;
		double mediaNotas;
		int mediaNotasEntero;
		System.out.println("Primer trimestre: ");
		notaPrimerTrim = scanner.nextInt();
		
		System.out.println("Segundo trimestre: ");
		notaSegundoTrim = scanner.nextInt();
		
		System.out.println("Tercer trimestre: ");
		notaTercerTrim = scanner.nextInt();
		
		mediaNotas = (notaPrimerTrim + notaSegundoTrim + notaTercerTrim) / 3.0;
		mediaNotasEntero = (int) mediaNotas;

		System.out.println("Las notas son: \nPara boletín: " + mediaNotas + "\nPara calificación: " + mediaNotasEntero);
		
		scanner.close();
	}

}
