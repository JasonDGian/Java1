package unidad3.ejercicios.ingles.problem32;

public class Square extends Rectangle {

	public Square() {}
	
	public Square(double side) {
		super(side,side);
	}
	
	public Square(double side, String color, boolean filledStatus) {
		super(side,side, color, filledStatus);
	}
	
	public double getSide() {
		return this.getLength();
	}
	
	public void setSide(float side) {
		this.setLength(side);
		this.setWidth(side);
	}
	
	@Override
	public void setLength(double length) {
		super.setLength(length);
		super.setWidth(length);
	}
	
	@Override
	public void setWidth(double length) {
		super.setLength(length);
		super.setWidth(length);
	}
	
	@Override
	public String toString(){
		return "Square[" + super.toString() + "]";
	}
	
}
