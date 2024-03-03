package unidad1.sentenciaswitch;

import java.util.Scanner;

public class NuevoSwitchAsignando {
	
	public static void main(String[] args) {
		
		int diaNum = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un dia de la semana");
		
		diaNum = sc.nextInt();
		
	String dia = switch (diaNum){
	
	case 1 -> "Lunes";
	case 2 -> "Martes";
	case 3 -> "Miercoles";
	case 4 -> "Jueves";
	case 5 -> "Viernes";
	case 6 -> "Sabado";
	case 7 -> "Domingo";
		
	
	default -> { 
			
		System.out.println("No es un dia de la semana");
		yield "No es un dia de la semana";
		
	}
	
	
	
	};
		
	System.out.println("El dia de la semana de numero " + diaNum + " es " + dia);
	
	}

}
