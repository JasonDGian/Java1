package unidad1.funciones.actividades;

import java.util.Scanner;

public class EjercicioFunciones4 {


	static double ecuacion( double x ) {
		// Formula = f(x) = x^3 + 2x - 3;
		
		return (Math.pow(x, 3) + (2*x) -3)/x;
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("Dale un valor a la X");
		Scanner sc = new Scanner(System.in);
		double x = sc.nextDouble();
		
		System.out.println(ecuacion(x));

	}

}
