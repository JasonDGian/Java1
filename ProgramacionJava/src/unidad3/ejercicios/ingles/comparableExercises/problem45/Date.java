package unidad3.ejercicios.ingles.comparableExercises.problem45;

public class Date implements Comparable {
	
	// Private attributes
	private int day;
	private int month;
	private int year;
	
	// Constructor
	public Date(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

	
	// Getters and setters.
	public int getDay() {
		return day;
	}

	public int getMonth() {
		return month;
	}

	public int getYear() {
		return year;
	}

	// Setters
	public void setDay(int day) {
		this.day = day;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	// Functionals.
	
	public void setDate(int day, int month, int year) {
		this.day=day;
		this.month=month;
		this.year=year;
	}

	// Polimorphic
	
	@Override
	public String toString() {
		return String.format("%02d" + "/" + "%02d" + "/" + "%04d", day,month,year);
	}


	@Override
	public int compareTo(Object o) {
		/* 	Compara el objeto fecha con otro objeto fecha. En caso de que el objeto 
		*	desde el cual se lanza el metodo sea mayor (mas tarde en el tiempo), 
		*	devuelve 1, en caso de igualdad 0 y en caso de que el objeto con le que 
		*	se compara sea el mayor se devuelve -1.
		*	El objeto de "mayor valor" es la fecha que mas tarde haya tomado lugar.
		*/
		
		// Primero controlamos si es una instancia de objeto DATE
		//if (o instanceof Date) {	
		
		// luego si el objeto es tipo Date comparamos los años
			if (this.getYear() > ((Date) o).getYear() ) { return 1; }
			
			else if (this.getYear() < ((Date) o).getYear() ) { return -1; }
			
			// si los años son iguales, pasamos a controlar los meses.
			else {
				
				if (this.getMonth() > ((Date)o).getMonth()) {return 1;}
				else if(this.getMonth() < ((Date)o).getMonth()) {return -1;}
				
				// si los meses también coinciden pasamos a comparar los dias.
				else { 
					if (this.getDay()>((Date)o).getDay()) {return 1;}
					else if(this.getDay()<((Date)o).getDay()) {return -1;}
					// En caso de que todo sea igual hasta este punto estamos hablando de la misma fecha.
					else {return 0;}
				}
			}
		
		//}  Cierra el IF INSTANCE OF DATE
		
		//else return 2;
		
	} // Cierra el metodo "CompareTo"

} // Cierra la clase DATE.
