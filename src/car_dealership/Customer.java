package car_dealership;

public class Customer extends Person {

	
	public Customer(String name, String addres, double balance) {
		super(name, addres, balance);
		
	}
	

	public void info() {

		System.out.println("---------------------");
		System.out.println("Customer: " + getName());
		System.out.println("Address: " + getAddres());
		System.out.println("Cash:  $" + getBalance());
	}
	

}
