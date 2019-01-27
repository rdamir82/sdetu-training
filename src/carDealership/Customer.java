package carDealership;

public class Customer {
	
	private String name;
	private String address;
	
	public Customer(String name, String address, double cashOnHand) {
		super();
		this.name = name;
		this.address = address;
		this.cashOnHand = cashOnHand;
	}


	private double cashOnHand;
	
	

	public void purchaseCar(Vehicle vehicle, Employee emp, boolean finance) {
		emp.handleCustomer(this, finance, vehicle);
	}
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public double getCashOnHand() {
		return cashOnHand;
	}


	public void setCashOnHand(double cashOnHand) {
		this.cashOnHand = cashOnHand;
	}
	

}
