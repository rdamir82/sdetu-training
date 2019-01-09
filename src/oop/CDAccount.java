package oop;

public class CDAccount extends BankAccount implements IRate{
	
	String interestRate;
	
	void compount() {
		System.out.println("Compunding Interest");
	}

}
