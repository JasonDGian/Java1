package unidad3.ejerciciosClases;

public class Planeta {
	//Un objeto es una clase externa al MAIN.	
	// Los objetos tienen propiedades y comportamientos.

	/* El orden de definicion es 
	 * 
	 *  - Atributos
	 *  	* Siempre private para evitar el acceso indebido.
	 *  	* Variables null, variables inicializadas, variables estaticas y Constantes
	 *  
	 *  - Bloque STATIC
	 *  	// Es lo primero que se ejecuta al cargar la clase.
	 *  	* Aqui dentro el código que debe de ser cargado en memoria en primer lugar.
	 *  	
	 *  - Constructores
	 *  	// Estos metodos siempre public para poderlos usar desde fuera.
	 *  	* Constructor vacio, constructor pleno.
	 *
	 *	- Metodos estaticos.
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
	 *  	// Polimorfismo de sobre-escritura.
	 *  	* Metodos que existen en otras clases padre que deben de ser sobrescritos.
	 *  	
	 */
	
	
	// Atributos de objeto.
	private String nombre = null;
	private int cantidadSatelites = 0;
	private double masaKm = 0;
	private double volumenKmCub = 0;
	private int DiametroKm = 0;
	private double distanciaMediaAlSolEnMillonesKM = 0;
	private enum TipoPlaneta { GASEOSO, TERRESTRE, ENANO }
	private boolean Observable = false;
	
	
	// Constructores
	
	public static Planeta() {}
	
	public static Planeta(String nombre, int cantidadSatelites, double masaKm, double volumenKmCub, int DiametroKm,  ) {}
	
	
}
