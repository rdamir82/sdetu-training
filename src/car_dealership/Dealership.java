package car_dealership;

public class Dealership {

	public static void main(String[] args) {
		
		
		Account dealerShipAcc = new Account(0);
		
		Customer cust1 = new Customer();
		
		cust1.name = "Tom";
		cust1.address = "123 Anything St. ";
		cust1.cashOnHand = 12000;
		
		Vehicle car1 = new Vehicle("Honda SXC", 7000.00, "Diesel", "Yellow", 2005);
		Vehicle car2 = new Vehicle("NISSAN Skyline RB25", 8000.00, "Petrol", "Silver", 1998);
		Vehicle car3 = new Vehicle("Honda SXC", 7000.00, "Diesel", "Yellow", 2005);
		Vehicle car4 = new Vehicle("Honda SXC", 7000.00, "Diesel", "Yellow", 2005);
		Vehicle car5 = new Vehicle("Honda SXC", 7000.00, "Diesel", "Yellow", 2005);
		
		Employee emp1 = new Employee("Adel","JNA 40", 0);
		dealerShipAcc.info();
		
		car1.info();
		car2.info();
		
		cust1.info();
		cust1.purchaseCar(car1, emp1, true, dealerShipAcc);
		cust1.info();
		cust1.purchaseCar(car2, emp1, true, dealerShipAcc);
		emp1.info();
		
		car1.info();
		car2.info();
		
		dealerShipAcc.info();

	}

}
