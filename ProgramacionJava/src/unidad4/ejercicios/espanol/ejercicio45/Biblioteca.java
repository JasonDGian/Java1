package unidad4.ejercicios.espanol.ejercicio45;

public class Biblioteca {

	private String nombre;
	private Libro[] libros;
	private final int MAX_LIBROS = 200;
	private Libro libroNull = new Libro ("zzzzzzzzz","zzzzzzzzz", 9999, "zzzzzzzzz","999999999"); // crear un libro nulo
	
	// hacer un metodo bootstrap para inicializar objetos.
	// contador de libros.
	
	
	// Si la flecha del diagrama de clases es blanca es agregacion.  -< DIFERENCIAR ENTRE ESTAR COMPUESTO Y TENER
	// Si es negra la flecha es composicion.
	
	
	// En las relaciones de composicion, se obliga a incluir el elemento en el constructor.
	// En las de agregación no se obliga a introducirlo en el constructor.

	public Biblioteca(String nombre){
		this.nombre=nombre;
		this.libros = new Libro [MAX_LIBROS];
		rellenarLibrosNull();
	}
	
	
	public Biblioteca(String nombre, Libro[] librosArray ) {
		this(nombre);
		
		for ( Libro libro : librosArray ) {
			this.addLibro(libro);	
		}
	}

	//GETTERS Y SETTERS
	
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	// corregir este con un get libros reales.
	public Libro[] getLibros() {
		return libros;
	}


	public void setLibros(Libro[] libros) {
		this.libros = libros;
	}
		
	
	// Funcionales.
	
	// Metodo de rellenar array de nulos.
	private void rellenarLibrosNull() {
		for ( Libro libro : this.getLibros() ) {
			if ( libro == null ) {
				libro = libroNull;
			}
		}
	}

	// añadir libros
	
	public void addLibro(Libro libroNuevo) {
		// variable de control.
		boolean ranuraLibre = false;
		int indice=0;
		
		// por cada posicion en el array, hasta que encuentra una ranura libre.
		for (int i = 0; i < MAX_LIBROS && !ranuraLibre; i++) {
			// busca una ranura libre, si la encuentra actualiza la variable pertinente.
			if (this.libros[i].equals(libroNull)) {
				ranuraLibre = true;
			}
			
			else {
				indice++;
			}
			
		}
		// con la ranura libre encontrada realiza la accion pertinente.
		if (ranuraLibre) {
			this.libros[indice] = libroNuevo;
		}

	}
	

}
	
	
	
