package unidad1.bucles.ejercicios;

public class Ejerciciobucles14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 *  La clave es saber el numero final de asteriscos.
		 *  Ejemplo un arbol de altura 4 tendra filas 1, 3, 5, 7.
		 *  en la ultima fila, espacios 0, en la primera seran 3 (la mitad entera de 7).
		 * 
		 */
		
		int altura = 8;
		
		// Bucle externo que itera hasta alzancar el valor de la variable de altura.
		for (int i = 1; i<=altura; i++) {
			// Crear dos bucles. Uno imprime espacios blancos y el otro imprime las estrellas.
			
			
			// Este bucle pinta los espacios blancos.
			// Para este bucle el valor de jota sera igual a la altura deseada menos el valor de la iteración corriente.
			// Se ciclará hasta llegar a 1 mediante decrementos de 1.
			for (int j = altura-i; j>=1; j--) {  
				
				System.out.print(" ");
			}	
			
			
			// Este bucle pinta los asteriscos.
			// Para este bucle el valor de K será de 1
			// El criterio de iteracion será k menor o igual al doble del valor de la itearcion corriente menos 1.
			// De este modo se iterará (i*2-1) 1 vez, 3 veces, 5 veces, 7 , 9 etc...
			for (int k = 1; k<=(i*2)-1; k++) { 
				
				System.out.print("*");
			}	
			
		 System.out.println(); // Corte de linea. Retorno carro.
		 
		}
		
	}

}





/*


---*
--***
-*****
*******


*/