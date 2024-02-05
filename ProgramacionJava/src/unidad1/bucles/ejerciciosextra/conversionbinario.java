package unidad1.bucles.ejerciciosextra;

import java.util.Scanner;

public class conversionbinario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=0, numaux=0;
		int cifra=0;
		int contadorExponente=0;
		double numdecimal=0.0; //aqui almacena los valores decimales cada iteración.
		
		System.out.println("introduce binario");
		Scanner scan = new Scanner(System.in);
		num=scan.nextInt();
		
		numaux=num;
		
		while(numaux!=0) {			
			cifra=numaux%10;
			
			if (cifra!=0) { // En el caso de que cifra sea '0' nos saltamos la potencia.
			numdecimal = numdecimal + cifra*Math.pow(2, contadorExponente);
			}
			numaux=numaux/10;
			contadorExponente++;
		}
		
		System.out.println(numdecimal);
		
		scan.close();
		

	}

}
