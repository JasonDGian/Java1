package unidad4.ejercicios.ingles.problem21_22;

public class DeleteDulicates {
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
}

