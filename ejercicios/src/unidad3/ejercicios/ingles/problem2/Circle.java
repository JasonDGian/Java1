package unidad3.ejercicios.ingles.problem2;

public class Circle {
	
	// Private attributes
	private double radius;

	// Constructors.
	public Circle() {
		this.radius=1.0;
	}
	
	public Circle(double radius) {
		this.radius = radius;
	}

	
	// Setters and getters
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double getArea() {
		return Math.pow(radius, 2)*Math.PI;
	}

	public double getCircumference() {
		return 2*(Math.PI*radius);
	}
	
	public String toString() {
		return "Circle[radius=" + this.radius + "]";
	}
	
}

