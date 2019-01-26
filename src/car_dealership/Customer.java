package car_dealership;

public class Customer extends Person {

	double cashOnHand;

	public Customer(String name, String addres, double cashOnHand) {
		super(name, addres);
		this.cashOnHand = cashOnHand;
	}

	public void purchaseCar(Vehicle vehicle, Employee emp, boolean finance, Account dealerShipAcc) {
		System.out.println("------------------");

		if (vehicle.getInStock() == 0) {
			System.out.println("Customer " + getName() + " try to buy the Vehicle " + vehicle.getModel() + " "
					+ vehicle.getProductionYear() + " but " + vehicle.getModel() + " is out of stock.");
		} else if (cashOnHand >= vehicle.getPrice()) {
			System.out.println("Customer " + getName() + " buy the Vehicle " + vehicle.getModel() + " " + vehicle.getProductionYear()
					+ " for $" + vehicle.getPrice() + " from " + emp.getName());
			cashOnHand -= vehicle.getPrice();
			Vehicle.removeVehicle(vehicle);
			Employee.addOneToSellcount(emp);
			double precentForDealer = vehicle.getPrice() * 0.05;
			dealerShipAcc.setBalance(dealerShipAcc.getBalance() + (vehicle.getPrice() - precentForDealer));
			Employee.addToBalance(emp, vehicle.getPrice(), precentForDealer);
			
		} else {
			System.out.println("Customer " + getName() + " try to buy the Vehicle " + vehicle.getModel() + " "
					+ vehicle.getProductionYear() + " for " + vehicle.getPrice() + " from " + emp.getName() + " but need him $"
					+ (vehicle.getPrice() - cashOnHand));
		}

	}

	public void info() {

		System.out.println("---------------------");
		System.out.println("Customer: " + getName());
		System.out.println("Address: " + getAddres());
		System.out.println("Cash:  $" + cashOnHand);
	}
}
