package unidad4.ejercicios.ingles.Problem25;

public class OddNumbersInArray {
	/*
	 * Problem 25. Write a program that identifies the Odd elements in two arrays
	 * and creates a third array with those elements
	 * Sample Output
	 * First Array = {1, 2, 3, 4, 5} 
	 * Second Array = {6, 7, 8, 9, 10} 
	 * Odd Element Store in Third Array = {1, 3, 5, 7, 9}
	 */
	
	
	public static <T> void printArray(T[] array) {
		
		String valores = null;
		
		for (T item : array) {
			
			if (valores == null) {
				valores = "" + item;
			}
			else {
			valores = valores + ", " + item;
			}
		
		}
		
		System.out.println("Valores: { " + valores + "}");
		
	} 
	
	
	private static int getNumOddNumbersInArray(Integer[] arrayParam) {
		// Function takes an array as a paremeter and counts how many
		// odd numbers it contains.

		// Initializes the odd numbers counter to 0.
		int oddCounter = 0;

		// For each number within the prameter array we check;
		for (Integer item : arrayParam) {

			// if the current item is NOT divisble by 2 then
			// increment the count counter variable by 1.
			if (item % 2 != 0) {
				oddCounter++;
			}

		}
		// Return the counter value.
		return oddCounter;

	}
	
	// Takes 2 arrays and returns one array with the odd numbers of the 2 given arrays.
	private static Integer[] getOddNumberFromArrays( Integer[] array1, Integer[] array2 ){
		
		// Create a third array based on the occurences of odd numbers in the parameterized arrays. 
		Integer[] resultArray = new Integer[getNumOddNumbersInArray(array1) + getNumOddNumbersInArray(array2)];
		int currentIndex = 0;
		
		for (Integer item : array1) {
			
			if (item % 2 != 0 ) {
				resultArray[currentIndex]=item;
				currentIndex++;
			}
			
		}
		
		
		// Return the result.
		return resultArray;
	}
	
	
	// Main method for testing.
	public static void main(String[] args) {
		
		
		Integer[] array = {10,11,12,13,14,15,16,17,18,19};
		Integer[] arrax = {1,2,3,4,5,6,7,8,9};
		
		System.out.println (getNumOddNumbersInArray(array));
		System.out.println (getNumOddNumbersInArray(arrax));
		
		printArray(	getOddNumberFromArrays(array, arrax));
		
	}
	
}
