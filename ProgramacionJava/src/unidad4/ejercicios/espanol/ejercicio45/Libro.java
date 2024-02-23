package unidad4.ejercicios.espanol.ejercicio45;

import java.util.Objects;

public class Libro implements Comparable<Libro> {

	private String titulo;
	private String autor;
	private int anoPublicacion;
	private String editorial;
	private String referenciaBibliografica;
	
	
	// Constructor
	
	public Libro(String titulo, String autor, int anoPublicacion, String editorial, String referenciaBibliografica) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.anoPublicacion = anoPublicacion;
		this.editorial = editorial;
		this.referenciaBibliografica = referenciaBibliografica;
	}

	// Getters y setters

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
	
	
	
	// TO STRING

	@Override
	public String toString() {
		return "Libro [titulo=" + titulo + ", autor=" + autor + ", anoPublicacion=" + anoPublicacion + ", editorial="
				+ editorial + ", referenciaBibliografica=" + referenciaBibliografica + "]";
	}

	
	
	@Override
	public int hashCode() {
		return Objects.hash(anoPublicacion, autor, editorial, referenciaBibliografica, titulo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Libro other = (Libro) obj;
		return anoPublicacion == other.anoPublicacion && Objects.equals(autor, other.autor)
				&& Objects.equals(editorial, other.editorial)
				&& Objects.equals(referenciaBibliografica, other.referenciaBibliografica)
				&& Objects.equals(titulo, other.titulo);
	}
	
	
	
	// hacer comparable.
	@Override
	public int compareTo(Libro other) {
	
		// Utiliza el metodo compare to de las strings.
		return this.referenciaBibliografica.compareTo(other.getReferenciaBibliografica());
	
	}
	

	
	
	
}





