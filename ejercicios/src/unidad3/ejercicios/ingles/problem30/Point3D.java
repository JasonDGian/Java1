package unidad3.ejercicios.ingles.problem30;

import java.util.Arrays;

public class Point3D extends Point2D{

	
	// Attributes.
	private float z=0.0f;
	
	// Construcors.
	public Point3D(float x, float y, float z) {
		super(x, y);
		this.z=z;
	}
	
	public Point3D() {}

	
	// Getters & Setters
	public float getZ() {
		return z;
	}

	public void setZ(float z) {
		this.z = z;
	}
	
	// Custom getters and setters.
	
	public void setXYZ(float x, float y, float z) {
		
		super.setXY(x, y);
		this.setZ(z);
		
	}
	
	public float[] getXYZ() {
		
		float[] pointer = new float[3];
		pointer[0] = this.getX();
		pointer[1] = this.getY();
		pointer[2] = this.getZ();
		return pointer;
		
	}

	@Override
	public String toString() {
		return "("+this.getX()+", "+this.getY()+", "+this.getZ()+")";
	}
	
	
	
	
}
