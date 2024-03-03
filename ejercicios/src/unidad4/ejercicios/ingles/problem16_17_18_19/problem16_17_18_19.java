package unidad4.ejercicios.ingles.problem16_17_18_19;

import unidad4.ejemplosenclase.ArrayMetodos;

public class problem16_17_18_19 {

	
	
	/** -------------------  PROBLEM 16  ------------------- 
	 * 	Receives an array as a parameter and returns
	 *  the number of positives found in it.
	 */
	private static int numberOfPositivesInArray(Integer[] arrayParam) {

		int itemCounter = 0;

		for (Integer item : arrayParam) {

			if (item > 0) {
				itemCounter++;
			}

		}

		return itemCounter;

	}
	
	
	/** -------------------  PROBLEM 17  ------------------- /*
	 * Receives an array as a paremter and returns the number
	 * of negative numbers found in it.
	 */
	private static int numberOfNegativesInArray(Integer[] arrayParam) {

		int cont=0;
		
		for (Integer num: arrayParam) {
			
			if (num<0) {cont++;}
			
		}
		
		return cont;

	}

	/** -------------------  PROBLEM 18 -------------------
	 * Receives an array and returns another array with all the
	 * positive numbers of the first array within it. 
	 */
	public static Integer[] returnArrayWithPositives(Integer[] arrayParam) {
		
		// Declares an array of the same length as the number of positives in arrayParam.
		Integer[] resultArray = new Integer[numberOfPositivesInArray(arrayParam)];
		int index = 0;

		for (int i = 0; i < arrayParam.length; i++) {

			if (arrayParam[i] > 0) {

				resultArray[index] = arrayParam[i];
				index++;

			}
		}

		// Returns result array.
		return resultArray;

	}
	
	
	/** -------------------  PROBLEM 18 B -------------------
	 * Just like the last one except with negatives.
	 */
	public static Integer[] returnArrayWithNegatives(Integer[] arrayParam) {

		// Declares an array of the same length as the number of positives in
		// arrayParam.
		Integer[] resultArray = new Integer[numberOfNegativesInArray(arrayParam)];
		int index = 0;

		for (int i = 0; i < arrayParam.length; i++) {

			if (arrayParam[i] < 0) {

				resultArray[index] = arrayParam[i];
				index++;

			}
		}

		// Returns result array.
		return resultArray;

	}
	
	
	/** -------------------  PROBLEM 19 -------------------
	 * Returns a sum of all the positive numbers found in the array.
	 */
	private static Integer sumPositiveNumbers(Integer[] arrayParam) {
		
		Integer acumulador=0;
		
		for (Integer num : arrayParam) {
			
			if ( num > 0 ) {
				acumulador=acumulador+num;
			}
			
		}
		
		return acumulador;
	}
	
	/** -------------------  PROBLEM 19 B -------------------
	 * Returns a sum of all the negative numbers found in the array.
	 */
	private static Integer sumNegativeNumbers(Integer[] arrayParam) {
		
		Integer acumulador=0;
		
		for (Integer num : arrayParam) {
			
			if ( num>0 ) {
				acumulador=acumulador+num;
			}
			
		}
		
		return acumulador;
	}
	
	/** -------------------  PROBLEM 20 -------------------
	 * Receives an array and a value. The program tries to find the element 
	 * within the given array.
	 */

	private static String searchElementInArray(Integer element, Integer[] arrayParam) {

		boolean itemFound = false;
		int elementPosition = 1;
		int elementIndex = 0;

		while (!itemFound) {

			if (arrayParam[elementIndex] == element) {

				itemFound = true;

			}

			else {
				elementPosition++;
				elementIndex++;
			}

		}

		return "Element is found in the position = " + elementPosition + "\nElement is found in the index = "
				+ elementIndex;
	}
	
	/** -------------------  PROBLEM 21 & 22 -------------------
	 * Receives an array and deltes the duplicate items in it.
	 */
	private static Integer[] deleteDuplicateItemsArray(Integer[] arrayParam) {
		// Declare new array based on length of parameter array.
		Integer[] newArray = new Integer[arrayParam.length];
		// index control variable.
		int nextIndex = 0;
		// repetition control variable.
		boolean repeatedValue;
		// For each item in the parameter array we make a check.
		for (Integer item : arrayParam) {
			// Starting with the supposition that the current value is not repeated.
			repeatedValue = false;
			// We check the values within the new array as many times as the array has
			// values.
			for (int i = 0; i <= nextIndex; i++) {
				// If the current tested value DOES appear within the new array then mark it as
				// a repeated value.
				if (item == newArray[i]) {
					repeatedValue = true;
				}
			}
			// if the given value is not marked as repeated then store it and go next.
			if (!repeatedValue) {
				newArray[nextIndex] = item;
				nextIndex++;
			}
		}
		// Rebuild the new array without the null values.
		Integer[] resArray = new Integer[nextIndex];
		for (int i = 0; i < resArray.length; i++) {
			resArray[i] = newArray[i];
		}
		// return the rebuilt resulting array.
		return resArray;
	}
	
	/** -------------------  PROBLEM 23 -------------------
	 * 
	 */
	/*
	private static Integer findSecondSmallestElement(Integer[] arrayParam) {
		// Declare new array based on length of parameter array.
		Integer[] newArray = new Integer[arrayParam.length];
		Integer smallest;
		Integer secondSmallest;
		
		for (Integer item : arrayParam ) {
			
			if (item ) {
				secondSmallest=smallest;
				smallest=item;
				
			}
			
		}
		return secondSmallest;
	}*/

	
	// hacer un metodo que muestre los numeros de negativos

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer[] arrayInt = ArrayMetodos.rellenaArrayAleatoriosWrap(10, -10,10);
		
		ArrayMetodos.mostrarArray(arrayInt);
		
		// print number of positives within array.
		System.out.println("Number of positive numbers in array: " +  numberOfPositivesInArray(arrayInt));
		
		// print number of negatives within array.
		System.out.println("Number of negatives numbers in array: " + numberOfNegativesInArray(arrayInt));
		
		// receive random array and return another array with only positives.
		ArrayMetodos.mostrarArray(returnArrayWithPositives(arrayInt));
		ArrayMetodos.mostrarArray(returnArrayWithNegatives(arrayInt));
		
		System.out.println( sumPositiveNumbers(arrayInt));
		System.out.println( sumNegativeNumbers(arrayInt));
		
		
		// Search for item in given array.
		Integer [] prueba = {1,2,3,2,3,4,5};
		//System.out.println(searchElementInArray(19, prueba));
		
		
		ArrayMetodos.mostrarArray(deleteDuplicateItemsArray(prueba));
		//System.out.println( findSecondSmallestElement(prueba));
		
	}

}
