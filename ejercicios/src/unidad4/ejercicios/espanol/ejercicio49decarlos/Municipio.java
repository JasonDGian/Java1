package unidad4.ejercicios.espanol.ejercicio49decarlos;

import java.util.Objects;

// abstractos implementan interfaces no da error
public abstract class Municipio implements Comparable<Municipio>{

	private String nombre;
	private int poblacion;
	private double temperatura;
	private double altitud;
	private Alcalde alcalde;

	public abstract boolean esPedania();
	
	public Municipio(String nombre, int poblacion, double temperatura, double altitud, Alcalde alcalde) {
		super();
		this.nombre = nombre;
		this.poblacion = poblacion;
		this.temperatura = temperatura;
		this.altitud = altitud;
		this.alcalde = alcalde;
	}
	

	public Alcalde getAlcalde() {
		return alcalde;
	}

	public void setAlcalde(Alcalde alcalde) {
		this.alcalde = alcalde;}


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

	public double getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(double temperatura) {
		this.temperatura = temperatura;
	}

	public double getAltitud() {
		return altitud;
	}

	public void setAltitud(double altitud) {
		this.altitud = altitud;
	}

	@Override
	public String toString() {
		return "Municipio [nombre=" + nombre + ", poblacion=" + poblacion + ", temperatura=" + temperatura
				+ ", altitud=" + altitud + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(alcalde, altitud, nombre, poblacion, temperatura);
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
		return Objects.equals(alcalde, other.alcalde)
				&& Double.doubleToLongBits(altitud) == Double.doubleToLongBits(other.altitud)
				&& Objects.equals(nombre, other.nombre) && poblacion == other.poblacion
				&& Double.doubleToLongBits(temperatura) == Double.doubleToLongBits(other.temperatura);
	}

	
	// la idea es hacer lo mas "implementable posible" el comparae to y lo mas comun posible.
	// de modo que las hijas aunque difieran un poco se puedan comparar.
	@Override
	public int compareTo(Municipio o) {

		int compare;

		if (this.getPoblacion() == o.getPoblacion()) {

			compare = this.getNombre().compareTo(o.getNombre());

		} else {

			compare = this.getPoblacion() - (o.getPoblacion());
		}

		return compare;
	}




}
