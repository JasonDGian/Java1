package unidad3.ejercicios.espanol.ejercicio31;

public class Direccion {
	
	//  • Direccion: 
	//		* atributos: calle, ciudad, código postal, pais 
	//		* Constructores predeterminado y parametrizado.
	
	// Atributos
	private String calle;
	private String ciudad;
	private String codigoPostal;
	private String pais;
	
	
	public Direccion() {
		
	}
		
	public Direccion(String calle, String ciudad, String codigoPostal, String pais) {
		this.calle = calle;
		this.ciudad = ciudad;
		this.codigoPostal = codigoPostal;
		this.pais = pais;
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getCodigoPostal() {
		return codigoPostal;
	}

	public void setCodigoPostal(String codigoPostal) {
		this.codigoPostal = codigoPostal;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	@Override
	public String toString() {
		return "Direccion [calle=" + calle + ", ciudad=" + ciudad + ", codigoPostal=" + codigoPostal + ", pais=" + pais
				+ "]";
	}
	
	
	
}
