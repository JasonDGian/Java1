package unidad3.ejercicios.ingles.problem29;

public class Person {

	// Atributos
	private String name;
	private String address;
	
	// Constructores
	public Person(String name, String address) {
		this.name = name;
		this.address = address;
	}
	
	// Setters y getters
	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}


	// To string override.
	@Override
	public String toString() {
		return "Person [name=" + name + ", address=" + address + "]";
	}
	
	
}
