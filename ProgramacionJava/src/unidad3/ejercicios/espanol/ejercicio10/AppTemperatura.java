package unidad3.ejercicios.espanol.ejercicio10;

public class AppTemperatura {
	
	public static void main(String[] args) {
		
		Temperatura temps = new Temperatura(10, 10);

		System.out.println(temps);
		
		System.out.println(temps.getGradosFarenheit());
		
		// Hay  que llamar a la clase cuando invocamos al metodo estatico, no al objeto..
		System.out.println(	Temperatura.ConvertirACelsius(temps.getGradosFarenheit()) );
		
	}

}
