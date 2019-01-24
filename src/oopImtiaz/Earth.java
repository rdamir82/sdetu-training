package oopImtiaz;

public class Earth {
	
	public static void main(String args[]) {
		
/*		Human tom;
		
		tom = new Human();
		
		tom.age = 5;
		tom.eyecolor = "brown";
		tom.heightInInches = 72;
		tom.name = "Tom Szabo";
		
		tom.speak();
		
		Human john;
		
		john = new Human();
		
		john.name = "John Smith";
		john.age = 36;
		john.eyecolor = "blue";
		john.heightInInches = 145;
		
		john.speak();
		
		Human joe = new Human();
		
		joe.name = "Joe";
		joe.eyecolor = "Green";
		joe.name = "Joe Greensilk";
		joe.heightInInches = 68;
		
		joe.speak();*/
		
		Human human1 = new Human("Tom", 25, 76, "Blue");
		Human human2 = new Human("Joe", 28,	68,	"green");
		Human human3 = new Human("Sam", 36,	55,	"Brown");
		
		human1.speak();
		human3.speak();
		human2.speak();
		
		
		
	}

}
