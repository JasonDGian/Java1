package javadoc;


/**
 * *{@summary  Short description of the class}
 * 
 * This tag can only be utilized in the class header
 * <p>
 * This is an abstract class that models Employees. It is intended to define the hierachy base of our model
 * Teacher and Janitor would extend it
 * It forces subclasses to implement the employeeFunction method: {@link javadoc.Employee#employeeFunction()}
 * 
 * </p>
 *  
 * For some algorithms the String API is needed
 * <a href="https://docs.oracle.com/en/java/javase/14/docs/api/java.base/java/lang/String.html"> API String</a>
 * 
 * Subclasses Extending this class are:
 * <ul>
 * 			<li>
 * 				Teacher
 * 			</li>
 * 	     	<li>
 * 				Janitor
 * 			</li>
 *  </ul>

 * 
 * @author Carlos Cano
 * @author Serena Lopez 
 * @version 1.2
 * @since 1.0
 * @see javadoc.EmployeeSalary {@link javadoc.EmployeeSalary}
 */

public abstract class  Employee implements EmployeeSalary {
	
	
	/**
	 * 
	 * Employee id 
	 * 
	 */
	protected int id;
	/**
	 * 
	 * The name of the Employee
	 * 
	 */
	protected String name;
	
	/**
	 * 
	 * The salary of the Employee
	 * 
	 */
	protected double salary;
	
	
	/**
	 * This method calculates  the salary for the specific worker. Receives no parameters
	 * This method will be implemented by all subclasses	 * 
	 * as a teacher that you can see in the link {@link Teacher#employeeFunction()}
	 *	 	 * 
	 * 
	 *@return double
	 *@see Teacher#employeeFunction() javadoc.Conserje#funcionTrabajador()
	 *
	 */
	
	public abstract String employeeFunction();
	
	public Employee() {
		
		
	}
	
	
	/**
	 * This method will be reused by subclasses to create objects with the call
	 * to Super	  
	 * 
	 *@param id, id is the employee identifier, which is mandatory
	 *@param name, employee name
	 *@param salary, the salary is a decimal number
	 *@see Teacher#employeeFunction() javadoc.Conserje#funcionTrabajador()
	 *@version 1.2
	 *@since 1.0
	 *
	 *
	 */	
	
	public Employee(int id, String name, double salary) {
	
		this.id=id;
		this.name = name;
		this.salary = salary;
	}

	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	



	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

	@Override
	public int hashCode() {
		
		return id;
	}

	@Override
	public boolean equals(Object obj) {
	
		
		return this.id==((Employee) obj).getId(); 
		
	}
	
	
	

	@Override
	public double calculateSalary() {
		// TODO Auto-generated method stub
		
		
		return salary - calculateTaxes();
	}

	
	//Comentar usando author @return @since
	@Override
	public double calculateTaxes() {
		// TODO Auto-generated method stub
		return salary*0.10;
	}
	
	//Comentar usando author @return @since
	public double calculateBaseSalary() {
		
	
		
		return salary-  calculateTaxes();
		}
	
	
	/**
     * This method will be reused by subclasses to create objects with the call
	 * to Super	  
	 * 
	 *@return double, sueldo del trabajador
	 *@see Teacher#employeeFunction() 
	 *@see javadoc.Janitor#employeeFunction()
	 *@version 1.1
	 *@since 1.0
	 *@deprecated since version 1.1 because there is a new method 
	 *{@link Employee#calculateBaseSalary()}
	 */
	@Deprecated(since = "1.1", forRemoval = true)
	public double deprecatedSalaryCalculation() {
		
		return salary*0.12;
	}
	

}
