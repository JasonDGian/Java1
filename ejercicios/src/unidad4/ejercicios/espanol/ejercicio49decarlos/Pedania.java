package unidad4.ejercicios.espanol.ejercicio49decarlos;

public class Pedania extends Municipio implements IAlcalde {

	private Villa villa;
	
	public Pedania(String nombre, int poblacion, double temperatura, double altitud, Villa villa) {
		super(nombre, poblacion, temperatura, altitud, villa.getAlcalde());
		this.villa = villa;
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean esPedania() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public String toString() {
		return "Pedania [villa=" + villa.getNombre() + ", Alcalde=" + getAlcalde() + ", Nombre=" + getNombre()
				+ ", Poblacion=" + getPoblacion() + ", Temperatura=" + getTemperatura() + ", Altitud="
				+ getAltitud() + "]";
	}

	@Override
	public String infoAlcalde() {
		
		return villa.getAlcalde().infoAlcalde();
		
	}
	
	
	
	

}
