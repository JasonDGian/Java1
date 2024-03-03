package unidad3.ejemplos.figurasGeometricas;
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

public class Cuadrado extends FiguraGeometrica {
	
	// Atributos de objeto.
	private int alturaLado;

	
	// Atributos de clase.
	
	
	// Bloque STATIC
	// Constructores
	
	public Cuadrado () {
		
		this.TipoFigura=EnumFigura.POLIGONOS;
		
	}
	
	public Cuadrado(int alturaLado) {
		
		this.TipoFigura=EnumFigura.POLIGONOS;
		this.alturaLado = alturaLado;
	}


	// Metodos estaticos
	
	// Metodos de acces
	
	
	public float getAlturaLado() {
		return alturaLado;
	}

	public void setAlturaLado(int alturaLado) {
		this.alturaLado = alturaLado;
	}
	
	// Metodos funcionales

	
	public void ImprimeArea() {
		System.out.println("El area del cuadrado con lado " + this.getAlturaLado() + " es " + this.calcularArea());
	}	
	

	
	public void ImprimePerimetro() {
		System.out.println("El perimetro del cuadrado con lado " + this.getAlturaLado() + " es " + this.calcularPerimetro());
	}
	
	// Metodos polimorficos.
	@Override
	public double calcularPerimetro() {
		return alturaLado*4;
	}
	
	@Override
	public double calcularArea() {
		return alturaLado*alturaLado;
	}
	
}
