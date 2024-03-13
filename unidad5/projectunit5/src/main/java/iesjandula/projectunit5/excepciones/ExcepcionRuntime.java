package iesjandula.projectunit5.excepciones;

public class ExcepcionRuntime {
	public static void main(String[] args) {
		
		// Interesa controlar las excepciones lo mas cerca del programa principal .
		// Si la aplicacion es de distintos hilo, de la parte principal de cada hilo.
		// Si es de ventana de un MVC entonces a nivel de controlador.
		
		// java patron de diseño - decorator - Clases que trabajan cooperativo
		
		// "throws exception" delega la responsabilidad de control en el metodo superior. El limite de esta delegación es el metodo main.
		
		
		try {
		muestraArray();
	}
		// Aquí es donde se recoge la excepción.
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ERROR: " + e.getMessage());
		
			e.printStackTrace();
			}
		
		}

	private static void muestraArray() {
		int[] array = { 4, 2, 6 };
		
		// Este bucle produce un error.
		for (int i = 0; i <= 3; i++) {
			System.out.println(array[i]);
		}
	}
}