package unidad4.ejercicios.espanol.ejercicio45;

public class AppBiblioteca {

	public static void main(String[] args) {
// COMPARABLES PARA LOS QUE VAN DENTRO DEL ARRAY.
		
		/*
		 * Notas para el desarrollo:
		 * Tenemos dos clases.
		 * Clase Biblioteca y Clase Libro.
		 * 
		 * La clase biblioteca se compone de la clase libro. 
		 * La clase libro, para dar todas las funcionalidades a la clase biblioteca, debe de incluir los metodos
		 * - To String
		 * - Comparable
		 * - Equals
		 * 
		 * La clase biblioteca esta compuesta por un array de libros - Relacion de Composicion.
		 * La clase biblioteca dispone de un maximo de numeros establecido en constante.
		 * La clase biblioteca emplea un objecto mock de "LibroNulo" para ocupar los nulos del array Libros.
		 * 
		 * 
		 */
				

		// hacer un metodo bootstrap para inicializar objetos.
		// contador de libros.
		
		
		// Si la flecha del diagrama de clases es blanca es agregacion.  -< DIFERENCIAR ENTRE ESTAR COMPUESTO Y TENER
		// Si es negra la flecha es composicion.
		
		
		// En las relaciones de composicion, se obliga a incluir el elemento en el constructor.
		// En las de agregación no se obliga a introducirlo en el constructor.

		
		/*
		 * COMPARABLE :
		 * Es una interfaz que define un comportamiento que permite al 
		 * objeto ser comparado y compararse a si mismo con otro igual. 
		 * Es necesaria para ordenar objetos en un array.
		 * 
		 * Se hace con un return de (1) (0) (-1) según el resultado de comparacion.
		 * 
		 * En el caso de STRINGS, se utiliza el metodo nativo de java de compareTo del objeto Strings.
		 * Este metodo se puede alterar para definir un comportamiento que retome la regla del (1) (0) (-1)
		 * ya que el compareTo de strings no se comporta exactamente asi.
		 * 
		 * COMPARATOR: es un derivado del COMPARABLE que permite comparar dos 
		 * objetos sin necesidad de invocarlo desde un objeto.
		 * 
		 */
		
		
		
		
		
		
		
		
		
		Libro quijote = new Libro ("Quijote","Cervantes", 1605, "Anaya", "ISBN123513");
		Libro inferno = new Libro ("L'inferno","Dante", 1304, "WorldCAt", "ISBNN80008492");
		Libro emergido = new Libro ("Le Cronache del mondo emerso","Licia Troisi", 2009, "Oscar Best Sellers", "ISBN2021201");
		
		Libro[] libros = {quijote, inferno, emergido};
		
		//Biblioteca biblioNacional = new Biblioteca ( "Biblioteca Nacional" , libros  );
		
		System.out.println( quijote.compareTo(emergido) );
		System.out.println( quijote.compareTo(quijote) );
		System.out.println( emergido.compareTo(quijote) );

		
		
	}

}
