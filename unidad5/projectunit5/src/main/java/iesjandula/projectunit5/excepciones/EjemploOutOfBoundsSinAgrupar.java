package iesjandula.projectunit5.excepciones;

public class EjemploOutOfBoundsSinAgrupar {

	public static void main(String[] args) {

		try {

			muestraArray();

		}

		// Los catch se van escribiendo desde mas especifico a mas generico. 
		catch (ArrayIndexOutOfBoundsException e) {

			System.out.println("Ha accedido a una posición fuera del array");

		}

		catch (IndexOutOfBoundsException e) {

			System.out.println("Indice ilegal. Ha accedido a una posición fuera del array o cadena");

		}

	}

	private static void muestraArray() {

		// TODO Auto-generated method stub

		int[] array = { 4, 2, 6 };

		for (int i = 0; i <= 3; i++) {

			System.out.println(array[i]);

		}

	}

}