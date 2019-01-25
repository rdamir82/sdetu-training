package oopImtiaz;

public class Chicken extends Bird {

	public Chicken(int age, String gender, int weightInKg, int wingSpawnCm) {
		super(age, gender, weightInKg, wingSpawnCm);
		
	}
	// overriding the method defined in Bird
	
	/* removed because of the interface
	public void fly() {
		System.out.println("not able to fly... ");
	}
	*/
}
