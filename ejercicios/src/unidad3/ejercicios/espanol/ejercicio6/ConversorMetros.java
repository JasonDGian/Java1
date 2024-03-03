package unidad3.ejercicios.espanol.ejercicio6;

public class ConversorMetros {

	private float metros=0;
	
	public ConversorMetros(float metros) {
		this.metros=metros;
	}
	
	public float MetrosACentimentros() {
		// M- cm = M*100
		return metros*100;
	}
	
	public float MetrosAMilimetros() {
		// M - mm = M/1000
		return metros*1000;
	}
	
	public float MetrosAPulgadas() {
		// M - Inch = M*39.3700787
		return metros*39.3700f;
	}
	
	public float MetrosAPies() {
		// 	M - feet = M*3.28083 
		return metros*3.28083f;
	}
	
	public float MetrosAyardas() {
		// 	M - feet = M*1,0936133
		return metros*1.0936133f;
	}

	public float getMetros() {
		return metros;
	}

	public void setMetros(float metros) {
		this.metros = metros;
	}

	@Override
	public String toString() {
		return "ConversorMetros [metros=" + metros + "]";
	}
	
	

	
	
	
	
}
