package basics;

public class SalaryCalculator {
	public static void main(String[] args) {
		// Create var to define our career
		
		// Declare a variable
		String career;
		System.out.println("Program is starting");
		
		// Define a variable
		career = "Software Developer";
		System.out.println("My career is: " + career);
		
		// Declare & define
		int hoursPerWeek = 40;
		int weeksPerYear = 50;
		double rate = 20.0;		
		
		// We can re-declare variables:
		
		career = "Web Developer";
		
		// Compute our annual salary		
		// rate * hoursPerWeek * weeksPerYear
		
		double salary = hoursPerWeek * weeksPerYear * rate;
		
		System.out.println("My salary as a " + career + " at the rate of $" + rate + " per hour is $" + salary + " per Year.");
		
		
	}
}
