package unidad3.ejercicios.espanol.ejercicio32;

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
	
	
}
