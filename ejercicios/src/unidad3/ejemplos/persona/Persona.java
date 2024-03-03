package unidad3.ejemplos.persona;

public class Persona{
	
	private String nombre;
	private String apellidos;
	private long id;
	private int anoNacimiento;	
	private static int numPersonas=0;
	
	static {
		numPersonas=0;
	}	
	
	public Persona() {
		numPersonas++;
	}
	
	public Persona(String nombre, String apellidos, long id, int anoNacimiento) {
		this.nombre=nombre;
		this.apellidos=apellidos;
		this.id=id;
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
	
	public void setId(long id) {
		this.id=id;
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
	
	public long getId () {
		return id;
	}
	
	public int getanoNacimiento () {
		return anoNacimiento;
	}
	
	public int calculaEdad(int anoActual) {
		return anoActual-anoNacimiento;
	}
	
	@Override
	public String toString() {
		return "Persona [nombre=" + this.nombre + ", apellido=" + this.apellidos + ", ID=" + this.id + ", año de nacimiento " + this.anoNacimiento + "]";
	}
	
}

