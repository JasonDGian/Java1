package javadoc;

/**
 * {@summary This enum represents the different types of Employees in the
 * education model}
 * 
 * 
 * 
 * Values offered in the enum are
 * <ul>
 * <li>
 * 
 * JANITOR</li>
 * <li>
 * 
 * TEACHER</li>
 * </ul>
 *
 * 
 * @author Carlos Cano
 * @author Serena Lopez
 * @version 1.2
 * @since 1.0
 * 
 */

public enum EnumEducationEmployee {
	/**
	 * 
	 * Represents the Janitor employee type in the model
	 * 
	 */

	JANITOR(1, "Janitor", "FrontOffice assistance"),

	/**
	 * 
	 * Represents the Teacher employee type in the model
	 * 
	 */

	TEACHER(2, "Teacher", "Teach and Prepare materials");

	/**
	 * 
	 * This is the id of the enum type
	 * 
	 */

	private int id;
	/**
	 * 
	 * A short description for the enum type
	 * 
	 */
	private String shortDescription;

	/**
	 * 
	 * The function of the employee represented by the enum type
	 * 
	 */

	private String function;

	EnumEducationEmployee(int id, String shortDescription, String function) {
		this.id = id;
		this.shortDescription = shortDescription;
		this.function = function;
	}

	/**	 
	 * 
	 * @return int the enum id
	 */
	public int getId() {
		return id;
	}
	
	/**	 
	 * 
	 * @return String the short description of the enum type
	 */

	public String getShortDescription() {
		return shortDescription;
	}
	
	/**	 
	 * 
	 * @return String the function of the employee represented by the enum type
	 */

	public String getFunction() {
		return function;
	}

}
