package unidad4.ejercicios.ingles.problem20;


/** -------------------  PROBLEM 20 -------------------
 * Receives an array and a value. The program tries to find the element 
 * within the given array.
 */
public class SearchElementInArray {
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
		
}

