package basics;

public class NumbersCalc {
	
	public static void main(String[] args) {
		System.out.println("Program is starting!");
		printName();
		int numA = 10;
		int numB = 20;
		addNumbers(numA, numB);
		int product = multiplyNumbers(numA, numB);
		System.out.println("The product of number " + numA + " and " + numB + " is " + multiplyNumbers(numA, numB));
		System.out.println("The product of number " + numA + " and " + numB + " is " + product);
		allInOne(numA, numB);
		
	}
	static void printName() {
		System.out.println("My name is Tim");
	}
	
	static void addNumbers(int numberA, int numberB) {
		int sum = numberA + numberB;
		System.out.println("The sum of numbers " + numberA + " and " + numberB + " is " + sum);
	}
	
	static int multiplyNumbers(int a, int b) {
		int product = a * b;
		return product;
	}
	
	// YOU CAN PUT FUNCTION IN TO FUNCTION!
	static void allInOne(int a, int b) {
		printName();
		addNumbers(a, b);
		addNumbers(a, multiplyNumbers(a,b));
	}
	
	
}
