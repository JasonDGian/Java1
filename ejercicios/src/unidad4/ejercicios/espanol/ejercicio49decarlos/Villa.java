package unidad4.ejercicios.espanol.ejercicio49decarlos;

import java.util.Objects;

public class Villa extends Municipio implements Comparable<Municipio>, IAlcalde {
// Las clases hijas no pueden implementar un comparable distinta a la de su padre.
	// se debe de seguir el mismo comparable que la clase padre, de querer uno
	// distinto se debe de quitar en el padre.

	public Villa(String nombre, int poblacion, double temperatura, double altitud, Alcalde alcalde) {
		super(nombre, poblacion, temperatura, altitud, alcalde);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Villa other = (Villa) obj;
		return Objects.equals(this.getAlcalde(), other.getAlcalde());
	}

	@Override
	public boolean esPedania() {
		// TODO Auto-generated method stub
		return false;
	}

	// To String con metodos heredados.
	@Override
	public String toString() {
		return "Villa [alcalde=" + this.getAlcalde() + ", Nombre: " + getNombre() + ", Población: " + getPoblacion()
				+ ", Temperatura: " + getTemperatura() + ", Altitud: " + getAltitud() + "]";
	}

	// Reinvocamos el metodo infoalcalde escrito para alcalde.
	@Override
	public String infoAlcalde() {
		return this.getAlcalde().infoAlcalde();
	}

	@Override
	public int compareTo(Municipio o) {

		int compare;

		if (this.getPoblacion() == o.getPoblacion()) {

			compare = this.getNombre().compareTo(o.getNombre());

		} else {

			compare = this.getAlcalde().compareTo(o.getAlcalde());
		}

		return compare;
	}

}
