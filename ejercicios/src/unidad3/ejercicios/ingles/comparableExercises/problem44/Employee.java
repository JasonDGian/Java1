package unidad3.ejercicios.ingles.comparableExercises.problem44;


public class Employee implements Comparable<Employee>{
		
		/*	PROBLEM 44
		 * 	Implements the interface Comparable<Employee> for the Employee class in problem 4 
		 * 	and override the compareTo method which sorts employees by salary. 
		 * 	Build a testclass to test the compasiron.
		 * 	Afterwards, write the EMployee Comparator class which implenmetns teh comparator<employee> 
		 * 	interface to compare employees by last name and first name.
		 */


		// Private attributes
		private int id;
		private String firstName;
		private String lastName;
		private int salary;
		
		// Constructors.
		public Employee() {
			
		}
		
		public Employee(int id, String firstName, String lastName, int salary) {
			this.id = id;
			this.firstName = firstName;
			this.lastName = lastName;
			this.salary = salary;
		}

		// Getters.
		public int getId() {
			return id;
		}

		public String getFirstName() {
			return firstName;
		}

		public String getLastName() {
			return lastName;
		}

		public int getSalary() {
			return salary;
		}

		// Setters.
		public void setId(int id) {
			this.id = id;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public void setSalary(int salary) {
			this.salary = salary;
		}
		
		
		// Functional methods.
		public String getName() {
			return this.getFirstName() + " " + this.getLastName();
		}
		
		public int getAnnualSalary() {
			return (salary*12);
		}
		
		public int raiseSalary(int percent) {
			int raise = (this.salary*percent)/100;
			int newSalary=this.salary+raise;
			setSalary(newSalary);
			return this.salary;
		}

		@Override
		public String toString() {
			return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", salary=" + salary
					+ "]";
		}

		@Override
		public int compareTo(Employee o) {
			
			/* if (this.getSalary() > o.getSalary() ) {return 1;}
			else if (this.getSalary() < o.getSalary() ) {return -1;}
			else {return 0;} */

			return this.getSalary() > o.getSalary() ? 1 : this.getSalary() < o.getSalary() ?  -1 :  0;
		}

		
		

}


