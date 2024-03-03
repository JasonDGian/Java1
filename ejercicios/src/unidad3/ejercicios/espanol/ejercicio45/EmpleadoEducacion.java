package unidad3.ejercicios.espanol.ejercicio45;

public abstract class EmpleadoEducacion {

	// Atributos

	private String nombre;
	private String apellidos;
	private long telefono;
	private String direccion; // Esto podría ser un objeto de dirección.
	private double sueldoBruto;
	private int porcentajeIRPF;
	private String horarioPermanencia;
	private String funciones; // Esto podría ser un objeto?

	// Constructores

	public EmpleadoEducacion() {
		// Constructor sin definicion.
	}

	public EmpleadoEducacion(String nombre, String apellidos, long telefono, String direccion, double sueldoBruto,
			int porcentajeIRPF, String horarioPermanencia) {
		// Constructor sin parametrizado
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.telefono = telefono;
		this.direccion = direccion;
		this.sueldoBruto = sueldoBruto;
		this.porcentajeIRPF = porcentajeIRPF;
		this.horarioPermanencia = horarioPermanencia;
	}
	// Metodos

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public long getTelefono() {
		return telefono;
	}

	public void setTelefono(long telefono) {
		this.telefono = telefono;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public double getSueldoBruto() {
		return sueldoBruto;
	}

	public void setSueldoBruto(double sueldoBruto) {
		this.sueldoBruto = sueldoBruto;
	}

	public int getProcentajeIRPF() {
		return porcentajeIRPF;
	}

	public void setProcentajeIRPF(int procentajeIRPF) {
		this.porcentajeIRPF = procentajeIRPF;
	}

	public String getHorarioPermanencia() {
		return horarioPermanencia;
	}

	public void setHorarioPermanencia(String horarioPermanencia) {
		this.horarioPermanencia = horarioPermanencia;
	}

	public String getFunciones() {
		return funciones;
	}

	public void setFunciones(String funciones) {
		this.funciones = funciones;
	}

	// Metodos abstractos
	public abstract double calculoDeSueldo();

	public abstract double calculoDelImpuesto();

	public abstract String funcion();

	// Metodos sobrecargados.
	@Override
	public String toString() {
		return "EmpleadoEducacion [nombre=" + nombre + ", apellidos=" + apellidos + ", telefono=" + telefono
				+ ", direccion=" + direccion + ", sueldoBruto=" + sueldoBruto + ", porcentajeIRPF=" + porcentajeIRPF
				+ ", horarioPermanencia=" + horarioPermanencia + ", funciones=" + funciones + "]";
	}


	

}
