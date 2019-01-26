package car_dealership;

public class Vehicle {
	
	String model;
	double price;
	String engineType;
	String color;
	int productionYear;
	int inStock = 1;
	
	public Vehicle(String model, double price, String engineType, String color, int productionYear) {
		super();
		this.model = model;
		this.price = price;
		this.engineType = engineType;
		this.color = color;
		this.productionYear = productionYear;
	}
	
public void info() {
		
		System.out.println("---------------------");
		System.out.println("Model: " + model);
		System.out.println("engine type: " + engineType);
		System.out.println("price: $" + price);
		System.out.println("color:  " + color);
		System.out.println("Year: " + productionYear);
		if (inStock == 0) {
			System.out.println("OUT OF STOCK!!!");
		} else {
			System.out.println("IN STOCK");
		}		
	}

}
