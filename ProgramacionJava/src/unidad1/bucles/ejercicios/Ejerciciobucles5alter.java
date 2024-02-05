// Paquete al que pertenece la clase del programa.
package unidad1.bucles.ejercicios;

// Importamos la clase Scanner para leer datos por CLI.
import java.util.Scanner;

// Clase del programa.
public class Ejerciciobucles5alter {
	
	// Metodo de entrada principal a ejecución del programa.
	public static void main(String[] args) {
		// Escribir un programa que sume del numero 1 al n con un bucle.
			
		/*
		 * Solicitamos un numero al usuario.
		 * Mediante variable acumuladora vamos sumando los valores de la variable contadora.
		 */
		
		// Instanciamos un objeto Scanner para leer la entrada del usuario.
		Scanner sc = new Scanner(System.in);
		
		// Declaramos las variables.
		int acumulador = 0; // variable acumuladora para el resultado.
		int contador = 1; // variable contadora para las iteraciones.
		int numeroUsuario; // variable de almacenamiento de datos de entrada.
		
		System.out.println("Introduce un numero:");
		numeroUsuario = sc.nextInt();
		
		// Mientras que el contador no alcance el numero introducido por el usuario repetiremos iteración.
		while (contador<=numeroUsuario) {
			// Mostramos por pantalla la operación de la iteración corriente.
			System.out.println("Sumar "+ contador + " a " + acumulador + " = " + (acumulador+contador));
			
			// Almacenamos en el acumulador el valor del contador sumado al valor que ya existía.
			acumulador+=contador;
			// Incrementamos en 1 el contador de iteración.
			contador++;

		} // Cerramos While.
		
		sc.close(); // Cerramos el scanner para calmar el mensaje de error del IDE.
		
	} // Cerramos metodo main.

} // Cerramos clase
