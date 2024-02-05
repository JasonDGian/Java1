package unidad3.ejemplos.figurasGeometricas;

public class Rectangulo extends FiguraGeometrica {
	
	// Atributos de objeto.
	private int base;
	private int altura;
	
	// Atributos de clase.
	
	
	// Bloque STATIC
	// Constructores
	public Rectangulo() {
		this.TipoFigura=EnumFigura.POLIGONOS;
	}
	
	public Rectangulo(int base, int altura) {
		this();
		this.altura=altura;
		this.base=base;

	}
	
	// Metodos estaticos
	
	// Metodos de acceso (truco automatico)
	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}	

	public void ImprimeArea() {
		System.out.println("El area del rectangulo con altura " + this.getAltura() + " y base " + this.getBase() + " es " + this.calcularArea());
	}
		
	public void ImprimePerimetro() {
		System.out.println("El perimetro del rectangulo con altura " + this.getAltura() + " y base " + this.getBase() + " es " + this.calcularPerimetro());
	}
	
	// Metodos polimorficos.
	@Override
	public double calcularPerimetro() {
		return (base*2) + (altura*2);
	}
	
	// Metodos funcionales
	@Override
	public double calcularArea() {
		return base*altura;
	}
}
