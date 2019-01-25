package oopImtiaz;

public class Sparrow extends Bird implements IFlayable {

	public Sparrow(int age, String gender, int weightInKg, int wingSpawnCm) {
		super(age, gender, weightInKg, wingSpawnCm);
	
	}

	public void fly() {
		System.out.println("Sparrow flaying high! ");
		
	}
	
	

}
