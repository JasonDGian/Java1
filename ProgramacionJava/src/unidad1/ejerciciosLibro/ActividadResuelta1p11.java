package unidad1.ejerciciosLibro;

import java.util.Scanner;

public class ActividadResuelta1p11 {

	// Declaramos las constantes fuera del metodo de de entrada.


	public static void main(String[] args) {
		/* 
		 * Un frutero necesita calcular los beneficios anuales que obtiene de la venta de manzanas y peras. 
		 * Por este motivo es necesario diseñar una aplicacion que solicite las ventas en kilos de cada 
		 * semestre para cada fruta. La aplicacion mostrara el importe total sabiendo que el precio del 
		 * kilo de manzanas est´ña fijado en 2.35 y el kilo de peras en 1.95.
		 */ 
		final double PRECIO_MANZANAS = 2.35;
		final double PRECIO_PERAS = 1.95;
		
		// Instanciamos el escaner.
		Scanner scanner = new Scanner (System.in);
		
		// declaramos las vars.
		int manzanas, peras;
		
		// Solicitamos las ventas del primer semestre.
		System.out.println("¿Cuantas manzanas has vendido en el primer trimestre?");
		manzanas = scanner.nextInt();
		System.out.println("¿Cuantas peras has vendido en el primer trimestre?");
		peras = scanner.nextInt();
		
		// Solicitamos las ventas del segundo semestre.
		System.out.println("¿Cuantas manzanas has vendido en el segundo trimestre?");
		manzanas += scanner.nextInt();
		System.out.println("¿Cuantas peras has vendido en el segundo trimestre?");
		peras += scanner.nextInt();
		
		double total = (manzanas*PRECIO_MANZANAS) + (peras*PRECIO_PERAS);
		System.out.println("El total es de " + total);

		
		scanner.close();
	}

}
