package unidad3.ejercicios.espanol.ejercicio6;

public class AppMetros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ConversorMetros medida = new ConversorMetros(1);

		System.out.println(medida.MetrosACentimentros() + " cm");
		System.out.println(medida.MetrosAMilimetros() + " mm");
		System.out.println(medida.MetrosAPulgadas() + " Inch");
		System.out.println(medida.MetrosAPies() + " Feet");
		System.out.println(medida.MetrosAyardas() + " Yards");
	}

}
