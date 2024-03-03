package unidad4.ejercicios.espanol.ejercicio45;

import java.util.Objects;

public class Libro implements Comparable<Libro> {

	// ATRIBUTOS PRIVADOS
	private String titulo;
	private String autor;
	private int anoPublicacion;
	private String editorial;
	private String referenciaBibliografica;

	// CONSTRUCTOR
	// El libro debe tener un constructor que inicialice sus atributos 
	public Libro(String titulo, String autor, int anoPublicacion, String editorial, String referenciaBibliografica) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.anoPublicacion = anoPublicacion;
		this.editorial = editorial;
		this.referenciaBibliografica = referenciaBibliografica;
	}


	// METODOS DE ACCESO - GETTERS Y SETTERS.
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getAnoPublicacion() {
		return anoPublicacion;
	}

	public void setAnoPublicacion(int anoPublicacion) {
		this.anoPublicacion = anoPublicacion;
	}

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	public String getReferenciaBibliografica() {
		return referenciaBibliografica;
	}

	public void setReferenciaBibliografica(String referenciaBibliografica) {
		this.referenciaBibliografica = referenciaBibliografica;
	}

	
	// METODOS FUNCIONALES.

	// El libro debe tener un método imprimir que muestre los valores de sus atributos.
	public void imprimir() {
		System.out.println( "Libro [titulo=" + titulo + ", autor=" + autor + ", anoPublicacion=" + anoPublicacion + ", editorial="
				+ editorial + ", referenciaBibliografica=" + referenciaBibliografica + "]");
	}

	// METODOS SOBRECARGADOS.
	
	@Override
	public int hashCode() {
		return Objects.hash(anoPublicacion, autor, editorial, referenciaBibliografica, titulo);
	}

	// El libro debe tener un metodo equals.
	@Override
	public boolean equals(Object obj) {
		if (this == obj) // check de si es una clase objeto: devuelve true y sigue al siguiente check.
			return true;
		if (obj == null) // check si es nulo: devuevle falso
			return false;
		if (getClass() != obj.getClass()) // si el objeto alimentado es de distinta clase entonces devuelve false.
			return false;
		Libro other = (Libro) obj;
		return anoPublicacion == other.anoPublicacion // constroles de atributos en serie.
				&& Objects.equals(autor, other.autor) && Objects.equals(editorial, other.editorial)
				&& Objects.equals(referenciaBibliografica, other.referenciaBibliografica)
				&& Objects.equals(titulo, other.titulo);
	}
	
	// El libro debe implementar el comparable.
	@Override
	public int compareTo(Libro o) {
		// El metodo compara la referencia bibliografica, de tipo string y según el resultado devuelve 
		// un valor de tipo 1 0 -1.
		
		if (this.referenciaBibliografica.compareTo(o.referenciaBibliografica) > 0) { return 1; }
		else if (this.referenciaBibliografica.compareTo(o.referenciaBibliografica) < 0 ) {return -1;}
		else {return 0;}
	}

	@Override
	public String toString() {
		return "Libro [titulo=" + titulo + ", autor=" + autor + ", anoPublicacion=" + anoPublicacion + ", editorial="
				+ editorial + ", referenciaBibliografica=" + referenciaBibliografica + "]";
	}
	
	
	
	
	
	
}





