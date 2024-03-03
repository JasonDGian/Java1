package unidad1.bucles;

public class BucleAnidado {
	public static void main(String args[]) {
		int i = 1;
int result = 1;

		while (i <= 3) {
			System.out.println("\n" + i + " " + "el bucle externo se ejecuta una vez");
			System.out.println("el número introducido para calcula la cuarta potencia:" + i + " \n");
			int j = 1;
			result = 1;
			//i=2
			while (j <= 4) {

				result = result* i;
				System.out.println(j + " " + "el bucle interno se ejecuta entero");
				j++;
			}
			System.out.println("\nLa potencia a la cuarta del número  " + i + " es " + result);

			i++;
		}
	}
}
