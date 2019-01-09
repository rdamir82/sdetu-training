package oop;

public class BankAccountApp {

	public static void main(String[] args) {
		// Creating a new bank account >> think instantiate an object
		
	BankAccount acc1 = new BankAccount();	
	
	// acc1.name = "Roger hue";
	// With Encapsulation : public API method
	acc1.setName("Roger Hue");
	System.out.println(acc1.getName());
	// acc1.ssn = "484644646" ;
	acc1.setSSN("156418489");
	System.out.println(acc1.getSSN());
	acc1.accountNumber = "545465456";
	acc1.setRate();
	acc1.balance = 10000;
	
	acc1.deposit(1500);
	acc1.deposit(1500);
	acc1.deposit(1500);
	acc1.withdraw(2000);
	
	// Polymorphism through overriding way 2
	System.out.println(acc1.toString());
	
	// Polymorphism through overloadnig way 1
	BankAccount acc2 = new BankAccount("Checking Account");
	acc2.accountNumber = "0514651651";
	BankAccount acc3 = new BankAccount("Savings Account", 4587.05);
	
	
	System.out.println("Your balance is: $" + acc3.balance);
	/*
	// DEMO for inheritance
	CDAccount cd1 = new CDAccount();
	cd1.interestRate = "4.5";
	cd1.balance = 3000;
	cd1.name = "Hello world";
	cd1.accounType = "CD Account";
	cd1.accountNumber = "546541651";
	System.out.println(cd1.toString());
	cd1.compount();
	*/
	}
}
