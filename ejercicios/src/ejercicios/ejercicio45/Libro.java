package ejercicios.ejercicio45;

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
		System.out.println("Libro [titulo=" + titulo + ", autor=" + autor + ", anoPublicacion=" + anoPublicacion
				+ ", editorial=" + editorial + ", referenciaBibliografica=" + referenciaBibliografica + "]");
	}

	
	// Metodo equals personalizado.
	// El libro debe tener un metodo equals.
	public boolean equals(Libro otroLibro) {
		// Controla si la instancia es exactamente la misma (existencia en memoria en la misma direccion)
		if (this == otroLibro) 
			return true;
		// Controla si el objeto parametro es nulo. De ser nulo significa que no está instanciado y no es comparable.
		if (otroLibro == null) 
			return false;
		// Controla la equivalencia de clases del objeto corriente (this) con el objeto parametro.
		if (this.getClass() != otroLibro.getClass()) 
			return false;

		// anoPublicación lo controla con doble igual porque es INT.
		return this.anoPublicacion == otroLibro.anoPublicacion 
				// Los demás los controla con Object.equals porque son tipo string.
				&& Objects.equals(autor, otroLibro.autor) && Objects.equals(editorial, otroLibro.editorial) 
				&& Objects.equals(referenciaBibliografica, otroLibro.referenciaBibliografica)
				&& Objects.equals(titulo, otroLibro.titulo);
	}
	

	// METODOS SOBRECARGADOS.

	@Override
	public int hashCode() {
		return Objects.hash(referenciaBibliografica);
	}

	// El libro debe implementar el comparable.
	@Override
	public int compareTo(Libro o) {
		// comparación lexicográfica.
		return this.referenciaBibliografica.compareTo(o.referenciaBibliografica);
	}

	// Metodo toString de la clase.
	@Override
	public String toString() {
		return "Libro [titulo=" + titulo + ", autor=" + autor + ", anoPublicacion=" + anoPublicacion + ", editorial="
				+ editorial + ", referenciaBibliografica=" + referenciaBibliografica + "]";
	}
	
}




