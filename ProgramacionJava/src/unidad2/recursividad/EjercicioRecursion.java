package recursividad;

public class EjercicioRecursion {

	// EJERCICIO 1
	// Crea un metodo recursivo que obtenga la suma de los numeros naturales desde 1
	// hasta N. Se debe pasar como parametro el numero N

	static int sumaNPrimerosNumeros(int n) {

		return sumaNPrimerosNumerosAux(n,0);
	}
	
	static int sumaNPrimerosNumerosAux(int num, int acumulador) {
		
		if (num==0) 
			return acumulador;
		
		else {
		acumulador=acumulador+num;
		num--;				
		return sumaNPrimerosNumerosAux(num,acumulador);
		}
	}
	
	

	// EJERCICIO 2
	// Crea un metodo recursivo que imprima los digitos desde 1 hasta N. Se debe
	// pasar como parametro el numero n.
	static void imprimeDeUnoaN(int n) {

		// Caso base
		if (n == 0) {
			System.out.print("0");
			return; 
		}

		else {
			imprimeDeUnoaN(n - 1);
			System.out.print(n + " ");
			return;
		}

	}

	// EJERCICIO 3
	// Crea un metodo recursivo que imprima los digitos desde N hasta 1. Se debe
	// pasar como parametro el numero N
	static int imprimeNNumeros2(int n) {

		// Caso base
		if (n == 0)
			return 0;

		System.out.println(n);
		return imprimeNNumeros2(n - 1);

	}

	// EJERCICIO 4
	// Crea un metodo recursivo que obtenga la cantidad de digitos de un numero N.
	// Se debe pasar como parametros el numero N.
	static int cantidadDigitos(int num) {

		// Caso base.
		if (num == 0)
			return 0;

		return 1 + cantidadDigitos(num / 10);

	}

	// EJERCICIO 5
	// Crea un metodo que dado un numero lo imprima invertido por pantalla.
	static void imprimeNumeroInvertido(int num) {

		// Caso base
		if (num == 0)
			return;

		else
			System.out.print(num % 10);
		imprimeNumeroInvertido(num / 10);

		return;
	}

	// EJERCICIO 6
	// Crea un metodo que dado un numero lo reinvierta.

	private static int reverseNumber(int num) {

		// Caso base
		return reverseNumberAux(num, 0);

	}

	public static int reverseNumberAux(int num, int result) {

		int digit = 0;

		if (num == 0)
			return result;

		digit = num % 10;
		result = digit + result * 10;
		num /= 10;
		return reverseNumberAux(num, result);

	}
	
	
	// EJERCICIO FIBONACCI
	static int terminoFibonacci(int num) {
			
		if (num==0 || num==1) return 1;
		
		else {
			
			return terminoFibonacci(num-1) + terminoFibonacci(num-2);
			
		}
	}
		

	// EJERCICIO  FIBONACCI MEJORADO CON ACUMULADOR Y FUNCION AUXILIAR
	
	
	
	//suponemos que num1 es mayor a num2.
	static int MCD(int num1, int num2) {
		
		// si num2 es igual a zero se usa num1
		if (num2 == 0) return num1;
			
		return MCD(num2,num1%num2);		
		
	}
		
	

	public static void main(String[] args) {

		// System.out.println(sumaNPrimerosNumeros(4));

		// imprimeDeUnoaN(6);

		// cantidadDigitos(123);

		// imprimeNumeroInvertido(12345);

		// System.out.println(reverseNumber(1234));
	
		// sumaNPrimerosNumeros(4);
		
		// System.out.print( MCD(20,16));
		
		System.out.print(terminoFibonacci(15));
	
	}

}
