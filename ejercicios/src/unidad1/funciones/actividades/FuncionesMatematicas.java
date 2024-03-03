package unidad1.funciones.actividades;

import java.util.Scanner;

public class FuncionesMatematicas {

	// parámetros formales
	public static double media(int x, int y) {

		double calculo;

		calculo = (double) (x + y) / 2;
		return calculo;
		// También se puede poner Return ((x + y) / 2)
	}

	/*
	 * 
	 * The number passed as a parameter is reversed For instance if we make the call
	 * reverse(3456) the value returned by the function would be 6543
	 * 
	 */
	public static int reverse(int num) {

		int cifra, numRes = 0;

		while (num > 0) {
			numRes *= 10;
			cifra = num % 10;
			numRes += cifra; // numRes= numRes+cifra;
			num /= 10;

		}

		return numRes;
	}

	public static int countDigits(int num) {
		// This function returns the total of digits for the given number.

		int digitCounter = 0;

		while (num > 0) {

			num /= 10;
			digitCounter++;

		}

		return digitCounter;

	}

	// This function returns the number with all the occurrences of a digit
	// replaced by the new digit. For instance, if the number is 12373, the digit is
	// 3 and the new digit is 5 the return value would be 12575.
	public static int replaceDigits(int num, int digit, int newDigit) {

		int cifra;
		int exponente = 0;
		int newNumber = 0;

		while (num > 0) {

			cifra = num % 10;

			if (cifra == digit) {
				cifra = newDigit;
			}

			newNumber += cifra * (Math.pow(10, exponente));

			num /= 10;
			exponente++;

		}

		return newNumber;

	}

	// This function replaces the digit in a certain position with a new digit.
	public static int replaceDigitByPosition(int num, int position, int newDigit) {

		int contPosicion = 1;
		int exponente = 0;
		int newNumber = 0;
		int cifra;

		while (num > 0) {

			cifra = num % 10;

			if (contPosicion == position) {

				cifra = newDigit;

			}

			newNumber += cifra * (int) Math.pow(10, exponente);

			num = num / 10;
			contPosicion++;
			exponente++;

		}

		return newNumber;

	}

	// This function receives a number and a digit and returns the first position of
	// this digit. in the number, as a way t o illustrate the input and output
	// providing that this call is performed digitPosition(54492,4) the returned
	// value should be 3, the position of the first occurrence of the digit 4.
	public static int digitPosition(int num, int digit) {

		int contadorPosicion = 0;
		int cifra;
		boolean continuar = true;

		while (num > 0 && continuar) {

			cifra = num % 10;

			if (cifra == digit) {

				continuar = false;

			}

			num /= 10;
			contadorPosicion++;

			// añadir variable de guardia
		}

		return contadorPosicion;
	}

	// delete the n digit of a given number num
	// for example, for the number 45634 if N is 3 the expected outcome is 4534 as
	// the 6 in the middle is drop
	public static int deleteNDigit(int num, int N) {

		int cifra, exponente = 0, contPosicion = 1, numRes = 0;

		while (num > 0) {

			if (contPosicion != N) {

				cifra = num % 10;
				numRes = numRes + cifra * (int) Math.pow(10, exponente);
				exponente++;

			}

			contPosicion++;
			num = num / 10;

		}

		return numRes;

	}

	// to code this function use what you already have in this class
	static boolean isCapicua(int num) {

		return reverse(num) == num;
	}

	// program a function called isPrimeNumber that guesses if a number is a prime
	// number
	static boolean isPrimeNumber(int num) {

		boolean isPrime = true; // Boolean type for prime check.

		for (int j = 2; j <= (num / 2); j++) { // Checks for divisors for the given number up to it's maximum divisor.

			if (num % j == 0) { // Once there is a number that divides with module==0 sets the flag to false.
				isPrime = false;
				break; // Break to optimize computing costs.
			}

		}

		return isPrime; // Returns true or false based on result.
	}

	static void rangedPrimeList(int min, int max) {
		// write a procedure named by rangedPrimeList that prints out the primer numbers
		// in a min max range
		// for instance, the prime numbers between 7 and 15 are 7, 11, 13

		int numaux = min; // Stores the smallest number in an auxiliary variable.
		String result = "";

		for (int i = min; i <= max; i++) {

			if (isPrimeNumber(numaux)) { // Calls for the "isPrimeNumber" function to check the current given number.
				result = result + " " + numaux; // If the returned result is true, stores the current number in result
												// string.
			}

			numaux++; // Increments the numaux variable for the next iterations of prime checks.
		}

		System.out.println(result);
	}

