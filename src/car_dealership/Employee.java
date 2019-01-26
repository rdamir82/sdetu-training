package car_dealership;

public class Employee {
	
	String name;
	String addres;
	int sellCount;
	private double balance = 0;
	
	
	public Employee(String name, String addres, int sellCount) {
		super();
		this.name = name;
		this.addres = addres;
		this.sellCount = sellCount;
	}
	
	
	public void info() {
		System.out.println("------------------");
		System.out.println("Employee: " + name);
		System.out.println("Address: " + addres);
		System.out.println("Sell: " + sellCount + " car");
		System.out.println("Balance: $" + getBalance());

	}


	public double getBalance() {
		return balance;
	}


	public void setBalance(double balance) {
		this.balance = balance;
	}

}

