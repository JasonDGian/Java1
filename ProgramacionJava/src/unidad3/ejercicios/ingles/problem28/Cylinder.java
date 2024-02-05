package unidad3.ejercicios.ingles.problem28;

public class Cylinder extends Circle{
	
	private double height=1.0;
	
	
	public Cylinder() {
	}

	public Cylinder(double radius){
		// Se puede pasar el paramtetro a la super clase mediante su setter.
		// en lugar de hacerlo mediante su constructor.
		this.setRadius(radius);
		
	}
	
	public Cylinder(double radius, double height) {
		super(radius);
		this.height = height;
	}
	
	public Cylinder(double radius,String color, double height) {
		super(radius, color);
		this.height = height;
	}

	// SETTERS y getters 
	
	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	// metodo funcional
	
	public double getVolume() {
		// Calcular volumen cilindro -> π r² h -> volumen
		return Math.PI * (Math.pow(this.getRadius(), 2)) * this.getHeight();
	}
	
	@Override
	public double getArea() {
		// calcular area clindro ->  2π r h + 2π r²
		return (2*Math.PI)*this.getRadius()*this.getHeight() + (2*Math.PI)*Math.pow(this.getRadius(), 2);
	}
	

	@Override
	public String toString() {
		return "Cylinder [height=" + height + "]";
	}
	
	
	
	

}
