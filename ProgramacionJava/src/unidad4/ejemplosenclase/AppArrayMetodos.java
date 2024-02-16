package unidad4.ejemplosenclase;

public class AppArrayMetodos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] arrayInteger = ArrayMetodos.rellenaArrayAleatorios(20, 55);
		
		ArrayMetodos.mostrarArray(arrayInteger);
			
		int[] arrayRevertido = ArrayMetodos.revierteArray(arrayInteger);
		
		ArrayMetodos.mostrarArray(arrayRevertido);
		
		Double[] arrayWrap = ArrayMetodos.rellenaArrayAleatoriosWrap(20, 55d);
		
		ArrayMetodos.mostrarArray(arrayWrap);
		
		ArrayMetodos.revierteArray(arrayWrap);
		
		ArrayMetodos.revierteArray(arrayWrap);
		
		Double max = ArrayMetodos.maxInArray(arrayWrap);
	
		System.out.println(max);
		
		Double min = ArrayMetodos.minInArray(arrayWrap);
		
		System.out.println(min);
		  
		// Tenemos dos maneras de recorrer un arra en un for.
		// Con indices o con un for each que se compone de " for(tipo nombreItem: nombreArray){}
		
		Integer[] num = {1,2,3};
		String[] lin = {"uno", "dos", "tres"};
		String[] arrayString = ArrayMetodos.combinaArrays(num, lin);
		
		ArrayMetodos.mostrarArray(arrayString);
	}

}
