package iesjandula.projectunit5.excepciones;

public class EjemploOutOfBounds {
	public static void main(String[] args) {
		try {
			muestraArray();
		} catch (IndexOutOfBoundsException e) {
			System.out.println("Ha accedido a una posición fuera del array o cadena");
			e.printStackTrace();
		} finally {
			// Un bloque de c´podigo que si o si se va a ejeuctar, sea un socket o un fichero 
			// en el finally ponemos el cierre para asegurarnos que con o sin error se cierre 
			// la conexión o stream de datos..
			System.out.println("Finally siempre se ejecuta");
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