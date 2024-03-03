package unidad4;

import java.lang.reflect.Array;
import java.util.Locale;

public class ArrayConLiterales {

	public static void pintarArrayEnteros(int[] array) {
		for (int i=0; i<array.length ; i++) {
			
			if (i==array.length-1) { 
				System.out.format("|%-4d", array[i]);
				}
		
			else { 
				System.out.format("|%-4d", array[i]);
			}	
		}
		
		System.out.println();
	}
	
	// Pintar con sobrecarga.
	public static void pintarArrayEnteros(int[] array, int numFinal) {
		// El orden de la evaluacion es importante porque en este caso por ejempleo
		// la segunda evaluacion va a generar un error out of bounds en la ultima iteracion del bucle.
		// entonces si con la primera evaluacion se sale del bucle evitando la segunda evaluacion
		// podemos evitar el errorr en el programa.
		for (int i=0; i<array.length && array[i]!=numFinal ; i++) {
			
			if (i==array.length-1) { 
				System.out.format("|%-4d", array[i]);
				}
		
			else { 
				System.out.format("|%-4d", array[i]);
			}	
		}
		
		System.out.println();
	}
	
	// Ejercicio 7
	public static void pintarArrayCadenas (String[] cadena, String cadFinal) {
		cadFinal="";
		
		for (int i = 0; i<cadena.length && cadena[i]!=cadFinal; i++) {
			
		if (i == cadena.length-1) {
			System.out.format("|%-20s|", cadena[i]);
		}
		else {
			System.out.format("|%-20s|", cadena[i]);

			}
		}
		System.out.println();
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int [] arrayDias = {1,2,3,4,5,6,7};
	
		pintarArrayEnteros(arrayDias);
		
	}
	

}
