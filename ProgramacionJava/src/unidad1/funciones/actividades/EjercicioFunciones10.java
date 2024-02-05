package unidad1.funciones.actividades;

import java.util.Scanner;

public class EjercicioFunciones10 {
	
	//Funcion de cantidad de segundos.
	static int cantidadSegundos(int horas, int minutos, int segundos) {
		
		return (horas*3600)+(minutos*60)+(segundos);
		
	}
	
	static String cantidadAHoras (int segundosTotales) {
		
		int segundos = segundosTotales%60;
		segundosTotales/=60;
		int minutos = segundosTotales%60;
		segundosTotales/=60;
		int horas = segundosTotales%60;
		
		String resultado = horas + ":" + minutos + ":"  + segundos;

		return resultado;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		Scanner scan = new Scanner(System.in);
		int opcion = 0;
		int segundos, minutos, horas;
		
		while (opcion != 3) {
			
			System.out.println("\n\n------------------------------------------");
			System.out.println("| Elija la operación que desea realizar. |");
			System.out.println("------------------------------------------");
			System.out.println("| 1 - Segundos a horas.                  |");
			System.out.println("| 2 - Horas a segundos.                  |");
			System.out.println("| 3 - Salir del programa.                |");
			System.out.println("------------------------------------------");
			opcion=scan.nextInt();
			
			switch (opcion) {
			
				case 1:
					System.out.println("Introduzca la cantidad de segundos");
					segundos = scan.nextInt();
					System.out.println(cantidadAHoras(segundos));
					break;
					
				case 2: 
					System.out.println("Introduzca la cantidad de horas");
					horas = scan.nextInt();
					System.out.println("Introduzca la cantidad de minutos");
					minutos = scan.nextInt();
					System.out.println("Introduzca la cantidad de segundos");
					segundos = scan.nextInt();
					System.out.println(	cantidadSegundos(horas, minutos, segundos));
					break;
					
			} // Cierre del switch.
				
		} // Cierre del while
		
		System.out.println("Saliendo del programa");
		scan.close();
				
	}

}
