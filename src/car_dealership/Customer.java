package car_dealership;

public class Customer {
	
	String name;
	String address;
	double cashOnHand;
	
	
	public void purchaseCar(Vehicle vehicle, Employee emp, boolean finance, Account dealerShipAcc) {
		System.out.println("------------------");
		if (cashOnHand >= vehicle.price) {
		System.out.println("Customer " + name + " buy the Vehicle " + vehicle.model + " " + vehicle.productionYear + " for $" + vehicle.price + " from " + emp.name);
		cashOnHand -= vehicle.price;
		vehicle.inStock--;
		emp.sellCount++;
		dealerShipAcc.balance += vehicle.price; 
		}
		else {
			System.out.println("Customer " + name + " try to buy the Vehicle " + vehicle.model + " " + vehicle.productionYear + " for " + vehicle.price + " from " + emp.name + " but need him $" + (vehicle.price - cashOnHand));
		}
				
	}
	
	public void info() {
		
		System.out.println("---------------------");
		System.out.println("Customer: " + name);
		System.out.println("Address: " + address);
		System.out.println("Cash:  $" + cashOnHand);
	}
}
