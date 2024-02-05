package unidad3.ejercicios.ingles.problem32;

public abstract class Shape {

	private String color = "Red";
	private boolean filled = true;
	
	public Shape() { 
		this.filled=true;
		this.color="Green";
		}
	
	public Shape( String color, boolean filled) {
		
		this.color=color;
		this.filled=filled;
		
	}
	
	// Getters and setters
	
	public String  getColor() {
		return this.color;
	}
	
	public void setColor(String color) {
		this.color=color;
	}
	
	public boolean isFilled() {
		return this.filled;
	}
	
	public void setFilled(boolean status) {
		this.filled=status;
	}
	
	
	abstract double getArea();
	abstract double getPerimeter();
	
	
	// to string

	@Override
	public String toString() {
		return "Shape [color=" + color + ", filled=" + filled + "]";
	}
	
	
}
