package unidad3.ejercicios.ingles.comparableExercises.problem46;

public class Customer implements Comparable<Customer> {

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
		return this.getName() + " (" + this.getId() + ") (" + this.discount + "%)";
	}

	@Override
	public int compareTo(Customer o) {

		if (this.getId() > o.getId()) {

			return 1;

		} else if (this.getId() < o.getId()) {

			return -1;

		} else {

			if (this.getName().compareTo(o.getName()) > 0) {

				return 1;

			} else if (this.getName().compareTo(o.getName()) < 0) {

				return -1;

			}

			else {
				return 0;
			}

		}

	}

}
