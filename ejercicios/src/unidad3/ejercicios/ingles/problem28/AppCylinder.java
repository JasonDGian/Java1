package unidad3.ejercicios.ingles.problem28;

public class AppCylinder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Circle cir = new Circle(4, "blue");
		
		Cylinder cyl = new Cylinder(4,"Red",8);
		
		Cylinder cyl2 = new Cylinder();
		
		System.out.println(cir.getArea());
		System.out.println(cyl.getArea());

		
		System.out.println(cyl2.getArea());
		
		System.out.println(cyl);
		System.out.println(cyl2);
		
	}

}
