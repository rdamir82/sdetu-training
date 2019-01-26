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
		this.setModel(model);
		this.setPrice(price);
		this.engineType = engineType;
		this.color = color;
		this.setProductionYear(productionYear);
	}
	
public void info() {
		
		System.out.println("---------------------");
		System.out.println("Model: " + getModel());
		System.out.println("engine type: " + engineType);
		System.out.println("price: $" + getPrice());
		System.out.println("color:  " + color);
		System.out.println("Year: " + getProductionYear());
		if (getInStock() == 0) {
			System.out.println("OUT OF STOCK!!!");
		} else {
			System.out.println("IN STOCK");
		}		
	}

public static void removeVehicle(Vehicle vehicle ) {
	vehicle.setInStock(vehicle.getInStock() - 1);
}

public int getInStock() {
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

public void setModel(String model) {
	this.model = model;
}

public int getProductionYear() {
	return productionYear;
}

public void setProductionYear(int productionYear) {
	this.productionYear = productionYear;
}

}
