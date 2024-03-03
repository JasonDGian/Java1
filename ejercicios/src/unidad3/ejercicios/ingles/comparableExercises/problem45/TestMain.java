package unidad3.ejercicios.ingles.comparableExercises.problem45;

public class TestMain {
	public static void main(String[] args) {
// Test constructor and toString()
		Date d1 = new Date(1, 2, 2014);
		Date d2 = new Date(2,1,1991);
		Date d3 = new Date(3,1,1991);
		System.out.println(d1); // toString()
// Test Setters and Getters
		d1.setMonth(12);
		d1.setDay(9);
		d1.setYear(2099);
		System.out.println(d1); // toString()
		System.out.println("Month: " + d1.getMonth());
		System.out.println("Day: " + d1.getDay());
		System.out.println("Year: " + d1.getYear());
// Test setDate()
		d1.setDate(3, 4, 2016);
		System.out.println(d1); // toString()
		
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d2.compareTo(d3));

		System.out.println(d1.compareTo(d1));
		System.out.println(d1.compareTo(d2));
		System.out.println(d2.compareTo(d1));
		
		
	}
}

/*
 * The expected output is: 01/02/2014 09/12/2099 Month: 12 Day: 9 Year: 2099
 * 03/04/2016
 */