package car_dealership;

public class Account {
	

	double balance;
	
	
	public Account(double balance) {
		super();
		this.balance = balance;
	}
	
	
	public void info() {
		System.out.println("------------------");
		System.out.println("DealerShips balance:  $" + balance);
	}

}
