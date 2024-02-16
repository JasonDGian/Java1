package unidad4.ejercicios.ingles.problem16_17_18_19;

import unidad4.ejemplosenclase.ArrayMetodos;

public class problem16_17_18_19 {

	private static int numberOfPositivesInArray(Integer[] arrayParam) {

		int cont=0;
		
		for (Integer num: arrayParam) {
			
			if (num>0) {cont++;}
			
		}
		
		return cont;

	}
	
	private static int numberOfNegativesInArray(Integer[] arrayParam) {

		int cont=0;
		
		for (Integer num: arrayParam) {
			
			if (num<0) {cont++;}
			
		}
		
		return cont;

	}

	
	private static Integer[] returnArrayWithPositives(Integer[] arrayParam) {

		Integer[] arrayResult = new Integer[numberOfPositivesInArray(arrayParam)];
		

		return arrayResult;

	}
	
	
	
	private static Integer sumPositiveNumbers(Integer[] arrayParam) {
		
		Integer acumulador=0;
		
		for (Integer num : arrayParam) {
			
			if ( num>0 ) {
				acumulador=acumulador+num;
			}
			
		}
		
		return acumulador;
	}
	
	private static Integer sumNegativeNumbers(Integer[] arrayParam) {
		
		Integer acumulador=0;
		
		for (Integer num : arrayParam) {
			
			if ( num<0 ) {
				acumulador=acumulador+num;
			}
			
		}
		
		return acumulador;
	}
	
	
	private static Integer searchElementInArray( Integer[] arrayParam, Integer elementoBuscado) {
		
		Integer index=0;
		Integer position=1;
		
		for (Integer elemento : arrayParam) {
			
			if (elemento==elementoBuscado) {  }
			index++;	
			position++;
		}
		
		return ;
	}
	
	
	
	
	
	
	// hacer un metodo que muestre los numeros de negativos

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer[] arrayInt = ArrayMetodos.rellenaArrayAleatoriosWrap(20, -50,50);
		
		ArrayMetodos.mostrarArray(arrayInt);
		
		System.out.println(	sumNegativeNumbers(arrayInt) );
		
		
	}

}
