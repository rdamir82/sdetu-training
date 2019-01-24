package oopImtiaz;

public class Fish {
	
	String spicies;
	public Fish(String spicies, String name, String color, String origin, int age, int weight) {
		super();
		this.spicies = spicies;
		this.name = name;
		this.color = color;
		this.origin = origin;
		this.age = age;
		this.weight = weight;
	}
	String name;
	String color;
	String origin;
	
	int age;
	int weight;
	
	public void info() {
		System.out.println("Spicies: " + spicies + "\n" + 
				   "Name: " + name + "\n" + 
				   "Age: " + age + " year\n" + 
				   "Color: " + color + "\n" + 
				   "Weigth: " + weight + " kg\n" + 
				   "Origin: " + origin + "\n" + "-----------------------");
	}
	

}
