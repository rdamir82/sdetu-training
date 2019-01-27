package car_dealership;

public class Entity {

	private String name;
	private String addres;
	private double balance;

	

	public Entity(String name, String addres, double balance) {
		super();
		this.name = name;
		this.addres = addres;
		this.balance = balance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddres() {
		return addres;
	}

	public void setAddres(String addres) {
		this.addres = addres;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void deposit(double amount) {
		balance += amount;
	}
	
	public void withdraw(double amount) {
		balance -= amount;
	}

}
