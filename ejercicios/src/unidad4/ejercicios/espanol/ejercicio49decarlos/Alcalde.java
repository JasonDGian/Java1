package unidad4.ejercicios.espanol.ejercicio49decarlos;

import java.util.Objects;

public class Alcalde implements Comparable<Alcalde>, IAlcalde {

	private String nombre;
	private String apellidos;
	private EnumPartido partido;
	
	
	public Alcalde(String nombre, String apellidos, EnumPartido partido) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.partido = partido;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}


	public EnumPartido getPartido() {
		return partido;
	}


	public void setPartido(EnumPartido partido) {
		this.partido = partido;
	}
		
	@Override
	public String toString() {
		return "Alcalde [nombre=" + nombre + ", apellidos=" + apellidos + ", partido=" + partido + "]";
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(apellidos, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Alcalde other = (Alcalde) obj;
		return Objects.equals(apellidos, other.apellidos) && Objects.equals(nombre, other.nombre);
	}

	@Override
	public int compareTo(Alcalde o) {
		return (this.nombre + this.apellidos).compareTo(o.nombre+o.getApellidos());
	}
	
	// Es conveniente no modificar el metodo toString porque lo usa java para cosas internas suyas.
	@Override
	public String infoAlcalde() {
		return "Nombre: " + this.getNombre() + "Apellidos: " + this.getApellidos() + "Partido: " + this.getPartido();
	}
	
}
