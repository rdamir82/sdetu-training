package car_dealership;

public class Vehicle {
	
	private String model;
	private double price;
	private String engineType;
	private String color;
	private int productionYear;
	private int inStock = 1;
	
	public Vehicle(String model, double price, String engineType, String color, int productionYear) {
		super();
		this.model = model;
		this.setPrice(price);
		this.engineType = engineType;
		this.color = color;
		this.productionYear = productionYear;
	}
	
public void info() {
		
		System.out.println("---------------------");
		System.out.println("Model: " + getModel());
		System.out.println("price: $" + getPrice());
	/*	
		System.out.println("engine type: " + engineType);
		System.out.println("color:  " + color);
		System.out.println("Year: " + getProductionYear());
	*/
		if (isInStock() == 0) {
			System.out.println("OUT OF STOCK!!!");
		} else {
			System.out.println("IN STOCK");
		}		
	}

public static void removeVehicle(Vehicle vehicle ) {
	vehicle.setInStock(vehicle.isInStock() - 1);
}

public int isInStock() {
	return inStock;
}

public void setInStock(int inStock) {
	this.inStock = inStock;
}

public double getPrice() {
	return price;
}

public void setPrice(double price) {
	this.price = price;
}

public String getModel() {
	return model;
}


public int getProductionYear() {
	return productionYear;
}


}
