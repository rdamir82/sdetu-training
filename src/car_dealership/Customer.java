package car_dealership;

public class Customer {
	
	String name;
	String address;
	double cashOnHand;
	
	
	public void purchaseCar(Vehicle vehicle, Employee emp, boolean finance, Account dealerShipAcc) {
		System.out.println("------------------");
		
		if (vehicle.inStock == 0) {
			System.out.println("Sorry, " + vehicle.model + " is out of stock.");
		} 
		else if (cashOnHand >= vehicle.price) {
		System.out.println("Customer " + name + " buy the Vehicle " + vehicle.model + " " + vehicle.productionYear + " for $" + vehicle.price + " from " + emp.name);
		cashOnHand -= vehicle.price;
		vehicle.inStock--;
		emp.sellCount++;
		double precentForDealer = vehicle.price * 0.05;
		dealerShipAcc.setBalance(dealerShipAcc.getBalance() + (vehicle.price - precentForDealer));
		emp.setBalance(emp.getBalance() + precentForDealer);
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
