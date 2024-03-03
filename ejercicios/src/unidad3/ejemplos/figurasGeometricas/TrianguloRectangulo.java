package unidad3.ejemplos.figurasGeometricas;
	

public class TrianguloRectangulo extends FiguraGeometrica {
	
	// Atributos de objeto.
	private int base;
	private int altura;
	
	// Atributos de clase.	
	// Bloque STATIC
	
	// Constructores
	public TrianguloRectangulo() {
		this.TipoFigura=EnumFigura.POLIGONOS;
		
	}
	
	public TrianguloRectangulo(int altura, int base) {
		this(); // esto llama a todo el bloque de codigo presente en el constructor sin parametro.
		this.altura=altura;
		this.base=base;
	}
	
	// Metodos estaticos
	
	// Metodos de acceso
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

	// Metodos funcionales
	public double calcularHipotenusa() {
		// La formula para calcular la hipotenusa es A^2 + B^2 = C^2 -> RaizCuad de C
		return Math.sqrt((altura*altura) + (base*base));		
	}
	
	public void determinarTipoTriangulo(){
		// PAra determinar que tipo de triangulo rectangulo tenemos 
		if (altura==base) {
			System.out.println("Triangulo de tipo Isósceles");
		}
		
		else {
			System.out.println("Triangulo de tipo Escaleno");
		}
		
	}
	
	// Metodos polimorficos.
	@Override
	public double calcularArea() {
		// La formula de clacular el area de un triangulo es Area = 1/2 * (base*altura)
		return (double)((base*altura)/2);
	}
	
	@Override
	public double calcularPerimetro(){
		// La formula para calcular el perimetro de un triangulo Perímetro = (2 x base) + (2 x altura)
		return (double)((base*2) + (altura*2));
	}
	
}
