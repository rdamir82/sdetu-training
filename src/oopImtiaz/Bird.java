package oopImtiaz;

public class Bird extends Animal{
	
	int wingSpawnCm;
	
	public Bird(int age, String gender, int weightInKg, int wingSpawnCm) {
		super(age, gender, weightInKg);
		this.wingSpawnCm = wingSpawnCm;
		
	}

	public void fly() {
		System.out.println("Flying..");
	}
}
