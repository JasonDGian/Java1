package unidad1.sentenciaswitch;

import java.util.Scanner;

public class SwitchNumerico {

	public static void main(String[] args) {

		Integer numero = 0;
	
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce un entero entre 1 y 10");
		
	
		numero = sc.nextInt();

		switch (numero) { // (Asumimos que  N es un entero.)
		case 1:
			System.out.println("El número es 1.");
			break;
		case 2:
		case 4:
		case 8:
			System.out.println("El número es 2, 4, or 8.");
			System.out.println("(Son potencia de 2!)");
			break;
		case 3:
		case 6:
		case 9:
			System.out.println("El número es 3, 6, or 9.");
			System.out.println("(Es multiplo de  3!)");
			break;
		case 5:
			System.out.println("El número es 5.");
			break;
		default:
			System.out.println("El número es  7 o esta fuera del rango 1 to 9.");
		}

	}

}
