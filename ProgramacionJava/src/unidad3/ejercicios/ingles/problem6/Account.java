package unidad3.ejercicios.ingles.problem6;

public class Account {


	
	// Private attributes
	private String id;
	private String name;
	private int balance = 0;
	private Account_Type accountType;

	// Constructors
	public Account(String id, String name) {
		this.id = id;
		this.name = name;
	}

	public Account(String id, String name, int balance) {
		this.id = id;
		this.name = name;
		this.balance = balance;
	}
	
	public Account(String id, String name, Account_Type accountType) {
		this.id = id;
		this.name = name;
		this.accountType = accountType;
	}

	// Getters
	public String getID() {
		return this.id;
	}

	public String getName() {
		return this.name;
	}

	public int getBalance() {
		return this.balance;
	}
	
	public Account_Type getAccountType() {
		return this.accountType;
	}
	
	public void setAccountType(Account_Type accountType) {
		this.accountType=accountType;
	}
	
	public String getAccountTypeDesc() {
		return this.getAccountType().getDescription();
	}
	
	public int credit(int amount) {
		this.balance = (this.balance + amount);
		return this.balance;
	}

	public int debit(int amount) {

		if (amount <= this.balance) {
			this.balance = (Math.subtractExact(this.balance, amount));
		} else {
			System.out.println("Amount exceeds current available balance");
		}

		return this.balance;
	}

	public int transferTo(Account beneficiary, int amount) {

		if (amount <= this.balance) {
			this.debit(amount);
			beneficiary.credit(amount);
		} else {
			System.out.println("Amount exceeds current available balance");
		}

		return this.balance;
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", name=" + name + ", balance=" + balance + ", account type="+ accountType + "]";
	}

}
