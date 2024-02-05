package unidad1.funciones.actividades;

import java.util.Scanner;

public class EjercicioFunciones2 {

	static boolean esMultiplo(int num1, int num2) {

		// Si hicieramos la funcion con stirng.
		
// static String esMultiplo(int num1, int num2){
		/*String resultado = "";

		if (num1 % num2 == 0) {
			resultado = num1 + " es multiplo de " + num2;
		}

		else if (num2 % num1 == 0) {
			resultado = num2 + " es multiplo de " + num1;
		}

		else {
			resultado = "Los numeros no son multiplos.";
		}

		return resultado;*/
		
		return (num1%num2==0);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Introduce un numero.");
		Scanner sc = new Scanner(System.in);

		int num1 = sc.nextInt();
		System.out.println("Introduce otro numero.");
		int num2 = sc.nextInt();

		System.out.println(esMultiplo(num1, num2));

		sc.close();

	}

}
