package unidad3.fundamentosOrientacionAObjetos;

public class SUV extends Coche {
	
	private static final String TYPE_CD="SUV";

	
	public SUV(String color, String marca, String modelo, double precio, double coste) {
		super(color, marca, modelo, precio, coste);

	}
	
	
	public String getTipoCoche() {
		return TYPE_CD;
	}

	@Override
	public String toString() {
		return "SUV [getColor()=" + getColor() + ", getMarca()=" + getMarca() + ", getModelo()=" + getModelo()
				+ ", getPrecio()=" + getPrecio() + ", getCoste()=" + getCoste() + "]";
	}



}