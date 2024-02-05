package unidad4;

import java.util.Locale;
import java.util.Random;

public class ArrayTemperatura {

	
	public static void pintarArray(double[] array) {
		for (int i=0; i<array.length ; i++) {
			
			if (i==2) { 
				System.out.format(Locale.ITALIAN, "|%-4.2f", array[i]);
				}
		
			else { 
				System.out.format(Locale.ITALIAN, "|%-4.2f", array[i]);
			}	
		}
		
		System.out.println();
	}
	
	// Procedimiento rellenar con 1.
	// En este procedimiento se le hace un "paso por referencia".
	public static void rellenarConUnos(double[] array) {
		for (int i=0; i<array.length ; i++) {
			
			array[i]=1;
			
		}	
	}
	
	// EJERCICIO 1
	public static int[] creaArrayConNumerosAleatorios(int tam) {
		
		// rear un metodo que cree un array con numeros aleatorios.
		// La funcion recibe un entero que define le tamaño de la array.
		
		// pueso usar variables de tipo entero para asignar el tamaño a la rray
		int[] array = new int[tam];
				
		for (int i=0; i<array.length; i++) {
			
			array[i] = (int) new Random();
			
		}
		
		//devuelvo la referencia al array
		// podemos devolver la referencia del array o de un elemento dentro de ella.
		return array;
	}
	
	// EJERCICIO 2
	
	
	
	
	// EJERCICIO 3
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(creaArrayConNumerosAleatorios(5));
		
		//double [] temperatures = new double[20];
		
		//rellenarConUnos(temperatures);
		
		//pintarArray(temperatures);
		
		
		
		
		
		
		
		
		
	} // Cierra el main
	
} // Cierra la clase