	static void nPrimeList(int num) {
		// use modularity
		// write a procedure named by nPrimeList that prints out the first n prime
		// numbers.
		// the list of the first five (n==5) prime numbers is as following: 2, 3, 5, 7,
		String result = "";
		int primeFound = 1;

		for (int i = 1; primeFound <= num; i++) { // Loop starts i on 1 and keeps going until
			// the found prime numbers eq the requested amount.
			if (isPrimeNumber(i)) { // Check if the current iteration is a prime number.
				result = result + " " + i; // Store the current iteration number in result.
				primeFound++; // Update the found prime number.
			}
		}
		
		System.out.print(result);

		//--
	}
	

	static int rotateNToTheLeft(int number, int n) {
		
		int numDigits = countDigits(number);
		int digit=0;
		int result=0;
		int position=0;
		
		n=n%numDigits;
		
		while (number>0 && n!=0) 
		{
			result+= digit*Math.pow(10,(position+n)%numDigits);
		}
		
		//if the rotation is zero we do not rotate we return the number as is.
		if(n==0) result=number;
		
		return result;
	}
	
	
	static int quitaPorDetras(int num,int n) {
		
		int quitar = 0;
		int result=num;
		
		while (quitar < n) {
			
			result = result/10;
			quitar++;
		}
		
		return result;
	}
	
	static int quitaPorDelante(int num, int n) {
		
		/*
		 * PAra quitar por delante, en lugar de truncar el numero con divisiones,
		 * usamos el teorema de la numeracion para obtener la cifra de los dos digitos a quitar, y esta cifra la 
		 * restamos al numero original.
		 */
		
		/*
		 * ejemplo 45123 - 45000 = 123
		 */
		
		int digitos=countDigits(num); // encuentra la cantidad de digitos en el numero.
		int truncado = digitos-n; // calcula la potencia a la cual elevar el 10.
		
		int restador = (int)(num/Math.pow(10, truncado)); // Despoja de los digitos que deseamos conservar al restador
		restador = (int)(restador*Math.pow(10, truncado)); // sostituye los digitos despojados por zeros.
		
		int result = num-restador; // realiza la resta. 
		
		return result;
		
		}
		
	

	static void pegaPorDetras (int num, int digit) {
		
		/*
		 * coge un numero dado y aumenta las posiciones de sus digitos en uno y luego le suma el digito dado con posicion 0.
		 * Ejemplo
		 * 1524 de posicion 3210 se convierte en 15240 de posicion 43210 y luego se le suma el digito.
		 * La manera mas sencilla de aumentar una posicion a todos los digitos es multiplicar por 10.
		 */
		
		System.out.println((num*10)+digit);
		
	}

	static int pegaPorDelante(int num, int digit) {
		/*
		 * cuenta los digitos del numero entregado
		 * suma el digito pasado multiplicado por las posiciones totales +1
		 */
		
		int numDigitos= countDigits(num);
		
		// En lugar de asignar a una variable el resutlado de la operación, devolvemos la operacion en si misma.
		return (int) (num + (digit*Math.pow(10, (numDigitos))));
		
		}
	
	static int trozoDeNumero(int num, int posInicio, int posFin) {
							
		return quitaPorDelante( quitaPorDetras( num,posInicio ),( countDigits(num)-posFin-1 ) );
		
		}
	
	
	// MINIMO COMUN MULTIPLO
	//mcm(a,b) = |a*b| / mcd(a,b)
	// |a*b| indica valor abosluto.
	static int mcm(int num1, int num2) {
		// Posiciona el mayor numero en A y el menor en B
		
		// convierte los negativos en positivos para tener valor absoluto.
		if (num1 < 0) {num1*=-1;}
		if (num2 < 0) {num2*=-1;}
		
		int a = Math.max(num1, num2);
		int b = Math.min(num1, num2);
			
		return a*b/mcd(a,b);
		
	}
	

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
	
	
	public static void main(String[] args) {

	//pegaPorDetras(16253,9);
	
	//System.out.println(pegaPorDelante(1654,3));
		
	
		
	//System.out.println(	quitaPorDetras(123456,2));
	
	//quitaPorDelante(45123,2);
	
	//trozoDeNumero(918273,2,4);
		
	//System.out.println(trozoDeNumero(25555191,3,6));	
	
	//System.out.print(mcd(150,39));
	System.out.print(mcm(150,-39));
		
	}
	
}
