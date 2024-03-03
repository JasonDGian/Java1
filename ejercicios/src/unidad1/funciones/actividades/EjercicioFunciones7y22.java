package unidad1.funciones.actividades;

public class EjercicioFunciones7y22 {

	static double potencia(double base, double exponente) {

		double resultadoPot = 1;

		for (double i = 1; i <= exponente; i++) {

			resultadoPot = resultadoPot * base;

		}

		return resultadoPot;

	}

	/* FUNCION FACTORIAL */
	static double factorial(double numero) {

		double resultadoFact = 1;

		for (double i = 1; i <= numero; i++) {

			resultadoFact *= i;

		}

		return resultadoFact;
	}

	static double nTermino(double x, double n) {

		return potencia(x, n) / (double) factorial(n);

	}

	static double functionE(double x, double precision) {
		// precision se refiere al numero de terminos. Precision de aproximación, cuanto
		// mas sumas mas preciso.

		double sumaTerminos = 0.0;

		for (double i = 0; i <= precision; i++) {

			// sumaTerminos+=potencia(x,i)/ (double) factorial(i);
			sumaTerminos += nTermino(x, i);
		}

		return sumaTerminos;
	}

	// EJERCICIO 22 - BUCLES

	static double nTerminoSen(double x, double n) {

		int signo;
		if (n % 2 == 0) {
			signo = 1;
		} else {
			signo = -1;
		}

		return signo * potencia(x, 2 * n + 1) / (double) factorial(2 * n + 1);

	}

	static double senX(double x, double precision) {
		/*
		 * (-1)^n -> -1*-1 ejemplo : -1*-1 = 1 -1*-1*-1 = -1
		 */

		double sumaTerminos = 0.0;

		for (double i = 0; i <= precision; i++) {

			// sumaTerminos += signo * potencia(x,2*i+1)/ (double) factorial(2*i+1);
			sumaTerminos += nTerminoSen(x, i);

		}

		return sumaTerminos;
	}

	// N TERMINOS COSENO
	static double nTerminoCosen(double x, double n) {

		int signo;
		if (n % 2 == 0) {
			signo = 1;
		} else {
			signo = -1;
		}

		return signo * (potencia(-1, n) / (double) factorial(2 * n)) * potencia(x, (2 * n));

	}

	static double cos(double x, double precision) {

		double sumaTerminos = 0.0;

		for (double i = 0; i <= precision; i++) {

			sumaTerminos += nTerminoCosen(x, i);

		}

		return sumaTerminos;
	}

		
	
	
	public static void main(String[] args) {
		// utilizar funciones y modularidad. factoriales y exponentes.

		// factorial potencia y funcion E

		// System.out.println("potencia " + potencia(2, 5));
		// System.out.println("factorial " + factorial(5));

		// System.out.println(functionE(5, 20));
		// System.out.println(functionE(5, 30));

		// System.out.println(cos(5,100));

	}

}