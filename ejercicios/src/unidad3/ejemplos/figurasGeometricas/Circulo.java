package unidad3.ejemplos.figurasGeometricas;
	

public class Circulo extends FiguraGeometrica { //extends indica de quien se heredan cosas.
	
	// Atributos de objeto.
	private int radio;
	
	// Atributos de clase.	
	// Bloque STATIC
	
	// Constructores
	public Circulo() {
		this.TipoFigura=EnumFigura.ELIPSES;
	}
	
	public Circulo(int radio) {
		this();
		this.radio=radio;

	}
	
	// Metodos estaticos
	
	// Metodos de acceso
	public void setRadio(int radio) {
		this.radio=radio;
	}
	
	public float getRadio() {
		return this.radio;
	}
	
	// Metodos funcionales
	
	
	// Metodos polimorficos.
	
	@Override
	public double calcularArea() {
		// La formula de clacular el area de un circulo es PI*R^2
		return (double) (3.1415*(radio*radio));
	}
	
	@Override
	public double calcularPerimetro(){
		// La formula para calcular el perimetro de un circulo es PI*Diametro.
		return (double)3.1415*(radio*2);
	}
}
