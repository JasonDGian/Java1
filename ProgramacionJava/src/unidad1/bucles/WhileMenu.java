package unidad1.bucles;

import java.util.Scanner;

public class WhileMenu {
	public static void main(String[] args) {

		int opcionNumero=1; 
		double medida; 
		double pulgadas; 

		Scanner sc = new Scanner(System.in);

		
		while (opcionNumero != 5) {

			System.out.println("Que unidad de medida vas a usar?");
			System.out.println();
			System.out.println(" 1. pulgadas");
			System.out.println(" 2. pies");
			System.out.println(" 3. yardas");
			System.out.println(" 4. millas");
			System.out.println();
			System.out.println("Introduce el num�ro seleccionado entre 1 y 5: ");
			opcionNumero = sc.nextInt();

			/* Read user�s measurement and convert to inches. */
			switch (opcionNumero) {
			case 1:
				System.out.println("Introduce el n�mero de pulgadas ");
				medida = sc.nextDouble();
				pulgadas = medida;
				System.out.println("La conversi�n a pulgadas es: " + pulgadas);
				break;
			case 2:
				System.out.println("Introduce el n�mero de pies: ");
				medida = sc.nextDouble();
				pulgadas = medida * 12;
				System.out.println("La conversi�n a pulgadas es: " + pulgadas);
				break;
			case 3:
				System.out.println("Introduce el n�mero de yardas: ");
				medida = sc.nextDouble();
				pulgadas = medida * 36;
				System.out.println("La conversi�n a pulgadas es: " + pulgadas);
				break;
			case 4:
				System.out.println("Introduce el n�mero de millas: ");
				medida = sc.nextDouble();
				pulgadas = medida * 63360;
				System.out.println("La conversi�n a pulgadas es: " + pulgadas);
				
			case 5:
				System.out.println("Final del programa. Adios! ");
				break;

			}

		}

		
		
	}

}

