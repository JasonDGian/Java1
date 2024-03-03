package unidad3.ejercicios.espanol.ejercicio11;

public class Empleado {
	
	// Un objeto es una clase externa al MAIN.	
	// Los objetos tienen propiedades y comportamientos.

	/* El orden de definicion es 
	 * 
	 *  - Atributos estaticos
	 */
	private static int contadorEmpleados=0;
	
	
	
	 /*  - Bloque STATIC
	 *  	// Es lo primero que se ejecuta al cargar la clase.
	 *  	* Aqui dentro el código que debe de ser cargado en memoria en primer lugar.
	 * 
	 * 
	 *  - Atributos
	 *  	* Siempre private para evitar el acceso indebido.
	 *  	* Variables null, variables inicializadas, variables estaticas y Constantes
	 */
	private String nombre; 
	private String apellidos;
	private float mensualidad;
	private int identificador;
	
	 /*  - Constructores
	 *  	// Estos metodos siempre public para poderlos usar desde fuera.
	 *  	* Constructor vacio, constructor pleno.
	 */
	 public Empleado() {
		 this.identificador=++contadorEmpleados;
	 }
	 
	 public Empleado(String nombre, String apellidos) {
		 this();
		 this.nombre=nombre;
		 this.apellidos=apellidos;
	 }

	 public static int getNumeroEmpleados() {
		 return contadorEmpleados;
	 }
	 
	 
	public  int getIdentificador() {
		return this.identificador;
	}

	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public float getMensualidad() {
		return mensualidad;
	}

	public void setMensualidad(float mensualidad) {
		this.mensualidad = mensualidad;
	}
	
	/*	- Metodos estaticos y finales.
	 *		// Metodos que afecten a la clase en si y no al objeto.
	 *
	 *  - Metodos de acceso Get/Set
	 *  	// Estos metodos siempre public para poderlos usar desde fuera.
	 *  	* Metodo Get
	 *  	* Metodo Set
	 *  
	 *  - Metodos funcionales.
	 *  	// Cualquier metodo que tenga una funcion o procedimiento que no sea get-set
	 *
	 *  - @Override
	 *  	NOTA: LOS METODOS CON MODIFICADOR "final" NO PUEDEN SER SOBRECARGADOS.
	 *  	// Polimorfismo de sobre-escritura.
	 *  	* Metodos que existen en otras clases padre que deben de ser sobrescritos.
	 *  	
	 */
	
	
	

}
