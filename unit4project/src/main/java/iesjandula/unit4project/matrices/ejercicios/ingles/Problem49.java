package iesjandula.unit4project.matrices.ejercicios.ingles;

public class Problem49 {

	public static void main(String[] args) {
		
	int[][] myMatrix = {
			{1,2,3},
			{4,5,6},
			{7,8,9}
			};
	
	/*
	for (int i = 0 ; i < myMatrix.length  ; i++ ) {
		
		for (int j = 0 ; j < myMatrix[i].length ; j++) {
			
			System.out.format("%s %4d %s", "|" + myMatrix[i][j] + "|");

			System.out.print(myMatrix[i][j] + " ");
			System.out.flush();
			
		}
		
		System.out.println();
		
	}*/
	
	
	// Acceder al numero de arrays dentro del padre arrayNombre.length
	// Acceder al numero de elementos dentro del array que esta dentro del padre arrayNombre[posicion].length
	
	System.out.println(myMatrix.length); // Este accede al numero de arrays dentro del array padre.
	System.out.println(myMatrix[0].length); // Este accede al numero de elementos dentro del array en posicion 0 ( que está dentro del array padre).
	
	
	// Recorrido por filas y por columnas.
	
	
	// Recorrido por FILAS:
	/*for (int i = 0; i < myMatrix.length; i++) {

		for (int j = 0; j < myMatrix[i].length; j++) {

			System.out.print(myMatrix[i][j]);

		}

		System.out.println();

	}*/
	
	// suma de matrices iguales EJERCICIO 52.
	/*
	int[][] a = {
			{1,2},
			{3,4}
			};
	
	int[][] b = {
			{1,1},
			{1,1}
			};
	
	int[][] c = new int [2][2];
	
	// queremos sumar a01 con b01
	for (int i = 0 ; i<a.length; i++) {
		
		for (int j = 0; j<a.length; j++) {
			c[i][j]=a[i][j]+b[i][j];
		}
		
	}
	
	for (int i = 0; i < c.length; i++) {

		for (int j = 0; j < c[i].length; j++) {

			System.out.print(c[i][j]);

		}

		System.out.println();

	}*/
	
	// ---------    INICIALIZAMOS O DECLARAMOS LOS ARRAYS 2D    --------------
	
	// Podemos declarar un array de dos maneras distintas.
	
	// Inicializar y asignar.
	String[][] matriz1 = new String[3][3];
	
	matriz1[0][0] = "A0";
	matriz1[0][1] = "A1";
	matriz1[0][2] = "A2";
	matriz1[1][0] = "B0";
	matriz1[1][1] = "B1";
	matriz1[1][2] = "B2";
	matriz1[2][0] = "C0";
	matriz1[2][1] = "C1";
	matriz1[2][2] = "C2";
	
	// Asignar directamente durante la declaración.
	String[][] matriz2 = {{"00","01","02"},{"10","11","12"},{"20","21","22"}};
	
	
	// ---------    HACER EJEMPLO DE RECORRIDO POR FILAS    --------------
		/*
		 * Recorrer por filas es el tipo de recorrido mas facil para los array.
		 * Para ello hacemos un bucle anidado de fors.
		 */
	
	// Esto  toma como valor la cantidad de arrays hijos dentro del array padre.
	int numeroFilas = matriz1.length; 
	
	for (int fila = 0; fila < numeroFilas ; fila++ ) {
		System.out.println("Cambio a fila " + fila);
		// Esto toma como valor de numero de columnas la cantidad de valores dentro del array actual.
		int numeroColumnas = matriz1[fila].length;
		
		for ( int columna = 0; columna < numeroColumnas ; columna++) {
			
			System.out.println("Fila " + fila + " Columna " + columna + ". Valor: " + matriz1[fila][columna]);
			
		}
	}
	
	System.out.println("----------------------");
	
	/*
	 * Resumen:
  	 * Sacamos el numero de iteraciones para FILAS viendo cuantos valores contiene el array PADRE.
	 * Sacamos el numero de iteraciones para CAMPS viendo el numero de valores que contiene CADA HIJO.
	 */
	
	
	// HACER EJEMPLO DE RECORRIDO POR COLUMNAS
	/*
	 * Debe de haber un contador de posicion de campo.
	 * Debe de haber un contador de posicion de filas
	 */
	
	// Esta variable almacena la cantidad de campos en la primera fila.
	// El problema de hacer esto sale cuando las filas no tienen cantidad iguales de campos.
	int cantidadCamposFila = matriz1[0].length;
	
	// Esta valor almacena la cantidad de arrays hijos dentro del padre, es decir, las filas.
	int cantidadFilas = 3;

	for (int campo = 0; campo < cantidadCamposFila ; campo++) {
		
		System.out.println("Campo " + campo );
		
		for (int fila = 0; fila < cantidadFilas; fila++) {
		
			System.out.println("Fila " + fila + " Valor: " + matriz1[fila][campo]);
		}
		
	}
	
	// Codigo compactado
	System.out.println("----------------------");
	for (int campo = 0; campo < matriz1[0].length ; campo++) {
		
		System.out.println("Campo " + campo );
		
		for (int fila = 0; fila < matriz1.length ; fila++) {
		
			System.out.println("Fila " + fila + " Valor: " + matriz1[fila][campo]);
		}
		
	}
	
	
	int[][] a = {
			{1,2},
			{3,4}
			};
	
	int[][] b = {
			{1,1},
			{1,1}
			};
	
	
	int[][] sumaAB = new int[2][2];
	
	// HACER LA SUMA RECORRIDA POR FILAS
	for (int i = 0 ; i<a.length ; i++) {
		
		for (int j = 0; j<a[0].length ; j++) {
			
			sumaAB[i][j] = a[i][j] + b[i][j];
		}
		
	}
	
	for (int i = 0 ; i<a.length ; i++) {
		System.out.println();
		for (int j = 0; j<a[0].length ; j++) {
			
			System.out.print(sumaAB[i][j]);
		}
		
	}

	// HACER LA MULTIPLICACION RECORRIDA POR FILAS
	
	int[][] productoAB = new int[2][2];
	for (int i = 0 ; i<a.length ; i++) {
		
		for (int j = 0; j<a[0].length ; j++) {
			
			productoAB[i][j] = a[i][j] * b[i][j];
		}
		
	}
	
	for (int i = 0 ; i<a.length ; i++) {
		System.out.println();
		for (int j = 0; j<a[0].length ; j++) {
			
			System.out.print(productoAB[i][j]);
		}
		
	}
	
	
	
	
	} // cierra el main
}// ciera clase
