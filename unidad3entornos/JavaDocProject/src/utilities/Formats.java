package utilities;

public class Formats {

	/**
	 * 
	 * <p>
	 * this method return a rounded number with the precision received as a
	 * parameter {@linkplain Math#round(double) *}
	 * </p>
	 * @param number    a double decimal
	 * @param precision the number of decimal digits .
	 * 
	 * @return double the rounded number with argument precision
	 * 
	 * 
	 * @see Math
	 */

	public static double formatDoubles(double number, Integer precision) {

		return Math.round(number * Math.pow(10, precision)) / Math.pow(10, precision);

	}

	/**
	 * 
	 * <p>
	 * This method capitalizes name and lastname This method t and replace the first
	 * letter
	 * </p>
	 * 
	 * <p>
	 * usamos la API String{@linkplain String} mirar el método
	 * trim{@link String#trim}
	 * 
	 * </p>
	 * 
	 * @param Name First Name and LastName separated by blanks
	 * 
	 * @return String Name and lastname capitalized
	 * 
	 * @see java.lang.String
	 */

	public static String toCapitalLetters(String Name) {

		String trimName = Name.trim();

		String operateWithName[] = trimName.split(" ");
		String result = "";

		for (String s : operateWithName) {

			result = result + s.trim().substring(0, 1).toUpperCase() + s.trim().substring(1) + " ";
		}

		return result.trim();

	}

}
