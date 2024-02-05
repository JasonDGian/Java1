package unidad3.ejemplos.figurasGeometricas;

public class MainPoligonos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Instanciamos objeto circulo.
		Circulo circ = new Circulo();
		
		// Definimos radio objeto circulo.
		circ.setRadio(15);
		
		// Operamos metodos funcionales con objeto circulo.
		System.out.println("------------------------------------------------------------");
		System.out.println("El area del circulo con radio " + circ.getRadio() + " es " + circ.calcularArea());
		System.out.println("El perimetro del circulo con radio " + circ.getRadio() + " es " + circ.calcularPerimetro());
		
		
		// Instanciamos objeto rectangulo.
		Rectangulo rect = new Rectangulo();
		
		
		// Definimos radio objeto rectangulo.
		rect.setAltura(15);
		rect.setBase(30);
		
		// Operamos metodos funcionales con objeto rectangulo.
		System.out.println("------------------------------------------------------------");
		rect.ImprimeArea();
		rect.ImprimePerimetro();
		
		// Instanciamos objeto cuadrado.
		Cuadrado cuad = new Cuadrado();
		
		// Definimos radio objeto cuadrado.
		cuad.setAlturaLado(15);
		
		// Operamos metodos funcionales con objeto cuadrado.
		System.out.println("------------------------------------------------------------");
		cuad.ImprimeArea();
		cuad.ImprimePerimetro();
		
		
		// Instanciamos objeto triangulo.
		TrianguloRectangulo tria = new TrianguloRectangulo(); 
		
		// Definimos radio objeto triangulo
		tria.setAltura(3);
		tria.setBase(4);
		
		TrianguloRectangulo tria2 = new TrianguloRectangulo(12,12);
		
		// Operamos metodos funcionales con objeto triangulo	
		System.out.println("------------------------------------------------------------");
		System.out.println(tria.calcularArea());
		System.out.println(tria.calcularPerimetro());
		System.out.println(tria.calcularHipotenusa());
		
		// Probando funcion.
		tria.determinarTipoTriangulo();
		tria2.determinarTipoTriangulo();
	}

}
