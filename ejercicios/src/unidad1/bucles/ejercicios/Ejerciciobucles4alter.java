// Paquete al que pertence la clase.
package unidad1.bucles.ejercicios;

// Imporatamos el scanner para leer la entrada del usuario.
import java.util.Scanner;

public class Ejerciciobucles4alter {

	public static void main(String[] args) {
		/*
		 * Escribir un programa que calcule el factorial de un numero N recogido por 
		 * pantalla y muestre el resultado. Mostramos por pantalla 4!=24.
		 */
		
		/*
		 * Pediremos un numero al usuario.
		 * Usaremos una variable contador para ir teniendo en cuenta las iteracions.
		 * Usaremos una variable acumulador para ir acumulando resultados de las iteraciones.
		 */
						
		// Creamos un objeto de scanner para leer la entrada del usuario.
		Scanner sc = new Scanner (System.in);
		
		// Declaramos las variables a usar.
		int contadorVueltas = 1;
		int numeroIntroducido;
		int resultado=1;

		// Informamos al usuario de que el programa atiende a una entrada por su parte.
		System.out.println("Introduce un numero para calcular su factorial: ");
		// Leemos el input de usuario.
		numeroIntroducido = sc.nextInt();

		// Mientras que el contador de iteraciones no sea equivalente al numero introducido repetiremos la operación.
		while (contadorVueltas<=numeroIntroducido) {
			
			// Almacenamos el resultado acumulado de las multiplicaciones por iteracion.
			resultado = resultado * contadorVueltas;
			
			// Sumamos 1 al contador de vueltas.
			contadorVueltas++;
		}
		
		// Mostramos el resultado al usuario.
		System.out.println(numeroIntroducido + "!= " + resultado);

		//Cerramos el scanner para evitar el mensaje de error.
		sc.close();
	}

}
