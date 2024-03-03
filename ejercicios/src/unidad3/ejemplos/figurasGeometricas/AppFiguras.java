package unidad3.ejemplos.figurasGeometricas;

public class AppFiguras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FiguraGeometrica [] arrayFiguras = new FiguraGeometrica[5];
		
		Circulo cirx = new Circulo(10);
		
		FiguraGeometrica varSuper = cirx;
		
		cirx = (Circulo) varSuper;
		
		// A un array de super clase podemos asignar objetos de la subclase. 
		arrayFiguras[0] = cirx;
		arrayFiguras[1] = new Cuadrado(5);
		arrayFiguras[2] = new Rectangulo(4,8);
		arrayFiguras[3] = new Cuadrado(5); 
		arrayFiguras[4] = new TrianguloRectangulo(3,7);
		
		
		// Como comprobar antes de castear.
		/*if (X instanceof tipo) {
			cast de objeto.
		}
		*/
		/*
	       Circulo cir = new Circulo(10);
	       Circulo cir2;

	       FiguraGeometrica varSuperCirculo = new Circulo(15);
	       FiguraGeometrica varSuperRectangulo = new Rectangulo(5, 10);
	       cir.getRadio();

	       if (varSuperCirculo instanceof Circulo)
	           cir2 = (Circulo) varSuperCirculo;

	       // da fallo

	       if (varSuperRectangulo instanceof Circulo)
	           cir2 = (Circulo) varSuperRectangulo;
	       */
	       for (int i=0; i<arrayFiguras.length; i++) {
	    	   // ejercicio
	    	   // calcular el area total ocupado en pantalla.
	    	   
	    	   System.out.println("Area es: " + arrayFiguras[i].calcularArea());
	    	   System.out.println("Perimetro es:" + arrayFiguras[i].calcularPerimetro());
	    	   System.out.println("Tipo es: " + arrayFiguras[i].getTipo());
	    	   
	       }
		
	}

}
