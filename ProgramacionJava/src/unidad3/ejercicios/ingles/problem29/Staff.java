package unidad3.ejercicios.ingles.problem29;

public class Staff extends Person {

	// Atribute
	private String school;
	private double pay;
	
	// Constructores
	public Staff(String name, String address, String school, double pay) {
		super(name, address);
		this.school = school;
		this.pay = pay;
	}

	// Getters y Setters
	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public double getPay() {
		return pay;
	}

	public void setPay(double pay) {
		this.pay = pay;
	}

	@Override
	public String toString() {
		return "Staff [" + super.toString() + ", school=" + this.school + ", pay=" + this.pay + "]" ;
	}
}
	
	// To String

