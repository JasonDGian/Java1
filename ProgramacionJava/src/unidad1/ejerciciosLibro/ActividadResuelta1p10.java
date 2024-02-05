package unidad1.ejerciciosLibro;

import java.util.Scanner;

public class ActividadResuelta1p10 {

	public static void main(String[] args) {
		/* 
		 * Diseñar un algoritmo que nos indique si podemos salir a la calle. Existen aspectos que influirán en esta decisión.
		 * Si está lloviendo y si hemos termiando nuestras tareas. Solo podremos salir a la calle si no está lloviendo y hemos finalizado nuestras tareas.
		 * Existe una opción en la que si o si podremos salir a la calle y es que tengamos que ir a la biblioteca.
		 * Solicitar al usuario mediante un booleano si llueve, si ha finalizado las tareas y si necesita ir a la biblioteca. 
		 * El resultado del algoritmo será en booleano. 
		 */ 
			
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("¿Está lluviendo?");
		boolean estaLluviendo = scanner.nextBoolean();
		
		System.out.println("¿Has completado la tarea?");
		boolean tareasHechas = scanner.nextBoolean();
		
		System.out.println("¿Necesitar is a la biblioteca?");
		boolean irBiblioteca = scanner.nextBoolean();
		
		boolean otorgarPermiso = ( tareasHechas && !estaLluviendo ) || ( irBiblioteca );
		
		System.out.println("El usuario tiene permiso: " + otorgarPermiso);
		
		scanner.close();

	}

}
