package oop;

public class BankAccount implements IRate {
	// Define variables
	String accountNumber;
	
	
	// static >> belongs to the class not to the object instance
	// final >> constant (often static final)
	private static final String routingNumber = "456978";
	
	// Instance Variables
	private String name;
	private String ssn;
	String accounType;
	double balance;
	
	// Constructor definitions: unique methods
		// 1. They are used to define / setup / initialize properties of an object
		// 2. Constructors are IMPLICITLY called upon instantiation
		// 3. The same name as the class itself
		// 4. Constructors have NO return type
	BankAccount(){
		System.out.println("New Account created!");
	}
	// Overloading: call same method name with different arguments
	BankAccount(String accountType){
		System.out.println("NEW ACCOUNT: " + accountType);
	}
	BankAccount(String accountType, double initDeposit){
		// initDeposit, saccountType, Msg are local variables
		System.out.println("NEW ACCOUNT: "+ accountType);
		System.out.println("INITIAL DEPOSIT OF: $" + initDeposit);
		String Msg = null;
		if (initDeposit < 1000 ) {
			Msg = "ERROR: minimum deposit must be at least $1.000";
		} else {
			Msg = "Thanks for your initial deposit of: $" + initDeposit;
		}
		System.out.println(Msg);
		balance += initDeposit;
	}
	
	// Getters / Setter
	
	// Allow the user to define the name
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	public void setSSN(String ssn) {
		this.ssn = ssn;
	}
	
	public String getSSN() {
		return ssn;
	}
	
	// Interface methods
	public void setRate() {
		System.out.println("SET RATE");
	}
	public void increaseRate() {
		System.out.println("INCREASE RATE");
	}
	
	
	
	// Define methods
	public void deposit(double amount) {
		balance = balance + amount;
		showActivity("DEPOSIT");
	}
	
	void withdraw(double amount) {
		balance = balance - amount;
		showActivity("WITHDRAW");
	}
	
	// Private : can only be called from within the class
	private void showActivity(String activity){
		System.out.println("YOUR RECENT TRANSACTION: " + activity);
		System.out.println("NEW BALANCE: $" + balance);
		
	}
	
	void checkBalance() {
		
	}
	
	void getStatus() {
		
	}
	@Override
	public String  toString() {
		return "[ NAME: " + name + ". ACCOUNT#" + accountNumber + " . ROUTING #" + routingNumber + ". BALANCE: $" + balance + " ]" ;
	}

}
