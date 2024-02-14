package unidad3.ejercicios.ingles.comparableExercises.problem44;

import java.util.Comparator;

public class EmployeeComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		/*
		if ((o1.getLastName()+o1.getName()).compareTo(( o2.getLastName()+o2.getName())) > 0) { return 1; }
		else if( (o1.getLastName()+o1.getName()).compareTo(( o2.getLastName()+o2.getName()))<0) { return -1;}
		else { return 0;}
		}*/
	
		// En esta codificación está invertido el resultado de los return, la idea es que asi se tiene en cuenta el comportamiento de la comparación to string.
		if ((o1.getLastName()+o1.getName()).compareTo(( o2.getLastName()+o2.getName())) > 0) { return -1; }
		else if( (o1.getLastName()+o1.getName()).compareTo(( o2.getLastName()+o2.getName()))<0) { return 1;}
		else { return 0;}
		}
	

	
	

}
