package unidad1.bucles.ejerciciosextra;

public class ejercicioRefierzo9 {

	public static void main(String[] args) {
		// Ejercicio 9. Haced un programa que con bucles anidado imprima por pantalla lo
		// siguiente.
		// Usar el carácter \t para hacer el tabulador en el salto entre Externo e
		// Interno.

		for (int i = 1; i <= 3; i++) {

			System.out.print("Externo: " + i + "\t");

			for (int j = 1; j <= 2; j++) {

				System.out.print("Interno: " + j + "\t");

			}

			System.out.println("");
		}

		
	}

}
