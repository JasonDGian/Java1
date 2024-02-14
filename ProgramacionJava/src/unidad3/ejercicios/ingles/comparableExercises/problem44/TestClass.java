package unidad3.ejercicios.ingles.comparableExercises.problem44;


public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee e1 = new Employee(1, "A", "C", 1200);
		Employee e2 = new Employee(2, "B", "B", 1500);
		Employee e3 = new Employee(1, "C", "C", 1200);


		EmployeeComparator empComp = new EmployeeComparator();
		
		System.out.println(empComp.compare(e1, e1));
		System.out.println(empComp.compare(e1, e2));
		System.out.println(empComp.compare(e1, e3));
		
		System.out.println("------------------------");

		System.out.println(empComp.compare(e2, e1));
		System.out.println(empComp.compare(e2, e2));
		System.out.println(empComp.compare(e2, e3));
		
		System.out.println("------------------------");
		System.out.println(empComp.compare(e3, e1));
		System.out.println(empComp.compare(e3, e2));
		System.out.println(empComp.compare(e3, e3));

	}

}
