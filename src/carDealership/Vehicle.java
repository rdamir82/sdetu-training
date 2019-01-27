package carDealership;

public class Vehicle {
	
	private String make;
	private String model;
	private double price;
	public Vehicle(String make, String model, double price) {
		super();
		this.make = make;
		this.model = model;
		this.price = price;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getMake() {
		return make;
	}
	public String getModel() {
		return model;
	}
	
	
}
