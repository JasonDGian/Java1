package unidad3.ejercicios.espanol.ejercicio45;

public class Conserje extends EmpleadoEducacion {

	
	// constantes de tipo empleaedo
	private PLANTAS planta;

	// Constructores
	public Conserje() {
		super();
	}

	// Constructor parametrizado que llama a la super clase.
	public Conserje(String nombre, String apellidos, long telefono, String direccion, double sueldoBruto,
			int porcentajeIRPF, String horarioPermanencia, PLANTAS planta) {

		super(nombre, apellidos, telefono, direccion, sueldoBruto, porcentajeIRPF, horarioPermanencia);
		this.planta=planta;
		
	}
	
	// Metodos herdedados de superclase.
	
	@Override
	public double calculoDeSueldo() {
		// calculoDeSueldo -> sueldobruto -impuestos
		return (this.getSueldoBruto()-this.calculoDelImpuesto());
	}

	@Override
	public double calculoDelImpuesto() {
		// calculoDeImpuesto -> sueldobruto* porcentaje IRPF
		return (this.getSueldoBruto()*this.getProcentajeIRPF())/100;
	}

	@Override
	public String funcion() {
		// TODO Auto-generated method stub
		return "Realizar labores de atención al publico y mantenimiento.";
	}

	@Override
	public String toString() {
		return "Conserje [" + super.toString() + "POSICION=" + planta + "]";
	}

	

}
