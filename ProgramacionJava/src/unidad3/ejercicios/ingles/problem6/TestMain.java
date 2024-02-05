package unidad3.ejercicios.ingles.problem6;

import java.util.Scanner;

import ejercicios.ingles.problem6.Account.Account_Type;

public class TestMain {
	public static void main(String[] args) {
// Test constructor and toString()
		/*
		Account a1 = new Account("A101", "Tan Ah Teck", 88);
		System.out.println(a1); // toString();
		Account a2 = new Account("A102", "Kumar"); // default balance
		System.out.println(a2);
// Test Getters
		System.out.println("ID: " + a1.getID());
		System.out.println("Name: " + a1.getName());
		System.out.println("Balance: " + a1.getBalance());
// Test credit() and debit()
		a1.credit(100);
		System.out.println(a1);
		a1.debit(50);
		System.out.println(a1);
		a1.debit(500); // debit() error
		System.out.println(a1);
// Test transfer()
		a1.transferTo(a2, 100); // toString()
		System.out.println(a1);
		System.out.println(a2);
		*/
		
		Scanner sc = new Scanner(System.in);
		
		Account ac200 = new Account("A200", "Roger Willco", Account_Type.CHECK);
		System.out.println(ac200.getID() + " Name:" + ac200.getName()+ " Balance: " + ac200.getBalance() + " Type of Account: " + ac200.getAccountType());
		
		System.out.println("Current ablance: " + ac200.getBalance());
		ac200.credit(200);
		System.out.println("Deposited 200");
		System.out.println("Current ablance: " + ac200.getBalance());
		
		System.out.println("How much do you want to cash out?");
		ac200.debit(sc.nextInt());
		System.out.println("Current ablance: " + ac200.getBalance());
		System.out.println(ac200);
		
		System.out.println(ac200.getAccountType().getDescription());
		System.out.println(ac200.getAccountType().isDefaulting());

		
	}
}
/*
 * The expected output is: Account[id=A101,name=Tan Ah Teck,balance=88]
 * Account[id=A102,name=Kumar,balance=0] ID: A101 Name: Tan Ah Teck Balance: 88
 * Account[id=A101,name=Tan Ah Teck,balance=188] Account[id=A101,name=Tan Ah
 * Teck,balance=138] Amount exceeded balance Account[id=A101,name=Tan Ah
 * Teck,balance=138] Account[id=A101,name=Tan Ah Teck,balance=38]
 * Account[id=A102,name=Kumar,balance=100]
 */