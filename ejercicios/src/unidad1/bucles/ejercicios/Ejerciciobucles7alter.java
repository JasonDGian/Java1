// Paquete al que pertenece la clase del programa.
package unidad1.bucles.ejercicios;

//Importamos la clase Scanner para leer datos por CLI.
import java.util.Scanner;

// Clase del programa.
public class Ejerciciobucles7alter {
	
	// Metodo de entrada principal a ejecución del programa.
	public static void main(String[] args) {
		// Realizar un programa que sume n números recogidos por pantalla hasta que el número introducido sea cero.

		// Instanciamos un objeto Scanner para leer la entrada del usuario.
		Scanner sc = new Scanner(System.in);
		
		int numeroUsuario; // variable de entrada de datos.
		int contador=1; // variable contadora

		
		// Informamos al usuario de que debe introducir un numero.
		System.out.println("Introduce un numero para realizar la tabla:");
		
		// Almacenamos el numermo introduciro en una variable.
		numeroUsuario = sc.nextInt();
		
		// Entramos a ejecución tras solicitar un numero.
		do {
			
			// Mostramos el resultado de la operación de la iteración.
			System.out.println(numeroUsuario + " x " + contador + " = " + (numeroUsuario*contador));

			// Incremento en contador.
			contador++;
			
				
		// Testeamos si la condición de salida se cumple.
		} while (contador<=10);
		
		sc.close(); // Cerramos el scanner para calmar el mensaje de error del IDE.
	}

}
