package unidad4.ejercicios.espanol.ejercicio51;

import java.util.Objects;

public abstract class Empleado implements Comparable<Empleado> {
	
	private String nombre;
	private String apellidos;
	private String nif;
	private int antiguedad;
	private double salario;
	
	
	
	/*
	 * AÑADE LOS EMPLEADOS DEL ARRAY AL NUESTRO MIENTRAS QUEPAN
	 * DE NO CABER LOS ULTIMOS X NO LOS METE, PERO SI METE LOS QUE VIENEN ANTES.
	 * 
	 */
	public void addEmpleados () {
		
	}
	
	public abstract EnumCategoria tipoEmpleado();
	
	public abstract double calculaSueldo(double impuestos);
	
	public Empleado(String nombre, String apellidos, String nif, int antiguedad, double salario) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.nif = nif;
		this.antiguedad = antiguedad;
		this.salario = salario;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellidos() {
		return apellidos;
	}


	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}


	public String getNif() {
		return nif;
	}


	public void setNif(String nif) {
		this.nif = nif;
	}


	public int getAntiguedad() {
		return antiguedad;
	}


	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}


	public double getSalario() {
		return salario;
	}


	public void setSalario(int salario) {
		this.salario = salario;
	}


	@Override
	public int compareTo(Empleado o) {
		// TODO Auto-generated method stub
		return this.getNif().compareTo(o.getNif());
	}


	@Override
	public String toString() {
		return "Empleado [Tipo=" + this.tipoEmpleado() + " nombre=" + nombre + ", apellidos=" + apellidos + ", nif=" + nif + ", antiguedad=" + antiguedad
				+ ", salario=" + salario + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(nif);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Empleado other = (Empleado) obj;
		return Objects.equals(nif, other.nif);
	}
	
	
	//Impuestos es un numero entre 0 y 1.
	protected double calculaImpuestos(double sueldoBruto, double impuestos) {
		return sueldoBruto * impuestos;		
	}
	
	
	

}
