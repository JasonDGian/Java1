package unidad3.ejercicios.espanol.ejercicio3;

import ejercicios.espanol.ejercicio3.Pelicula.Genero;

public class AppPeliculas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pelicula gandhi = new Pelicula("Gandhi", "Richard Attenborough", Genero.DRAMA, 191, 1982, 8.1);
		Pelicula thor = new Pelicula("Thor", "Kenneth Granagh", Genero.ACCION, 115, 2011, 7);

		System.out.println("La valoracion de Gandhi: " + gandhi.calcularValoracion() );
		
		System.out.println("La valoracion de Thor: " +	thor.calcularValoracion() );
		
		System.out.println("La peliculas Gandhi es epica: "+ gandhi.esPeliculaEpica() );
		System.out.println("La peliculas Thor es epica: "+ thor.esPeliculaEpica() );

		System.out.println("La peliculas Thor y Gandhi son similares: " + thor.esSimilar(gandhi) );

		System.out.println(thor);
		System.out.println(gandhi);
		

	}

}
