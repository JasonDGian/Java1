package ejercicios.ejercicio45extendido;

// Cuando se trata de una operacion simple, a menudo con un solo array, podemos usar un FOR EACH.
// Cuando en cambio necesitamos tener en cuenta un indice, entonces usamos un for(i)

public class Biblioteca {

	private String nombre;
	private Libro[] libros;
	// Constante de maximo de libros.
	private final int MAX_LIBROS = 100;
	// libro nulo placeholder.
	private final Libro libroNull = new Libro ("LibroNull","LibroNull", 9999, "LibroNull","LibroNull"); 
	private int contadorLibros=0;
	

	// Constructor que recibe nombre e inicializa la coleccion de libros.
	public Biblioteca(String nombreBiblioteca) {
		this.nombre=nombreBiblioteca; 	// Asigna el nombre al nuevo objeto biblioteca.
		libros=new Libro[MAX_LIBROS]; 	// Inicializa una nueva colección vacia de libros.
		this.rellenaConLibroNulo();			// Rellena la nueva colección vacia de libros con libros nulos.
	}
	
	public Biblioteca(String nombreBiblioteca, Libro[] coleccionLibros) {
		this(nombreBiblioteca); // Esto llama al constructor de arriba.
		
		// Bucle de inicialización que añada cada libro del array.
		// Esto corre una vez ya inicializado el array y relleno de librosNulos.
		for (Libro libro : coleccionLibros) {
			this.addLibro(libro);
		}
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Libro[] getLibros() {
		return libros;
	}

	public void setLibros(Libro[] libros) {
		this.libros = libros;
	}

	public int getMAX_LIBROS() {
		return MAX_LIBROS;
	}
	
	public int getContadorLibros() {
		return contadorLibros;
	}

	// Metodos funcionales.
	// Añadir libro que permite agregar un libro a la colección de libros de la biblioteca
	public void addLibro(Libro libroNuevo) {

		boolean huecoEncontrado = false;
		int indice = 0;

		// Por cada 'i' en MAX_LIBROS y MIENTRAS NO HAYA HUECO ENCONTRADO
		for (int i = 0; i < MAX_LIBROS && !huecoEncontrado; i++) {

			// el bucle va iterando, y cuando encuentra un objeto equivalente a libro
			// nulo entonces configura la variable huecoEncontrado a TRUE.
			if (this.getLibros()[i].equals(libroNull)) {
				huecoEncontrado = true;
			}
			// Si no encuentra hueco en la iteración, incrementa el contador indice.
			else {
				indice++;
			}

		} // Cierra el for.

		// Una vez analizado el array de libros se toma una acción.
		if (huecoEncontrado) {
			// Si se ha encontrado un juego se asigna el nuevo libro a ese hueco.
			this.libros[indice] = libroNuevo;
			// incrementa el contador de libros de la colección de la biblioteca.
			contadorLibros++;
		}
	}
	
	
	/*
	 * Listar libros que muestra en pantalla los datos de todos los libros de la
	 * biblioteca invocando el método imprimir de los libros
	 */
	public void mostrarLibrosPantalla() {
		// Tenemos en cuenta el contador de libros para limitar las iteraciones.
		// Recorremos el array hasta dar con la cifra contada.
		// imprime solo si el libro no es placeholder.
		int control = 0;

		for (int i = 0; i < MAX_LIBROS && control <= contadorLibros; i++) {

			// si el objeto almacenado en la posicion i difiere de libro null.
			if (this.getLibros()[i] != libroNull) {
				// Lo imprime por pantalla.
				this.getLibros()[i].imprimir();
				// tomamos nota de que se ha impreso un libro de los contados.
				control++;
			}
		}
	}
	
	/*
	 HACER UN METODO QUE CREA UN NUEVO ARRAY A PARTIR DEL ARRAY CON NULOS
	public Libros[] mostrarLibros() {
		Libros[] nuevoArrayLibros = new Libros[contadorLibros];
		int indice=0;		
		return nuevoArrayLibros;		
	}*/
	
	
	// Hacer un metodo que rellene la coleccion de libros
	private void rellenaConLibroNulo() {
		// por cada hueco en el array libros.		
		for (int i = 0; i<MAX_LIBROS ; i++) {
			
			// si es nulo lo rellena con libro nulo en la posicion pertinente del array.
			if (this.getLibros()[i] == null) {
				this.libros[i]=libroNull;
			}
		}
	}
	
	public boolean hayLibros() {
		
		boolean hayLibros = false;
		
		if (contadorLibros>0) {
			hayLibros=true;
		}
		return hayLibros;
		}
		
		
} // Cierra la clase Biblioteca.
	

	
	
	
