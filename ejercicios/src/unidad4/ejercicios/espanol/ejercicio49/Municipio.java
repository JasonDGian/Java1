package unidad4.ejercicios.espanol.ejercicio49;

import java.util.Objects;

public class Municipio {
	
	//Atributos.
	private String nombre;
	private int poblacion;
	private double temperaturaMedia;
	private double altitud;
	
	// CONSTRUCTOR

	public Municipio(String nombre, int poblacion, double temperaturaMedia, double altitud) {
		this.nombre = nombre;
		this.poblacion = poblacion;
		this.temperaturaMedia = temperaturaMedia;
		this.altitud = altitud;
	}

	
	// GETTERS Y SETTERS

	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getPoblacion() {
		return poblacion;
	}


	public void setPoblacion(int poblacion) {
		this.poblacion = poblacion;
	}


	public double getTemperaturaMedia() {
		return temperaturaMedia;
	}


	public void setTemperaturaMedia(double temperaturaMedia) {
		this.temperaturaMedia = temperaturaMedia;
	}


	public double getAltitud() {
		return altitud;
	}


	public void setAltitud(double altitud) {
		this.altitud = altitud;
	}
	
	

	// TO STRING
	@Override
	public String toString() {
		return "Municipio [nombre=" + nombre + ", poblacion=" + poblacion + ", temperaturaMedia=" + temperaturaMedia
				+ ", altitud=" + altitud + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(altitud, nombre, poblacion, temperaturaMedia);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Municipio other = (Municipio) obj;
		return Double.doubleToLongBits(altitud) == Double.doubleToLongBits(other.altitud)
				&& Objects.equals(nombre, other.nombre) && poblacion == other.poblacion
				&& Double.doubleToLongBits(temperaturaMedia) == Double.doubleToLongBits(other.temperaturaMedia);
	}
	
	
	
	
	
	

}
