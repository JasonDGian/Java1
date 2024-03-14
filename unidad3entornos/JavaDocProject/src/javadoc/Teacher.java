package javadoc;

public class Teacher extends Employee implements EmployeeSalary, IEmployeeType {

	
	public Teacher() {
		
		
	}
	
	public Teacher(int id, String name, double salary) {
		super(id,name,salary);
	
	}

	
	@Override
	public String toString() {
		return "Teacher [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

	@Override
	public double calculateSalary() {
		// TODO Auto-generated method stub
		
		
		return salary + 200 - calculateTaxes();
	}

	@Override
	public double calculateTaxes() {
		// TODO Auto-generated method stub
		return salary*0.20;
	}

	@Override
	public String employeeFunction() {
		// TODO Auto-generated method stub
		return EnumEducationEmployee.TEACHER.getFunction();
	}

	@Override
	public EnumEducationEmployee getTipo() {
		// TODO Auto-generated method stub
		return EnumEducationEmployee.TEACHER;
	}
	
	
	
	
	
	
	

}
