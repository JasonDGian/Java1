package unidad3.ejercicios.ingles.problem13;

public class Invoice {
	
	private int id;
	private Customer customer;
	private double amount;
	
	
	public Invoice(int id, Customer customer, double amount) {
		this.id = id;
		this.customer = customer;
		this.amount = amount;
	}
	
	public int getId() {
		return this.id;
	}

	public Customer getCustomer() {
		return this.customer;
	}
	
	public void setCustomer(Customer customer) {
		this.customer=customer;
	}

	public double getAmount() {
		return this.amount;
	}
	
	public void setAmount(double amount) {
		this.amount=amount;
	}
	
	public int getCustomerId() {
		return customer.getId();
	}
	
	public String getCustomerName() {
		return customer.getName();
	}
	
	public int getCustomerDiscount() {
		return customer.getDiscount();
	}
	
	public double getAmountAfterDiscount() {

		return this.getAmount()-((this.getAmount()*this.getCustomerDiscount())/100);
	}

	@Override
	public String toString() {
		return "Invoice [id=" + id + ", customer=" + customer + ", amount=" + amount + "]";
	}
	
	

} // Cierra invoice class

