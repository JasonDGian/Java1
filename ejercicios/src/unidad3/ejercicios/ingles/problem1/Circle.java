package unidad3.ejercicios.ingles.problem1;

/* The Circle class models a circle with a radius and color.*/

public class Circle {

	
	// Private attributes.
	private double radius;
	private String color;
	
	
	// Constructors.
	public Circle() {
		this.radius = 1.0;
		this.color = "red";
	}
	
	public Circle(double radius) {
		this.radius = radius;
		this.color = "red";
	}
	
	public Circle(double radius, String color) {
		this.radius = radius;
		this.color = color;
	}
	
	// Setters
	
	public void setRadius(double radius) {
		this.radius=radius;
	}
	
	public void setColor(String color) {
		this.color=color;
	}
	
	// Getters

	public double getRadius(){
		return this.radius;
	}
	
	public double getArea() {
		return (radius*radius)*Math.PI;
	}
	
	public String getColor() {
		return this.color;
	}
	
	
	/** Return a self-descriptive string of this instance in the form of Circle[radius=?,color=?] */
	public String toString() {
	return "Circle[radius=" + radius + " color=" + color + "]";
	}
	
}
