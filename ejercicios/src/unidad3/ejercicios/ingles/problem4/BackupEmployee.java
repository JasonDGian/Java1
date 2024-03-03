package unidad3.ejercicios.ingles.problem4;

public class BackupEmployee {
	
	// Atributos
	private int id;
	private String firstName;
	private String lastName;
	private int salary;
	
	// Constructores
	public BackupEmployee() {
		
	}
	
	public BackupEmployee(int id, String firstName, String lastName, int salary) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	}
	
	// Getters y Setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
	// Metodos funcionales.
	public int raiseSalary(int percent) {
		
		double percentage = (double) percent/100;
		double salaryDec = this.salary;
		salaryDec=salaryDec+salaryDec*percentage;
		setSalary((int) Math.round(salaryDec));
		return this.salary;
	}
	
	
	public int getAnnualSalary() {
		return salary*12;
	}
	
	public String getName() {
		return this.firstName + " " + this.lastName;
	}
	
	
}


