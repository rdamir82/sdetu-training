package oopImtiaz;

public class Animals {
	String spicies;
	public Animals(String spicies, String name, int age, String origin, int weigthKg, String food) {
		super();
		this.spicies = spicies;
		this.name = name;
		this.age = age;
		this.origin = origin;
		this.weigthKg = weigthKg;
		this.food = food;
	}

	String name;
	int age;
	String origin;
	int weigthKg;
	String food;
	
	
	
	public void eat() {
		System.out.println(name + " the " + spicies + " eating..");
		
	}
	
	public void sleep() {
		System.out.println(name + " the " + spicies + " sleeping..");
		
		
	}
	
	public void about() {
		System.out.println("Spicies: " + spicies + "\n" + 
						   "Name: " + name + "\n" + 
						   "Age: " + age + " year\n" + 
						   "Weigth: " + weigthKg + " kg\n" + 
						   "Origin: " + origin + "\n" +
						   "Eating: " + food + "\n" + "-----------------------");
	}
	
	
}
