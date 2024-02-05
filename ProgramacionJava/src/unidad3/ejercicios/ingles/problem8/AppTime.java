package unidad3.ejercicios.ingles.problem8;


public class AppTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Time time = new Time(12,00,1);
		
		System.out.println(time);
		
		// Si un metodo devuelve un objeto, se puede volver a invocar ese mismo metodo.
		System.out.println(	
				// Patron cascada
				time.nextSecond().nextSecond().nextSecond()
				);
		
		System.out.println(	
				// Patron cascada
				time.previousSecond().previousSecond().previousSecond()
				);
		
		
		
	}

}
