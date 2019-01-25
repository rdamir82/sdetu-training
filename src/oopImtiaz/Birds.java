package oopImtiaz;

public class Birds extends Animals {
	
	String color;
	int wingSpawnCm;
	
	public Birds(String spicies, String name, int age, String origin, int weigthKg, String food, int wingSpawnCm, String color) {
		super(spicies, name, age, origin, weigthKg, food);
		this.wingSpawnCm = wingSpawnCm;
		this.color = color;
	}
	

	


	public void info() {
		System.out.println("Spicies: " + spicies + "\n" + 
				   "Name: " + name + "\n" + 
				   "Age: " + age + " year\n" + 
				   "Color: " + color + "\n" + 
				   "Weigth: " + weigthKg + " kg\n" + 
				   "Wing Spawn: " + wingSpawnCm + " cm\n" + 
				   "Origin: " + origin + "\n" +
				   "Eating: " + food + "\n" + "-----------------------");
	}
	
	

}
