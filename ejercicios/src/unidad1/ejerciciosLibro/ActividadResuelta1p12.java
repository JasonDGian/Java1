package unidad1.ejerciciosLibro;

import java.util.Scanner;

public class ActividadResuelta1p12 {

	// Declaramos las constantes fuera del metodo de de entrada.


	public static void main(String[] args) {
		/* 
		 * Escribir un programa que pida un numero al usuario y muestre su valor absoluto.
		 */ 
		
		// Instanciamos el escaner.
		Scanner scanner = new Scanner (System.in);
		
		int numero;
		
		// Solicitamos las ventas del primer semestre.
		System.out.println("Introduce un numero.");
		numero = scanner.nextInt();

		int absoluto = numero < 0 ? numero*-1 : numero; 
		// Con el operador ternario miramos si el numero introducido es inferior a 0
		// Esto significaria que es un numero negativo, asi que multiplicamos por -1 para resolverlo a positivo.
		System.out.println("El valor absoluto de " + numero + " es " + absoluto);
		
		scanner.close();
	}

}
