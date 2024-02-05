package unidad3.ejercicios.ingles.problem32;

public class AppShapes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Circle cir = new Circle();
		Rectangle rec = new Rectangle();
		Square squ = new Square();
		
		
		// Test circle.
		cir.setColor("Blue");
		cir.setRadius(2.4);
		cir.setFilled(true);
		System.out.println("Circle test");
		System.out.println(cir.getColor());
		System.out.println(cir.getRadius());
		System.out.println(cir.getArea());
		System.out.println(cir.getPerimeter());
		System.out.println(cir);

		// Test rectangle
		rec.setColor("Violet");
		rec.setLength(2);
		rec.setWidth(4);
		cir.setFilled(true);

		System.out.println("Rectangle test");
		System.out.println(rec.getColor());
		System.out.println(rec.getWidth());
		System.out.println(rec.getLength());
		System.out.println(rec.getArea());
		System.out.println(rec.getPerimeter());
		System.out.println(rec);
		
		// Test square
		squ.setColor("Violet");
		squ.setSide(3);
		squ.setLength(4);
		squ.setWidth(5);
		squ.setFilled(true);
		System.out.println("Square test");
		System.out.println(squ.getColor());
		System.out.println(squ.getWidth());
		System.out.println(squ.getLength());
		System.out.println(squ.getSide());
		System.out.println(squ.getArea());
		System.out.println(squ.getPerimeter());
		System.out.println(squ);
		
	
		

	}

}
