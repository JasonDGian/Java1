package unidad3.ejercicios.ingles.problem13;

public class Customer {
	
	private int id;
	private String name;
	private int discount;
	
	
	public Customer(int id, String name, int discount) {
		this.id = id;
		this.name = name;
		this.discount = discount;
	}

	// Getters

	public int getId() {
		return id;
	}


	public String getName() {
		return name;
	}


	public int getDiscount() {
		return discount;
	}

	// Setter
	public void setDiscount(int discount) {
		this.discount = discount;
	}
	
	
	
	// To string.
	@Override
	public String toString() {
		return this.getName() + " (" + this.getId() + ") ("+ this.discount +"%)";
	}
	
	

	
	
	
	

}
