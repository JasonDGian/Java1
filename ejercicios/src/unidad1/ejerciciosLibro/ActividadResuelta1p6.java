package unidad1.ejerciciosLibro;

import java.util.Scanner;

public class ActividadResuelta1p6 {

	public static void main(String[] args) {
		/* 
		 * Crear un aplicación que caclule la media aritmética de dos notas enteras. 
		 * Hay que tener en cuenta que la mendia peude contener decimales.
		 */ 
			
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Introduce un numero: ");
		
		int primerNumero = scanner.nextInt();
		
		System.out.println("Introduce otro numero: ");
		
		int segundoNumero = scanner.nextInt();
		
		double media = (primerNumero + segundoNumero) / 2.0;
		
		System.out.print("La media de los valores " + media);
		
		scanner.close();

	}

}
