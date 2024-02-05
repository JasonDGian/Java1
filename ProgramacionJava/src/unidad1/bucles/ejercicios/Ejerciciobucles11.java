package unidad1.bucles.ejercicios;

import java.util.Scanner;

public class Ejerciciobucles11 {

	public static void main(String[] args) {
		// TODO Realizar un programa que muestre los n primeros múltiplos de 2,3,5,7,11

		// cogemos el numero
		// mostramos el numero multiplicado por 1 , 2 , 3 hasta llegar al numero
		// introducido.
		
		// Lo primero es encontrar los numeros primos hasta 11
		// Luego con esos numeros primos multiplicarlos cada uno por el multiplicador alimentado por el usuario.

		System.out.println("¿Cuántos múltiplos deseas ver?");
		Scanner scan = new Scanner(System.in);

		int multiplicador = scan.nextInt();
		int numero = 11;

		boolean prime;

		// Bucle que incrementa el numero alimentado a bucle de control de primos.
		for (int i = 2; i <= numero; i++) {

			// Al testear un nuevo numero se reinicia la variable de control primo a true.
			prime = true;

			// Bucle de control de primos.
			for (int j = 2; j <= (i / 2); j++) {

				// Altera variable de control si encuentra un numero no primo y rompe el bucle.
				if (i % j == 0) {
					prime = false;
					break;
				}
				

			} // Cierra bucle de control primo.

			// Bucle de multiplicacion de numero SOLO SI ES PRIMO.
			if (prime) {

				// Multiplica hasta coincidir con el nuemro alimentado por el usuario.
				for (int k = 1; k <= multiplicador; k++) {
					
					// Muestra operacion por pantalla.
					System.out.println(i + " x " + k + " = " + (i * k));

				}
				System.out.println("------");

			} // Cierra bucle de multiplicacion.

		} // Cierra bucle principal que alimenta numero
		
		scan.close(); // Cierra el scanner para calmar el mensaje de error del IDE.

	} // Cierra punto de entrada principal a programa. 

} // Cierra clase principal de programa.

