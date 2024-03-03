package unidad3.ejercicios.ingles.problem30;

public class Point2D {
	
	private float x = 0.0f;
	private float y = 0.0f;
	
	// CONSTRUCTORS
	
	public Point2D(float x, float y) {
		this.x=x;
		this.y=y;
	}
	
	public Point2D() {
		
	}

	// GETTTERS AND SETTERS
	
	public float getX() {
		return x;
	}

	public float getY() {
		return y;
	}

	public void setX(float x) {
		this.x = x;
	}

	public void setY(float y) {
		this.y = y;
	}
	
	// Custom setter
	public void setXY(float x, float y) {
		this.x=x;
		this.y=y;
	}

	public float[] getXY() {
		
		float[] pointer = new float[2];
		pointer[0] = this.getX();
		pointer[1] = this.getY();
		
		return pointer;
	}
	
	@Override
	public String toString() {
		return "(" + x + ", " + y + ")";
	}
}
