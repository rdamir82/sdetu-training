package basics;

public class Cities {

	public static void main(String[] args) {
		// Declare and define an array
		String[] cities = {"New York", "San Francisco", "Miami", "Dallas"};
		System.out.println(cities[0]);
		System.out.println(cities[1]);
		System.out.println(cities[2]);
		System.out.println(cities[3]);
		

		
		// Declare array
		String[] countries;
		
		// Define the Arrray
		countries = new String[3];
		countries[0] = "USA";
		countries[1] = "Canada";
		countries[2] = "Mexico";
		
		System.out.println(countries[2]);
		
		// Declare the array (only size)		
		String[] states = new String[5];
		
		// define:
		states[0] = "California";
		states[1] = "Ohio";
		states[2] = "New Jersy";
		states[3] = "Texas";
		states[4] = "Utah";
		
		// Do Loop: enters the loop THEN test condition
		int i = 0;
		do {
		System.out.println("STATE: " + states[i]);
		i = i + 1;
		} while (i < 5);
		
		// While Loop: test condition first then enter the loop
		int n = 0;
		while(n < 5) {
			System.out.println("STATES at " + n + ": " + states[n]);
			n++;
		}
		
		// While Loop: test condition first then enter the loop and find for element 
		int j = 0;
		boolean stateFound = false;
		while(stateFound == false) {
			String state = states[j];
			System.out.println(state);
			
			if(state == "Texas") {
				System.out.println("STATE FOUND!");
				stateFound = true;
			}
			j++;
		}
		
		System.out.println("\nPRINTING WITH FOR LOOP\n");
		// For loop: best structure for iterating an array
		for(int x = 0; x < states.length; x++ ) {
			System.out.println(states[x]);
		}
		
		
		
	}

}
