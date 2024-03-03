package unidad3.ejercicios.ingles.problem31;

public class PointMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MovablePoint punto = new MovablePoint();
		
		System.out.println(punto);
		
		punto.setySpeed(2);
		punto.move().move().move().move();
		
		System.out.println(punto);

		
	}

}
