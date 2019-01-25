package oopImtiaz;

public class Fish extends Animals {
	

	String color;
	

	
	
	public Fish(String spicies, String name, int age, String origin, int weigthKg, String food, String color) {
		super(spicies, name, age, origin, weigthKg, food);
		this.color = color;
	}

	public void info() {
		System.out.println("Spicies: " + spicies + "\n" + 
				   "Name: " + name + "\n" + 
				   "Age: " + age + " year\n" + 
				   "Color: " + color + "\n" + 
				   "Weigth: " + weigthKg + " kg\n" + 
				   "Origin: " + origin + "\n" + "-----------------------");
	}
	

}
