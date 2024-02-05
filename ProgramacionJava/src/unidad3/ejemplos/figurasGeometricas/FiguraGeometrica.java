package unidad3.ejemplos.figurasGeometricas;

public abstract class FiguraGeometrica {
	
	protected EnumFigura TipoFigura;
	// protected concede acceso a la subclase.
	
	public abstract double calcularArea();
	
	
	public abstract double calcularPerimetro();
	
	// Este metodo no mutará en ninguna subclase asi que podemos ponerlo FINAL.
	public final EnumFigura getTipo() {
		
		return this.TipoFigura;
	}
	
	
	
	
	
}
