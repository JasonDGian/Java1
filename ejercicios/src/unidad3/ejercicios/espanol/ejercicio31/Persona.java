package unidad3.ejercicios.espanol.ejercicio31;
import unidad3.ejercicios.espanol.ejercicio31.Direccion.*;

public class Persona implements Humano{
	
	// Atributos estaticos.
	private static int numPersonas=0;
	
	
	private String nombre;
	private String apellidos;
	private long nif;
	private int anoNacimiento;	
	private Direccion direccion;
	
	
	static {
		numPersonas=0;
	}	
	
	public Persona() {
		numPersonas++;
	}
	
	public Persona(String nombre, String apellidos, long nif, int anoNacimiento) {
		this.nombre=nombre;
		this.apellidos=apellidos;
		this.nif=nif;
		this.anoNacimiento=anoNacimiento;
		numPersonas++;
	}
	
	// metodos estaticos
	public static int getNumPersonas() {
		return numPersonas;
	}
	
	// metodos de acceso
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	
	public void setApellidos(String apellidos) {
		this.apellidos=apellidos;
	}
	
	public void setNif(long id) {
		this.nif=id;
	}
	
	public void setAnoNacimiento(int anoNacimiento) {
		this.anoNacimiento=anoNacimiento;
	}
	
	// Realmente no es necesario especificar el "this" pero se hace por legibilidad. 	
	public String getNombre () {
		return nombre;
	}
	
	public String getApellidos () {
		return apellidos;
	}
	
	public long getNif () {
		return nif;
	}
	
	public int getanoNacimiento () {
		return anoNacimiento;
	}
	
	public int calculaEdad(int anoActual) {
		return anoActual-anoNacimiento;
	}
	
	public Direccion getDireccion() {
		return this.direccion;
	}
	
	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}
	
	public void setDireccion(String calle, String ciudad, String codigoPostal, String pais) {
		this.direccion = new Direccion(calle, ciudad, codigoPostal, pais);
	}
	
	@Override
	public String toString() {
		return "Persona [nombre=" + this.nombre + ", apellido=" + this.apellidos + ", ID=" + this.nif + ", año de nacimiento " + this.anoNacimiento + "]";
	}

	@Override
	public String identificate() {
		// TODO Auto-generated method stub
		return "Persona";
	}
	
}

