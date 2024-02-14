package unidad3.ejercicios.espanol.ejercicio10;

public class Temperatura {

	private float gradosFarenheit=0;
	private float gradosCelsius=0;
	
	Temperatura(){
		
	}
	
	Temperatura(float gradosFarenheit, float gradosCelsius){
		this.gradosFarenheit=gradosFarenheit;
		this.gradosCelsius=gradosCelsius;
	}
	
	
	public static float ConvertirACelsius(float gradosFarenheit) {
		return gradosFarenheit-32f/1.8f;
	} 
	
	public static float ConvertirAFarenheit(float gradosCelsius) {
		return gradosCelsius*1.8f+32f;	
	} 
	
	public float getGradosFarenheit() {
		return this.gradosFarenheit;
	}
	
	public float getGradosCelsius() {
		return this.gradosCelsius;
	}
	
	public void setGradosCelsius(float grados) {
		this.gradosCelsius=grados;
	}
	
	public void setGradosFarenheit(float grados) {
		this.gradosFarenheit=grados;
	}

	@Override
	public String toString() {
		return "Temperatura [gradosFarenheit=" + gradosFarenheit + ", gradosCelsius=" + gradosCelsius + "]";
	}
	
	
	
}



