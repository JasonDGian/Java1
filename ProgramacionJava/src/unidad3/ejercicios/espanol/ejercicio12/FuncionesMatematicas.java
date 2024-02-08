package unidad3.ejercicios.espanol.ejercicio12;

public class FuncionesMatematicas {
	

	// MAXIMO COMUN DIVISOR
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
	
	// MINIMO COMUN MULTIPLO
	


}
