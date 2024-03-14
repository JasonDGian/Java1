package javadoc;

import utilities.Formats;

/**
 * This interface  defines the behavior of our class hierarchy
 * Model. It will be implemented by the abstract working class, which 
 * will hand over the implementation to  Teacher and Janitor the classes they inherit from him
 * Requires  the implementation of calculateSalary() and calculateTax to subclasses 
 * Teacher and Janitor

 * @author Carlos Cano
 * @author Serena Lopez 
 * @version 1.2
 * @since 1.0
 * 
 */


public interface EmployeeSalary {
	
	/**
	 * The method purpose is to calculate the employee salary 
	 * 	
	 * @author  Maintenance programmer 8
	 * @version 1.4
	 * @version 1.3
	 *@return double return the employee salary, taxes included
	 *@see Teacher#calculateSalary()  
	 *@see Janitor#employeeFunction()
	 *@see Formats#toCapitalLetters(String)
	 */
	double calculateSalary();
	
	
	/**
	 * This method compute the taxes for a given Employee category and gross salary
	 * 
	 *@return double return Employee salary taxes
	 * @see javadoc.Teacher#calculateTaxes()
	 *
	 */
	double calculateTaxes();
	
	
	

}
