package car_dealership;

public class Employee extends Entity{
		
	private int sellCount;
	
	public Employee(String name, String addres, int sellCount, double balance) {
		super(name, addres, balance);
		this.sellCount = sellCount;
	}


	public void info() {
		System.out.println("------------------");
		System.out.println("Employee: " + getName());
		System.out.println("Address: " + getAddres());
		System.out.println("Sell: " + sellCount + " car");
		System.out.println("Balance: $" + getBalance());

	}
	
	public static void addOneToSellcount(Employee emp) {
		emp.sellCount++;
	}
	

}

