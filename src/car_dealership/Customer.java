package car_dealership;

public class Customer extends Person {

	private double cashOnHand;

	public Customer(String name, String addres, double cashOnHand) {
		super(name, addres);
		this.setCashOnHand(cashOnHand);
	}

	public void info() {

		System.out.println("---------------------");
		System.out.println("Customer: " + getName());
		System.out.println("Address: " + getAddres());
		System.out.println("Cash:  $" + getCashOnHand());
	}
	
	public void withdraw(double amount) {
		setCashOnHand(getCashOnHand() - amount);
	}

	public double getCashOnHand() {
		return cashOnHand;
	}

	public void setCashOnHand(double cashOnHand) {
		this.cashOnHand = cashOnHand;
	}
}
