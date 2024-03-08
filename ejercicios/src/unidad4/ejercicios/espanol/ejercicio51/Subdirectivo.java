package unidad4.ejercicios.espanol.ejercicio51;

public class Subdirectivo extends Empleado {
	

	private double porcentajeBonusAntiguedad;
	private double primaAnual;
	
	public Subdirectivo(String nombre, String apellidos, String nif, int antiguedad, double salario, double porcentajeBonus, double primaAnual) {
		super(nombre, apellidos, nif, antiguedad, salario);
		// TODO Auto-generated constructor stub
		this.porcentajeBonusAntiguedad=porcentajeBonus;
		this.primaAnual=primaAnual;
	}

	public double getPorcentajeBonusAntiguedad() {
		return porcentajeBonusAntiguedad;
	}

	public void setPorcentajeBonusAntiguedad(double porcentajeBonusAntiguedad) {
		this.porcentajeBonusAntiguedad = porcentajeBonusAntiguedad;
	}

	public double getPrimaAnual() {
		return primaAnual;
	}

	public void setPrimaAnual(double primaAnual) {
		this.primaAnual = primaAnual;
	}

	@Override
	public EnumCategoria tipoEmpleado() {
		// TODO Auto-generated method stub
		return null;
	}

	
	@Override
	public double calculaSueldo(double impuestos) {
		
		double sueldoBruto= this.getSalario() + ( this.getPorcentajeBonusAntiguedad() * this.getAntiguedad() ) + this.getPrimaAnual();
		
		return sueldoBruto - this.calculaImpuestos(sueldoBruto, impuestos);
	}


}
