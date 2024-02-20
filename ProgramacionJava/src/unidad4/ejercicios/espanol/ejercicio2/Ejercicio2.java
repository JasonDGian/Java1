package unidad4.ejercicios.espanol.ejercicio2;

public class Ejercicio2 {
	
	public static <T> String imprimeArray(T[] array) {

		String valores = null;

		for (T item : array) {

			if (valores == null) {
				valores = "" + item;
			} else {
				valores = valores + ", " + item;
			}

		}

		return "Valores: { " + valores + "}";

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Ejercicio 2. Inicializa el array de 12 números enteros con nombre num y
		 * asigna los valores según la figura que se muestra a continuación. Muestra el
		 * contenido de todos los elementos del array. ¿Qué sucede con los valores de
		 * los elementos que no han sido inicializados? 
		 * Posición  0 1 2 3 4 5 6 7 8 9 10 11 
		 * Valor    39 -2    0  14   5 120
		 */
		
		Integer[] num = new Integer[12];
		
		num[0] = 39;
		num[1] = -2;
		num[4] = 0;
		num[6] = 14;
		num[8] = 5;
		num[9] = 120;
		
		System.out.println(imprimeArray(num));
		
	}

}
