package unidad3.ejercicios.espanol.ejercicio31;

public class Profesor extends Persona{
	
	private String despacho;

	public Profesor(){}
	
	public Profesor(String nombre, String apellidos, long nif, int anoNacimiento, String despacho) {
		super(nombre, apellidos, nif, anoNacimiento);
		this.despacho = despacho;
	}

	public String getDespacho() {
		return despacho;
	}

	public void setDespacho(String despacho) {
		this.despacho = despacho;
	}

	
	@Override
	public String toString() {
		return "Profesor [" + super.toString() + "despacho=" + despacho + "]";
	}
	
	@Override
	public String identificate() {
		// TODO Auto-generated method stub
		return "Profesor";
	}
	

}
