package unidad4;

public class EjerciciosIngles {

	//Problem2 
	//Write a program to calculate the average value of array elements. 
	public static double average (int[] array) {
		
		int average = 0;
		
		for (int i=0; i<array.length; i++) {
			
			average+=array[i];
			
		}
		
		
		return average/array.length;
	}
	
	
	public static <T extends Number>double average (T[] array) {
		
		int acumulator = 0;
		
		for (int i=0; i<array.length; i++) {
			
			acumulator+= array[i].doubleValue();
			
		}
		
		return (acumulator/array.length);
	}
	
	public static void main () {
		
		int [] arrayx = {1,2,3,4,5};
		
		average(arrayx);
		
	}
	
	
}
