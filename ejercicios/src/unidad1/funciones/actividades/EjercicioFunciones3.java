package unidad1.funciones.actividades;

import java.util.Scanner;

public class EjercicioFunciones3 {

	static double mediaTemp(int tempMin, int tempMax) {

		return (tempMin + tempMax) / 2.0;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Introduce el numero de dias a evaluar.");
		Scanner sc = new Scanner(System.in);
		int numDias = sc.nextInt(); // pedimos el numero de dias al usuario.

		for (int i = 1; i <= numDias; i++) {
			System.out.println("Dia " + i);
			System.out.println("Introduce la temperatura minima del dia.");
			int tempMin = sc.nextInt();

			System.out.println("Introduce la tempratura maxima del dia.");
			int tempMax = sc.nextInt();

			System.out.println(mediaTemp(tempMin, tempMax));

			sc.close();
		}

	}

}
