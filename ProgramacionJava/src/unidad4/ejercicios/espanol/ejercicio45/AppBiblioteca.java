package unidad4.ejercicios.espanol.ejercicio45;

public class AppBiblioteca {

	public static void main(String[] args) {
// COMPARABLES PARA LOS QUE VAN DENTRO DEL ARRAY.
		
		Libro quijote = new Libro ("Quijote","Cervantes", 1605, "Anaya", "ISBN123513");
		Libro inferno = new Libro ("L'inferno","Dante", 1304, "WorldCAt", "ISBNN80008492");
		Libro emergido = new Libro ("Le Cronache del mondo emerso","Licia Troisi", 2009, "Oscar Best Sellers", "ISBN2021201");
		
		Libro[] libros = {quijote, inferno, emergido};
		
		Biblioteca biblioNacional = new Biblioteca ( "Biblioteca Nacional" , libros  );
		
		System.out.println( quijote.compareTo(emergido) );
		System.out.println( quijote.compareTo(quijote) );
		System.out.println( emergido.compareTo(quijote) );

		
		
	}

}
