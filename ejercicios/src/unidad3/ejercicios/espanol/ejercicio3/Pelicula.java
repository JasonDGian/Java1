package unidad3.ejercicios.espanol.ejercicio3;

public class Pelicula {
	
	private String nombre;
	private String director;
	private GeneroPelicula genero;
	private int duracion;
	private int ano;
	private double calificacion;
	
	// Constructor.
	public Pelicula(String nombre, String director, GeneroPelicula genero, int duracion, int ano, double calificacion) {
		this.nombre = nombre;
		this.director = director;
		this.genero = genero;
		this.duracion = duracion;
		this.ano = ano;
		this.calificacion = calificacion;
	}
	
	
	// Getters

	public String getNombre() {
		return nombre;
	}

	public String getDirector() {
		return director;
	}

	public GeneroPelicula getGenero() {
		return genero;
	}

	public int getDuracion() {
		return duracion;
	}

	public int getAno() {
		return ano;
	}

	public double getCalificacion() {
		return calificacion;
	}

	
	// Setters 
	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	private void setDirector(String director) {
		this.director = director;
	}

	private void setGenero(GeneroPelicula genero) {
		this.genero = genero;
	}

	private void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	private void setAno(int ano) {
		this.ano = ano;
	}

	private void setCalificacion(double calificacion) {
		this.calificacion = calificacion;
	}

	// Funcionales
	
	public boolean esPeliculaEpica() {
		return this.getDuracion()>=360;
	}
	
	public String calcularValoracion() {

		if (this.getCalificacion()<=2.0 ) {return "Muy mala.";}
		
		else if (this.getCalificacion()<=5.0 ) {return "Mala.";}
		
		else if (this.getCalificacion()<=7.0) {return "Regular.";}
					
		else if (this.getCalificacion()<=10.0 ) {return "Muy buena.";}
							
		else {return "ERROR: Valor no previsto.";}
		
	}
	
	public boolean esSimilar(Pelicula peliCompara) {
		return (this.genero==peliCompara.genero) && (this.calcularValoracion()==peliCompara.calcularValoracion());
	}
	

	@Override
	public String toString() {
		return "Pelicula [nombre=" + nombre + ", director=" + director + ", genero=" + genero + ", duracion=" + duracion
				+ ", ano=" + ano + ", calificacion=" + calificacion + "]";
	}

	
	
	
	
	
}
