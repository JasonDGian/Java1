package javadoc;


import java.lang.String;
import java.util.ArrayList;
import java.util.List;

import utilities.Formats;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EmployeeSalary trab = new Janitor(1, "Mateo",15000.567576);
		
		EmployeeSalary prof = new Teacher(1, "Jesus",30000.35345);
		
		double totalImpuestos = trab.calculateTaxes() + prof.calculateTaxes();
		
		double totalSueldos = trab.calculateSalary() + prof.calculateSalary();
		
		
		System.out.println("Total  a pagar de impuestos: " + Formats.formatDoubles(totalImpuestos,3));
		
		System.out.println("Total a pagar de sueldos sin contar impuestos: " +Formats.formatDoubles(totalSueldos-totalImpuestos,2));
		
		System.out.println("Total a pagar: " + totalSueldos);
		
		String res =Formats.toCapitalLetters(" Carlos cano");
		
		System.out.println("Primera con mayusculas" + res);
		
		
		String s ="Micadena";
		List<String> lista = new ArrayList<String>();
		
		
		
	}

}
