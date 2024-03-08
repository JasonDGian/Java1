package unidad4.ejercicios.espanol.ejercicio51;

public class Tecnico extends Empleado{
	

	private String area;
	private final double porcentajeAntiguedad= 0.05;
	
	public Tecnico(String nombre, String apellidos, String nif, int antiguedad, double salario, String area) {
		super(nombre, apellidos, nif, antiguedad, salario);
		this.area=area;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public double getPorcentajeAntiguedad() {
		return porcentajeAntiguedad;
	}

	@Override
	public EnumCategoria tipoEmpleado() {
		// TODO Auto-generated method stub
		return EnumCategoria.TECNICO;
	}

	
	//hacer esto
	@Override
	public double calculaSueldo(double impuestos) {
		
		double salarioBruto = this.getSalario() + (this.getPorcentajeAntiguedad() * this.getAntiguedad());
				
		return salarioBruto - calculaImpuestos(salarioBruto, impuestos);
	}

	
	
	
}
