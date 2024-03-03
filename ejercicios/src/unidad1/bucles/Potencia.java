package unidad1.bucles;

import java.util.Scanner;

public class Potencia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dame el n�mero del que quieres calcula la potencia a la cuarta");
		
		num= sc.nextInt();
		int j=1;
		int potencia=1;
		while ( j<=4 ) {
			
			potencia=num*potencia;
			j++;
		}
		
		System.out.println("El resultado de la potencia a la cuarta para el numero " 
		+ num  + " es " + potencia);
			

	}

}
