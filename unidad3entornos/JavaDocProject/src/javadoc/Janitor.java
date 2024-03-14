package javadoc;


/**
 * This class will implement or model the abstraction of a particular  type of worker in our application 
 * called janitor
 * 
 * 
 * @author Carlos Cano
 * 
 */

public class Janitor extends Employee implements EmployeeSalary, IEmployeeType {

	
	public Janitor() {
		
		
	}
	
	public Janitor(int id, String name, double salary) {
		super(id,name,salary);
	
	}

	
	@Override
	public String toString() {
		return "Janitor [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

	@Override
	public String employeeFunction() {
		// TODO Auto-generated method stub
		return EnumEducationEmployee.JANITOR.getFunction();
	}

	@Override
	public EnumEducationEmployee getTipo() {
		// TODO Auto-generated method stub
		return EnumEducationEmployee.JANITOR;
	}

}
