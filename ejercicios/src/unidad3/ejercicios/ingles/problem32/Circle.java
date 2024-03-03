package unidad3.ejercicios.ingles.problem32;

public class Circle extends Shape{

	private double radius = 1.0;
	
	public Circle(){}
	
	public Circle (double radius) {
		this.radius=radius;
	}
	
	public Circle (double radius, String color, boolean filledStatus) {
		super(color, filledStatus);
		this.radius=radius;
	}
	
	public double getRadius() {
		return this.radius;
	}
	
	public void setRadius(double radius) {
		this.radius=radius;
	}
	
	public double getArea() {
		//π x radius2 -> Area of circle.
		return Math.PI*Math.pow(radius, 2);
	}
	
	public double getPerimeter() {
		// P= 2 x π x radius -> Perimeter of circle.
		return 2*Math.PI*radius;
	}

	@Override
	public String toString() {
		return "Circle [" + super.toString() + "radius=" + radius + "]";
	}
}
