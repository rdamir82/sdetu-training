package oopImtiaz;

public class Human {
	
	String name;
	int age;
	int heightInInches;
	String eyecolor;
	

	
	public Human(String name, int age, int heightInInches, String eyecolor) {
		super();
		this.name = name;
		this.age = age;
		this.heightInInches = heightInInches;
		this.eyecolor = eyecolor;
	}

	public void speak() {
		System.out.println("Hello, my name is " + name);
		System.out.println("I am " + heightInInches + " inches tall");
		System.out.println("i am " + age + " year old.");
	}
	
	public void eat() {
		System.out.println("eating..");
	}
	
	public void walk() {
		System.out.println("walking..");
	}
	
	public void work() {
		System.out.println("working..");
	}
	
}
