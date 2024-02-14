package unidad3.ejercicios.espanol.ejercicio45;

public abstract class EmpleadoEducacion {
	
	// Atributos
	
	private String nombre;
	private String apellidos;
	private long telefono;
	private String direccion;
	private double sueldoBruto;
	private int procentajeIRPF;
	private String horario;
	private String funciones;
	private String tipoEmpleado;
	
	
	// Metodos
		
	// Devuelve el saldo neto
	// sueldobruto-impuestos
	public abstract double calculoDeSueldo();
	
	// Calcula los impuestos aplicados sobre el sueldo bruto
	// sueldobruto*procentajeIRPF
	public abstract double calculoDeImpuesto();
	
	// Devuelve la funcion del empleado.
	public abstract String funcion();
	
	
	

}
