package carDealership;

public class Dealership {

	public static void main(String[] args) {
		Customer cust1 = new Customer();
		
		cust1.setName("Tom");
		cust1.setAddress("123 Anything St.");
		cust1.setCashOnHand(12000);
		
		Vehicle vehicle = new Vehicle("Ford", "T-Model", 16000);
		
		Employee emp = new Employee();
		
		
		
		cust1.purchaseCar(vehicle, emp, false);
				
		
	}

}
