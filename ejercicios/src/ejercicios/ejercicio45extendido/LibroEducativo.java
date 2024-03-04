package ejercicios.ejercicio45extendido;

public class LibroEducativo extends Libro{

	private String materia;
	
	
	public LibroEducativo(String titulo, String autor, int anoPublicacion, String editorial,
			String referenciaBibliografica, EnumLibro tipoLibro, String materia) {
		super(titulo, autor, anoPublicacion, editorial, referenciaBibliografica, tipoLibro);
		
		this.materia=materia;
	}

	
	

	@Override
	public String toString() {
		return "LibroEducativo [materia=" + materia + ", getTitulo()=" + getTitulo() + ", getAutor()=" + getAutor()
				+ ", getAnoPublicacion()=" + getAnoPublicacion() + ", getEditorial()=" + getEditorial()
				+ ", getReferenciaBibliografica()=" + getReferenciaBibliografica() + ", getTipoLibro()="
				+ getTipoLibro() + "]";
	}
	
	

}
