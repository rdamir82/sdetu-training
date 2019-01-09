package oop;

class Person {
	String name;
	String email;
	String phone;
	
	void walk() {
		System.out.println(name + " is walking");
	};
	void eat() {
		System.out.println(name + " is eating");
	};
	void sleep () {
		System.out.println(name + " is sleeping");
	};
	
}




public class Demo {

	public static void main(String[] args) {
		// instantiating an object
		Person person1 = new Person();
		
		// Define some properties
		person1.name = "John";
		person1.email = "john@gmail.com";
		person1.phone = "546565156";
		
		// Abstraction
		person1.walk();
		person1.sleep();
		person1.eat();
		
		// instantiating another object
		Person person2 = new Person();
		
		// def prop.
		person2.name = "Sara";
		
		// Abstraction
		
		person2.eat();
		
		
		// Person
		
		/*
		// Attributes, variables, adjectives, descriptors
		String name = "Joe";
		String email = "joe@google.com";
		String phone = "4478894654";
		
		
		// Action, activity, behaivor
		walking(name);	
		//System.out.println(name + " is walking");
		System.out.println(name + " is eating");
		
		// What if we want to do this for another person?
		
		String name2 = "Sara";
		String email2 = "sara@google.com";
		String phone2 = "44775894654";
		
		
		// Action, activity, behavior
		//System.out.println(name2 + " is walking");
		walking(name2);	
		System.out.println(name2 + " is eating");
		
		// What about binding attributes and properties together?
		
		*/
	}
	
	// Enhance by adding functions to minimize the code
	/*
	static void walking(String name) {
		System.out.println(name + " is walking");
	} 
	*/
}


