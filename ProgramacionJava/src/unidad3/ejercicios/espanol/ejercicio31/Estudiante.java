package unidad3.ejercicios.espanol.ejercicio31;

public class Estudiante extends Persona{
	
	private int idEstudiante;

	public Estudiante() {
		super();
	}
	
	public Estudiante(String nombre, String apellidos, long nif, int anoNacimiento, int idEstudiante) {
		super(nombre,apellidos,nif,anoNacimiento);
		this.idEstudiante = idEstudiante;
	}

	public int getIdEstudiante() {
		return idEstudiante;
	}

	public void setIdEstudiante(int idEstudiante) {
		this.idEstudiante = idEstudiante;
	}

	@Override
	public String toString() {
		return "Estudiante ["+ super.toString() +"idEstudiante=" + idEstudiante + "]";
	}
	
	@Override
	public String identificate() {
		// TODO Auto-generated method stub
		return "Estudiante";
	}

}
