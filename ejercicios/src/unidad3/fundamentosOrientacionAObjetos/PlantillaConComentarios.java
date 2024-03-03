package unidad3.fundamentosOrientacionAObjetos;

	// Un objeto es una clase externa al MAIN.	
	// Los objetos tienen propiedades y comportamientos.

	/* El orden de definicion es 
	 * 
	 *  - Atributos estaticos
	 *  
	 *  - Bloque STATIC
	 *  	// Es lo primero que se ejecuta al cargar la clase.
	 *  	* Aqui dentro el código que debe de ser cargado en memoria en primer lugar.
	 * 
	 * 
	 *  - Atributos
	 *  	* Siempre private para evitar el acceso indebido.
	 *  	* Variables null, variables inicializadas, variables estaticas y Constantes
	 * 	
	 *  - Constructores
	 *  	// Estos metodos siempre public para poderlos usar desde fuera.
	 *  	* Constructor vacio, constructor pleno.
	 *
	 *	- Metodos estaticos y finales.
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

// Nombre de la clase.
public class PlantillaConComentarios {

	// ------------------- Atributos de la clase -------------------.

	private String cadena;
	private int entero;
	private double doble;
	
	// Atributo de clase inicializado por defecto. 
	private String cadena2 = "Hola"; 
	
	// Atributo inicializado inmutable (constante)
	private final String inmutable1 = "valorX";
	
	// Se pueden declarar atributos de clase (static).
	private static int numPlantillas;
	
	// ------------------- Bloque STATIC -------------------.
	static {
		numPlantillas=0;
	}
	
	// ------------------- Metodos Constructores -------------------.
	
	public PlantillaConComentarios(){
		// Este metodo permite instanciar objetos vacios para su posterior definicion.		
	}
	
	public PlantillaConComentarios(String cadena, int entero, double doble, String cadena2){
		// Este metodo permite instanciar objetos completamente definidos.
		this.cadena=cadena;
		this.entero=entero;
		this.doble=doble;
		this.cadena2=cadena2;
	}
	
	// ------------------- Metodos Get / Set -------------------.
	public String cadena() {
		return cadena;
	}
	
	public void setCadena(String cadena) {
		this.cadena=cadena;
	}
	
	
	
	
	
	@Override
	// La instruccion Override sobreescribe el comportamiento de "tostring" que existe en el objeto padre "object".
	public String toString() {
		return "Plantilla [ cadena: " + cadena + ", entero: " + entero + ", doble: " + doble + ", cadena2: "+ cadena2 + " ]" ;
	}
	
}
