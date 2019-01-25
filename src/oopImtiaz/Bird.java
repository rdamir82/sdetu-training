package oopImtiaz;

public class Bird extends Animal{
	
	int wingSpawnCm;
	
	public Bird(int age, String gender, int weightInKg, int wingSpawnCm) {
		super(age, gender, weightInKg);
		this.wingSpawnCm = wingSpawnCm;
		
	}

	@Override
	public void move() {
		System.out.println("Flapping wings.. ");
		
	}


}
