package oopImtiaz;

public class Birds {
	
	String spicies;
	public Birds(String spicies, String name, String color, String food, String origin, int age, int weight, int wingSpawnCm) {
		super();
		this.spicies = spicies;
		this.name = name;
		this.color = color;
		this.food = food;
		this.origin = origin;
		this.age = age;
		this.weight = weight;
		this.wingSpawnCm = wingSpawnCm;
	}
	String name;
	String color;
	String food;
	String origin;
	
	int age;
	int weight;
	int wingSpawnCm;
	
	public void info() {
		System.out.println("Spicies: " + spicies + "\n" + 
				   "Name: " + name + "\n" + 
				   "Age: " + age + " year\n" + 
				   "Color: " + color + "\n" + 
				   "Weigth: " + weight + " kg\n" + 
				   "Wing Spawn: " + wingSpawnCm + " cm\n" + 
				   "Origin: " + origin + "\n" +
				   "Eating: " + food + "\n" + "-----------------------");
	}
	
	

}
