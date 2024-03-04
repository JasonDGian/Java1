package ejercicios.ejercicio45extendido;

import java.util.Objects;

public class Autor implements InfoAutor, Comparable<Autor> {

	private String nombre;
	private String apellidos;
	private String dni;
	
	public Autor(String nombre, String apellidos, String dni) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
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

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}


	@Override
	public String obtenInfoAutor() {
		return this.getNombre() + " " + this.getApellidos();
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(apellidos, dni, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Autor other = (Autor) obj;
		return Objects.equals(apellidos, other.apellidos) && Objects.equals(dni, other.dni)
				&& Objects.equals(nombre, other.nombre);
	}

	@Override
	public int compareTo(Autor o) {
		return this.getDni().compareTo(o.getDni());
	}
	
	
	
}
