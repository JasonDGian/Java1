package unidad3.ejercicios.ingles.problem3;

public class Rectangle {

	// Private attributes
	private float length;
	private float width;
	
	
	// Constructors.
	public Rectangle() {
		
	}
	
	public Rectangle(float length, float width) {
		this.length = length;
		this.width = width;
	}

	
	// Getters and setters
	public float getLength() {
		return length;
	}

	public void setLength(float length) {
		this.length = length;
	}

	public float getWidth() {
		return width;
	}

	public void setWidth(float width) {
		this.width = width;
	}
	
	// Functional methods.
	
	public double getArea() {
		return (double)this.width*this.length;
	}
	
	public double getPerimeter() {
		return (this.width*2)+(this.length*2);
	}
	
	@Override
	public String toString() {
		return "Rectangle[ Width=" + this.width + "Length=" + this.length;
	}
	
}




