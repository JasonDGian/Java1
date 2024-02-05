package unidad1.bucles.ejemplosenclase;

import java.util.Scanner;

public class EjemploDoWhileBucleSumas {

	public static void main(String[] args) {
		// Hacemos un bucle que pide numeros por pantalla al usuario y los suma. El bucle acaba cuando el usuario introduce 0.
		// ademas debe de registrar el nimino y el maximo introducido por el usuario.
		
		Scanner sc = new  Scanner(System.in);	
				
		// en la clase integer tenemos utilidades para INT como el valor maximo y minimo.
		// es buena praxis inicializar las variables de minimo maximo de este modo.
		// AL MAXIMO LE DAMOS EL MINIMO Y AL MINIMO LE DAMOS EL MAXIMO: ESTO HARÁ QUE EL PRIMER NUMERO INTRODUCIDO SE REGISTRE SI Ó SI
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		int numero;
		int suma=0;
		
		
		
		// Al darse el hecho de que el bucle entra siempre, la petición de la variable va dentro.
		do {
			
			
			System.out.println("Introduce un numero para sumar. Si es zero se cerrará el bucle de suma despues de sumar.");
			numero = sc.nextInt();

			// nos interesa evaluar antes la opción que sea falso.
			if ((numero>max) && (numero!=0)) max=numero;
			if ((numero<min) && (numero!=0)) min=numero;
			
			suma+=numero;
			
			
		} while(numero!=0);
		
		
		System.out.println("El resultado de la suma es: " + suma);
		System.out.println("El maximo registrado es: " + max);
		System.out.println("El minimo registrado es: " + min);		
		
	}
	
}

