package unidad3.ejercicios.espanol.ejercicio45;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Conserje con = new Conserje("Juan", "D'Avila", 616656376 , "Calle Falsa 123", 2500, 12, "8:00 - 14:00", PLANTAS.PLANTA_BAJA);

		System.out.println(con.getClass());
		System.out.println(con.funcion());
		
		System.out.println(con);
		
		System.out.println(con.calculoDelImpuesto());
		System.out.println(con.getSueldoBruto());
		System.out.println(con.calculoDeSueldo());

	}

}