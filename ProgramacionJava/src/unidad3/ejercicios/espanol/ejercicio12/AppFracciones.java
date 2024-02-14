package unidad3.ejercicios.espanol.ejercicio12;



public class AppFracciones {
	
	static int mcd (int num1, int num2) {
		
		// Posiciona el mayor numero en A y el menor en B
		int a = Math.max(num1, num2);
		int b = Math.min(num1, num2);
		
		int resto = 0;
		int restoAnterior = 0;
		
		do {
			
			restoAnterior=resto; // almacena el resto anterior para devolver como resultado.
			resto = a % b; // calcula el resto de la iteracion actual.
		
		a = b; // actualiza el valor de A
		b = resto; // actualiza el valor de B
		
		} 
		while (resto!=0);
		
		return restoAnterior;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Fraccion frac0 = new Fraccion(40,80);
	
		//System.out.println(frac0.simplificarFraccion());
		
		
		Fraccion frac1 = new Fraccion(12,36);
		Fraccion frac2 = new Fraccion(36,12);
		/*
		System.out.println( frac1.simplificarFraccion() );
		System.out.println( frac2.simplificarFraccion() );
		
		System.out.println(	Fraccion.sumarFracciones(frac1, frac2) ); 
		
		System.out.println(	Fraccion.restarFracciones(frac1, frac2) ); 
	
		Fraccion.leerFraccion();*/
		
		//Fraccion.escribirFraccion(frac2);
		
		//System.out.println(	frac0.simplificarFraccion());
		
		mcd(40,80);
	}
	
	
	

}
