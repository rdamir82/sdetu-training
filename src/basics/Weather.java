package basics;

public class Weather {
	public static void main (String[] args) {
		// This program will give suggestions of what to wear based on the weather (temperature, sun condition)
		
		int temperature = 24;
		String sunCondition = "Overcast";
		
		if(temperature > 25 ) {
			System.out.println("It's pleasant. wear shorts and T-shrit");
		} else if (temperature > 15 && sunCondition.equals("Sunny")) {
			System.out.println("It's a little cooler. Perhaps wear long-sleeve shirta and jeans.");
			System.out.println("Wear a hat to keep sun out of your eyes");
		} else if (temperature > 15 || sunCondition.equals("Overcast")) {
			System.out.println("This is a cool day, make sure to wear warmer clothes.");
		} 
		
		else {System.out.println("Looks like a cold day. bring a sweater.");}
		
		System.out.println("The program is ending");
		
		
	}
}
