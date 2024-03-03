package unidad3.ejercicios.ingles.problem31;

public class MovablePoint extends Point{
	
	private float xSpeed = 0.0f;
	private float ySpeed = 0.0f;
	
	
	public MovablePoint() {
		
	}
	
	public MovablePoint(float xSpeed, float ySpeed) {
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}
	
	public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
		super(x, y);
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}
	
	
	// G S 

	public float getxSpeed() {
		return xSpeed;
	}

	public float getySpeed() {
		return ySpeed;
	}

	public void setxSpeed(float xSpeed) {
		this.xSpeed = xSpeed;
	}

	public void setySpeed(float ySpeed) {
		this.ySpeed = ySpeed;
	}
	
	// Custom getters setters
	
	public void setSpeed(float xSpeed, float ySpeed) {
		setxSpeed(xSpeed);
		setySpeed(ySpeed);
	}

	public float[] getSpeed() {
		
		float[] speed = new float[2];
		speed[0] = this.getxSpeed();
		speed[1] = this.getySpeed();
		
		return speed;
	}
	
	// Functionals
	
	public MovablePoint move() {
		
		this.setX(this.getX()+this.getxSpeed());
		this.setY(this.getY()+this.getySpeed());
		
		return this;
	}
	
	public MovablePoint moveNewPoint() {
		
		MovablePoint newPoint = new MovablePoint( (this.getX()+this.getxSpeed()), (this.getY()+this.getySpeed()) );
		
		return newPoint;
	}
}
