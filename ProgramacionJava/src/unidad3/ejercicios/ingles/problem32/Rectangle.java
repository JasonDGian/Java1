package unidad3.ejercicios.ingles.problem32;

public class Rectangle extends Shape{

	private double width=1.0;
	private double length=1.0;
	
	public Rectangle(){}
	
	public  Rectangle(double width, double length){
		this.width=width;
		this.length=length;
	}

	public  Rectangle(double width, double length, String color, boolean filledStatus){
		super(color, filledStatus);
		this.width=width;
		this.length=length;
		//this(width, length);  //-> Por que no funciona? 
	}
	
	// Getters & setters.

	public double getWidth() {
		return width;
	}

	public double getLength() {
		return length;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public void setLength(double length) {
		this.length = length;
	}
	
	// Functionals
	public double getArea() {
		// Esto es preferible??
		// return this.length*this.width;  
		return this.getLength()*this.getWidth();
	}
	
	public double getPerimeter() {
		return (this.getLength()*2)+(this.getWidth()*2);
	}

	@Override
	public String toString() {
		return "Rectangle [" + super.toString() + "width=" + width + ", length=" + length + "]";
	}
	
	
	

}
