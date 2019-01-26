package car_dealership;

public class Dealership {

	public static void main(String[] args) {
		
		
		Account dealerShipAcc = new Account(0);
		
		Customer cust1 = new Customer("Tom", "123 Anything St.", 12000);
		
		Vehicle car1 = new Vehicle("Honda SXC", 7000.00, "Diesel", "Yellow", 2005);
		Vehicle car2 = new Vehicle("NISSAN Skyline RB25", 8000.00, "Petrol", "Silver", 1998);
		Vehicle car3 = new Vehicle("MAZDA", 5000.00, "Diesel", "Yellow", 1989);
		Vehicle car4 = new Vehicle("Ford", 7000.00, "Diesel", "Red", 2005);
		Vehicle car5 = new Vehicle("Mercedes", 14000.00, "Diesel", "Silver", 2010);
		
		Employee emp1 = new Employee("Adel","JNA 40", 0, 0);
		dealerShipAcc.info();
		
		car1.info();
		car2.info();
		car3.info();
		car4.info();
		car5.info();

		
		cust1.info();
		cust1.purchaseCar(car1, emp1, true, dealerShipAcc);
		cust1.info();
		emp1.info();
		dealerShipAcc.info();

		cust1.purchaseCar(car3, emp1, true, dealerShipAcc);
		cust1.info();
		emp1.info();
		dealerShipAcc.info();
		
		cust1.purchaseCar(car1, emp1, true, dealerShipAcc);
		
		cust1.purchaseCar(car5, emp1, true, dealerShipAcc);
		
		car1.info();
		car2.info();
		car3.info();
		car4.info();
		car5.info();
		
		
	}

}
