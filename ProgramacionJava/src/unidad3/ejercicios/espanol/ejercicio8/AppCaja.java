package unidad3.ejercicios.espanol.ejercicio8;

public class AppCaja {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Caja cuadrada = new Caja(3);
		Caja rectangular = new Caja(2,4,2);
		Caja desconocida = new Caja();
		Caja clasificada = new Caja("Carton", 2, 6, 4);
		
		
		System.out.println(cuadrada);
		System.out.println(rectangular);
		System.out.println(desconocida);
		System.out.println(clasificada);
		
	}

}
