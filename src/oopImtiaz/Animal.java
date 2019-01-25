package oopImtiaz;

public class Animal {
	
	int age;
	String gender;
	int weightInKg;
	
	public Animal(int age, String gender, int weightInKg) {
		super();
		this.age = age;
		this.gender = gender;
		this.weightInKg = weightInKg;
	}
	
	public void eat() {
		System.out.println("eating..");
	}
	
	public void sleep() {
		System.out.println("Sleeping..");
	}

}
