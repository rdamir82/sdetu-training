package car_dealership;

public class Employee extends Person{
		
	private int sellCount;
	private double balance = 0;
	
	public Employee(String name, String addres, int sellCount, double balance) {
		super(name, addres);
		this.sellCount = sellCount;
		this.balance = balance;
	}


	public void info() {
		System.out.println("------------------");
		System.out.println("Employee: " + getName());
		System.out.println("Address: " + getAddres());
		System.out.println("Sell: " + sellCount + " car");
		System.out.println("Balance: $" + getBalance());

	}


	public double getBalance() {
		return balance;
	}
	
	public static void addOneToSellcount(Employee emp) {
		emp.sellCount++;
	}
	
	public void deposit(double amount) {
		balance += amount;
	}

}

