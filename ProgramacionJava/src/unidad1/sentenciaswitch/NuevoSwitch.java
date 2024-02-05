package unidad1.sentenciaswitch;

import java.util.Scanner;

public class NuevoSwitch {
	
	public static void main(String[] args) {
		
		int diaNum = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un dia de la semana");
		
		diaNum = sc.nextInt();
		
switch (diaNum){
	
	case 1 -> System.out.println( "Lunes");
	case 2 -> System.out.println("Martes");
	case 3 -> System.out.println("Miercoles");
	case 4 -> System.out.println("Jueves");
	case 5 -> System.out.println("Viernes");
	case 6 -> System.out.println("Sabado");
	case 7 -> System.out.println("Domingo");
	default -> System.out.println("No es un dia de la semana");
	
	};
		
		
	}

}
