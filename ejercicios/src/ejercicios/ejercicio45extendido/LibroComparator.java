package ejercicios.ejercicio45extendido;

import java.util.Comparator;

public class LibroComparator implements Comparator<Libro>{

	public int compare(Libro l1, Libro l2) {

		return l1.getReferenciaBibliografica().compareTo(l2.getReferenciaBibliografica());
		
	}
	
}
