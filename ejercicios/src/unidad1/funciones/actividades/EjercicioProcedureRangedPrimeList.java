package unidad1.funciones.actividades;

public class EjercicioProcedureRangedPrimeList {
	
	
	static rangedPrimeList(int min, int max) {
		// write a procedure named by rangedPrimeList that prints out the primer numbers
		// in a min max range
		// for instance, the prime numbers between 7 and 15 are 7, 11, 13

		int numaux = min; // Stores the smallest number in an auxiliary variable.
		String result = "";

		for (int i = min; i <= max; i++) {

			if (isPrimeNumber(numaux)) { // Calls for the "isPrimeNumber" function to check the current given number.
				result = result + " " + numaux; // If the returned result is true, stores the current number in result
												// string.
			}

			numaux++; // Increments the numaux variable for the next iterations of prime checks.
		}

	}
	
	

	public static void main(String[] args) {
		// Use modularity
		// write a procedure named by rangedPrimeList that prints out the prime numbers in a min-max range.
		// For instance; the prime numbers between 7 and 15 are 7, 11 and 13
		
		
		
		
		

	}

}
