package car_dealership;

public class Account {
	

	private double balance;
	
	
	public Account(double balance) {
		super();
		this.setBalance(balance);
	}
	
	
	public void info() {
		System.out.println("------------------");
		System.out.println("DealerShips balance:  $" + getBalance());
	}


	public double getBalance() {
		return balance;
	}


	public void setBalance(double balance) {
		this.balance = balance;
	}

}
