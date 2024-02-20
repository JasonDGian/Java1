package unidad4.ejercicios.ingles.problem24;

public class EvenNumbersInArray {
	
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
	
	
	private static int getNumEvenNumbersInArray(Integer[] arrayParam) {
		// Function takes an array as a paremeter and counts how many
		// even numbers it contains.

		// Initializes the even numbers counter to 0.
		int evenCounter = 0;

		// For each number within the prameter array we check;
		for (Integer item : arrayParam) {

			// if the current item is divisble by 2 then
			// increment the even counter variable by 1.
			if (item % 2 == 0) {
				evenCounter++;
			}

		}
		// Return the counter value.
		return evenCounter;

	}
	
	
	/*
	 * Problem 24. Write a program that identifies the Even elements in two arrays
	 * and creates a third array with those elements Sample Output 
	 * First Array = {1,2, 3, 4, 5} 
	 * Second Array = {6, 7, 8, 9, 10} 
	 * Even Element Store in Third Array = {2, 4, 6, 8, 10}
	 */

	private static Integer[] getEvenNumberFromArrays(Integer[] array1, Integer[] array2) {
		
		// Instantiate result array based on how many even numbers there are in array1 and array2.
		// Do this through the previously written function.
		Integer[] resultArray = new Integer[ getNumEvenNumbersInArray(array1) + getNumEvenNumbersInArray(array2) ];
		int index=0;
		
		// For each item in array
		for (Integer item : array1) {
			
			// check if divisible by 2.
			if ( item%2==0 ) {
				// if divisible by 2 then store item in result array at the current index.
				resultArray[index] = item;
				// increment index for next iteration.
				index++;
			}
			
		}
		
		// For each item in array
		for (Integer item : array2) {
			
			// check if divisible by 2.
			if ( item%2==0 ) {
				// if divisible by 2 then store item in result array at the current index.
				resultArray[index] = item;
				// increment index for next iteration.
				index++;
			}
			
		}
		
		return resultArray;
		
		
		
	}
	
	
	
	
	
	

	// Main method for testing.
	public static void main(String[] args) {
		
	
		Integer[] array = {10,11,12,13,14,15,16,17,18,19};
		Integer[] arrax = {1,2,3,4,5,6,7,8,9};
		
		System.out.println (getNumEvenNumbersInArray(array));
		System.out.println (getNumEvenNumbersInArray(arrax));
		
		printArray(	getEvenNumberFromArrays(array, arrax));
		
	}
}
