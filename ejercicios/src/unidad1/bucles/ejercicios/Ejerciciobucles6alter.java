// Paquete al que pertenece la clase del programa.
package unidad1.bucles.ejercicios;

//Importamos la clase Scanner para leer datos por CLI.
import java.util.Scanner;

// Clase del programa.
public class Ejerciciobucles6alter {
	
	// Metodo de entrada principal a ejecución del programa.
	public static void main(String[] args) {
		// Realizar un programa que sume n números recogidos por pantalla hasta que el número introducido sea cero.
				
		/*
		 * El usuario introduce un numero que se almacena en variable numeroUsuario
		 * El programa entrará en un bucle a no ser que el numero introducido por el usuario sea 0.
		 * 
		 */
		

		// Instanciamos un objeto Scanner para leer la entrada del usuario.
		Scanner sc = new Scanner(System.in);
		
		int numeroUsuario, acumulador =0;
		
		
		// Entramos a ejecución para solicitar un numero.
		do {
			// Informamos al usuario de que debe introducir un numero.
			System.out.println("Introduce un numero:");
			
			// Almacenamos el numermo introduciro en una variable.
			numeroUsuario = sc.nextInt();
			
			// Acumulamos ese numero introducido en la variable acumuladora.
			acumulador+=numeroUsuario;
			
			// Podemos optar por informar al usuario del total actual en cada iteración.
			System.out.println("Total actual: " + acumulador);
		
		// Testeamos si la condición de salida se cumple.
		} while (numeroUsuario!=0);
		
		// De haberse cumplido la condición de salida informamos del resultado.
		System.out.println("'0' detectado. Saliendo del bucle. Total definitivo: " + acumulador );
		
		sc.close(); // Cerramos el scanner para calmar el mensaje de error del IDE.
	}

}
