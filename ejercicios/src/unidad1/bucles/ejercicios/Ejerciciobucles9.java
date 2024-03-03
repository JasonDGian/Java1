package unidad1.bucles.ejercicios;

public class Ejerciciobucles9 {

	public static void main(String[] args) {
		// TODO Realizar un programa que muestre la tabla de multiplicar para los diez
		// primeros números usando un bucle anidado.

		for (int numero = 1; numero <= 10; numero++) { // El loop externo es responsable del numero base.

			for (int multiplicador = 1; multiplicador <= 10; multiplicador++) { // El loop interno del multiplicador

				// Cada iteracion se imprime por pantalla el numero actual del loop externo por
				// el numero del loop interno.
				System.out.println(numero + " x " + multiplicador + " = " + numero * multiplicador);

				// Si el loop interno ha alcanzado su maximo entonces se imprime una linea de
				// separacion
				if (multiplicador == 10) {
					System.out.println("-----------------------");
				}

			}

		}

	}

}
