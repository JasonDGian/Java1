package unidad3.ejercicios.espanol.ejercicio5;

public class AvionesAPP {
	
	public static void main(String[] args) {
		
		Avion a1 = new Avion("Airbus", 4);
		Avion a2 = new Avion("Loockhead", 4);
		
		System.out.println(a1);
		
		System.out.println(a2);
		
		a1.setFabricante("Ford");
		a2.setFabricante("FIAT");
		
		System.out.println(a1);
		
		System.out.println(a2);
		
		a2.cambiarFabricante(a2);
		
		System.out.println(a2);
	}

}
