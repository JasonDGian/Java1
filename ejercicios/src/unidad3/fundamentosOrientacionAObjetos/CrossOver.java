package unidad3.fundamentosOrientacionAObjetos;

public class CrossOver extends Coche{
	private static final String TYPE_CD="Cross over";

	
	public CrossOver(String color, String marca,String modelo, double precio, double coste) {
		super( color,  marca, modelo,  precio,  coste);
	}

	
	public String getTipoCoche() {
		return TYPE_CD;
	}
	
	
	
	@Override
	public String toString() {
		return "CrossOver [getColor()=" + getColor() + ", getMarca()=" + getMarca() + ", getModelo()=" + getModelo()
				+ ", getPrecio()=" + getPrecio() + ", getCoste()=" + getCoste() + "]";
	}


	
}


