package carDealership;

public class Dealership {

	public static void main(String[] args) {
		Customer cust1 = new Customer("Tom", "123 Anything St.", 12000);
				
		Vehicle vehicle = new Vehicle("Ford", "T-Model", 16000);
		
		Employee emp = new Employee();
		
		
		
		cust1.purchaseCar(vehicle, emp, false);
				
		
	}

}
