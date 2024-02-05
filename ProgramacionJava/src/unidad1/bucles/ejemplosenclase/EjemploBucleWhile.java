package unidad1.bucles.ejemplosenclase;

public class EjemploBucleWhile {

	public static void main(String[] args) {
		// Ejemplo de bucle sencillo.
		
		// Inicializamos la variable contador.
		int i=0;
		
		// variable de tipo contador - tipo psuma.
		int sum=0;
		
		// variable de tipo maximo.
		int max;
		// variable de tipo minimo.
		int min;
		
		max=i;
		min=i;
		
		// Mientras que la I sea menor a 10, imprimirá por pantalla "Hola".
		while (i<10) {
			
			System.out.println("El valor del contador es " + i);
			sum+=i;
			i=i+1;
			
			if (i>max) max=i;
			if (i<min) min=i;
		}
		
		System.out.println(sum +  " - " + max +  " - " + min);
		
		// a las expresiones condicionales se les puede hacer un "inspect" con el click derecho. Eso se puede hacer durante la depuración.
	}

}
