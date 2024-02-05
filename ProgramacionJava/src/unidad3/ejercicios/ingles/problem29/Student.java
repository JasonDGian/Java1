package unidad3.ejercicios.ingles.problem29;

public class Student extends Person {

	// Student
	private String program;
	private int year;
	private double fee;
	
	
	// Constructor que invoca al padre.
	public Student(String name, String address, String program, int year, double fee) {
		super(name, address);
		this.program = program;
		this.year = year;
		this.fee = fee;
	}

	
	// Getters y setters
	public String getProgram() {
		return program;
	}

	public void setProgram(String program) {
		this.program = program;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public double getFee() {
		return fee;
	}

	public void setFee(double fee) {
		this.fee = fee;
	}

	// To string
	@Override
	public String toString() {
		return "Student [" + super.toString() + ", school=" + this.getProgram() + ", year=" + this.getYear() + ", fee= " + this.getFee()+ "]";
	}	
	
}
