package unidad1.ejerciciosLibro;

import java.util.Scanner;

public class ActividadResuelta1p14 {

	public static void main(String[] args) {
		/* 
		 * Realizar un programa que pida como entrada un numero decimal y lo muestre redondeado al entero mas proximo.
		 */ 
		
		Scanner scanner = new Scanner (System.in);
		double numeroEntrada;
		int numeroRedondeado;
				
		System.out.println("Introduce un numero a redondear: ");
		numeroEntrada = scanner.nextDouble();

		numeroRedondeado = (int) (numeroEntrada + 0.5); // sumandole el 0.5 hacemos que a partir del 7,5 se considere 8,0.
		
		System.out.println("Redondeado a enteros es:  " + numeroRedondeado);

		scanner.close();
	}

}
