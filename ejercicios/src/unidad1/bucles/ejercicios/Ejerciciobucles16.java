package unidad1.bucles.ejercicios;

import java.util.Scanner;

public class Ejerciciobucles16 {

	public static void main(String[] args) {
		// Ejercicio 16 - Escribir un programa que calcule la lista de los N 
		// numeros primos con un menú como el de la imagen referenciada.

						
		// Iniciamos el objeto escaner.
		Scanner scan = new Scanner(System.in);
		
		
		
		System.out.println("Bienvenido, seleccione la opcion que desee mostrar.\n");
		
		System.out.println("1. Multiplos de 2");
		System.out.println("1. Multiplos de 3");
		System.out.println("1. Multiplos de 5");
		System.out.println("1. Multiplos de 7");
		System.out.println("1. Multiplos de 11");
		
		System.out.println("\nNota: Exclusivamente mostrará hasta el numero 100.");
		
		
		
		System.out.print("Su opción es: ");
		int opcion = scan.nextInt();
		
		
		
		scan.close();
	}

}
