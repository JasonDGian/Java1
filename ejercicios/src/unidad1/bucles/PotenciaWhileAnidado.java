package unidad1.bucles;

public class PotenciaWhileAnidado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 1;
		while (i <= 3) {
			int j = 1;
			int potencia = 1;
			while (j <= 4) {

				potencia = i * potencia;
				j++;
			}
			System.out.println("El resultado de la potencia a la cuarta para el numero " + i + " es " + potencia);
		    i++;
		}

	}

}
