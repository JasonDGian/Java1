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

	}
	
	// HACER EJEMPLO DE RECORRIDO POR FILAS
	// HACER EJEMPLO DE RECORRIDO POR COLUMNAS
	// HACER LA SUMA RECORRIDA POR FILAS
	// HACER LA MULTIPLICACION RECORRIDA POR FILAS
	
	
	} // cierra el main
}
