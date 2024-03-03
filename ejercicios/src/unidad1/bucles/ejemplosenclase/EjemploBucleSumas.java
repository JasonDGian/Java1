package unidad1.bucles.ejemplosenclase;

import java.util.Scanner;

public class EjemploBucleSumas {

	public static void main(String[] args) {
		// Hacemos un bucle que pide numeros por pantalla al usuario y los suma. El bucle acaba cuando el usuario introduce 0.
		// ademas debe de registrar el nimino y el maximo introducido por el usuario.
		
		Scanner sc = new  Scanner(System.in);

		int numero;
		int suma=0;
		
		// Introducir variable de Maximo y Minimo registrado.

		
		
		System.out.println("Introduce un distinto a 0 para sumar.");
		numero = sc.nextInt();
		
		int min = numero;
		int max = numero;
		
		while (numero!=0) {
			
			suma=suma+numero;
			System.out.println("Introduce un distinto a 0 para sumar.");
			numero = sc.nextInt();
			
			if (numero>max) max=numero;
			if ((numero<min) && (numero!=0)) min=numero;
			
			
		}
		
		System.out.println("El resultado de la suma es: " + suma);
		System.out.println("El maximo registrado es: " + max);
		System.out.println("El minimo registrado es: " + min);
		
		
	}

}
