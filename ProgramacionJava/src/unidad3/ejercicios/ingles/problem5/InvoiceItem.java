package unidad3.ejercicios.ingles.problem5;

public class InvoiceItem {
	
	// Atributes
	private String id;
	private String desc;
	private int qty;
	private double unitPrice;
	
	// Constructors
	public InvoiceItem(){}

	public InvoiceItem(String id, String description, int quantity, double unitPrice) {
		this.id = id;
		this.desc = description;
		this.qty = quantity;
		this.unitPrice = unitPrice;
	}

	// Setters and getters
	public String getId() {
		return id;
	}
	
	public String getDesc() {
		return desc;
	}

	public int getQty() {
		return qty;
	}
	
	public void setQty(int quantity) {
		this.qty = quantity;
	}

	public double getUnitPrice() {
		return unitPrice;
	}
	
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}	
	
	public double getTotal() {
		return unitPrice*qty;
	}


	public void setId(String id) {
		this.id = id;
	}

	public void setDescription(String description) {
		this.desc = description;
	}
	
	@Override
	public String toString() {
		return "InvoiceItem [id=" + id + ", desc=" + desc + ", qty=" + qty + ", unitPrice=" + unitPrice + "]";
	}

	
}
