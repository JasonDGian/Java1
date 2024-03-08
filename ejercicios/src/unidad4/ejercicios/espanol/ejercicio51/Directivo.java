package unidad4.ejercicios.espanol.ejercicio51;

public class Directivo extends Empleado{


	private double bonusPorcentaje;
	private double beneficiosDep;
	
	public Directivo(String nombre, String apellidos, String nif, int antiguedad, double salario, double beneficiosDep, double bonusPorcentaje) {
		super(nombre, apellidos, nif, antiguedad, salario);
		this.beneficiosDep=beneficiosDep;
		this.bonusPorcentaje=bonusPorcentaje;
	}
	
	public double getBonusPorcentaje() {
		return bonusPorcentaje;
	}

	public void setBonusPorcentaje(double bonusPorcentaje) {
		this.bonusPorcentaje = bonusPorcentaje;
	}

	public double getBeneficiosDep() {
		return beneficiosDep;
	}

	public void setBeneficiosDep(double beneficiosDep) {
		this.beneficiosDep = beneficiosDep;
	}

	@Override
	public EnumCategoria tipoEmpleado() {
		return EnumCategoria.DIRECTIVO;
	}
		
	@Override
	public double calculaSueldo(double impuestos) {
		
		double sueldoBruto= this.getSalario() + (this.bonusPorcentaje * this.beneficiosDep);
		
		return sueldoBruto - this.calculaImpuestos(sueldoBruto, impuestos);
	}
	
	
	
	
}
