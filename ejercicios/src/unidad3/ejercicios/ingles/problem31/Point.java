package unidad3.ejercicios.ingles.problem31;

public class Point {

	private float x=0.0f;
	private float y=0.0f;
	
	public Point() {}
	
	public Point(float X, float Y) {
		this.x=X;
		this.y=Y;
	}

	
	//G S
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
	
	// Custom setters
	
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
