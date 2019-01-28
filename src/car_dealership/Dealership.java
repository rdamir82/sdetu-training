package car_dealership;

public class Dealership extends Entity {

	public static void main(String[] args) {

		Dealership dealership = new Dealership("The Dealership", "Address", 0, 5);

		Customer cust1 = new Customer("Tom", "123 Anything St.", 40000);
		Customer cust2 = new Customer("Sherlock", "221b Baker St.", 5000);

		Vehicle car1 = new Vehicle("Honda SXC", 7000.00, "Diesel", "Yellow", 2005);
		Vehicle car2 = new Vehicle("NISSAN Skyline RB25", 8000.00, "Petrol", "Silver", 1998);
		Vehicle car3 = new Vehicle("MAZDA", 5000.00, "Diesel", "Yellow", 1989);
		Vehicle car4 = new Vehicle("Ford", 7000.00, "Diesel", "Red", 2005);
		Vehicle car5 = new Vehicle("Mercedes", 14000.00, "Diesel", "Silver", 2010);

		Employee emp1 = new Employee("Adel", "JNA 40", 0, 0);
		Employee emp2 = new Employee("Leda", "JNA 40", 0, 0);

		purchaseCar(cust1, car1, emp1, dealership);
		purchaseCar(cust1, car5, emp2, dealership);
		purchaseCar(cust1, car2, emp1, dealership);
		purchaseCar(cust2, car3, emp2, dealership);
		purchaseCar(cust1, car4, emp1, dealership);
		purchaseCar(cust1, car5, emp1, dealership);
		purchaseCar(cust2, car5, emp2, dealership);
		

	}

	// private double dealershipsBalance = 0;
	private double precentForSeller = 5;

	public Dealership(String name, String addres, double balance, double precentForSeller) {
		super(name, addres, balance);
		this.precentForSeller = precentForSeller;
	}

	public static void purchaseCar(Customer cust, Vehicle car, Employee emp, Dealership dealership) {
		System.out.println("---------------------");
		if (car.isInStock() != 0) {
			if (cust.getBalance() >= car.getPrice()) {
	
				double forSeller = car.getPrice() * dealership.precentForSeller / 100;

				cust.withdraw(car.getPrice());
				emp.deposit(forSeller);
				Employee.addOneToSellcount(emp);
				dealership.deposit(car.getPrice() - forSeller);
				Vehicle.removeVehicle(car);
				
				System.out.println(cust.getName() + " buy a " + car.getModel() + " car for $" + car.getPrice()
				+ " from " + emp.getName());
				System.out.println("Dealership got $:" + (car.getPrice() - forSeller));
				System.out.println(emp.getName() + " get: $" + forSeller);
				
				
				dealership.info();
				emp.info();
				cust.info();
				car.info();
				

			} else {
				System.out.println("Customer " + cust.getName() + " try to buy the Vehicle " + car.getModel() + " "
						+ car.getProductionYear() + " for " + car.getPrice() + " from " + emp.getName()
						+ " but need him $" + (car.getPrice() - cust.getBalance()));
				
			}
		} else {
			System.out.println("Customer " + cust.getName() + " try to buy the Vehicle " + car.getModel() + " "
					+ car.getProductionYear() + " but " + car.getModel() + " is out of stock.");
		}
	}

	public void info() {
		System.out.println("---------------------");
		System.out.println("Dealerships balance:  $" + getBalance());
	}

}
