package datastructures;

import java.util.ArrayList;

public class Lists {

	public static void main(String[] args) {
		// 1. create a colection
		ArrayList<String> cities = new ArrayList<String>();
		
		// 2. Add some elements
		
		cities.add("Cliveland");
		cities.add("Toronto");
		cities.add("Chicago");
		cities.add("Miami");
		
		// 3. Iterate the collection
		
		for(String city : cities) {
			System.out.println(city);
		}
		
		// 4. Get the size
		int size = cities.size();
		System.out.println("There are " + size + " elements in the collection");
		
		// 5. Retrieve specific element
		
		System.out.println(cities.get(3));
		
		// 6. remove
		
		System.out.println("We remove " + cities.get(0) + " from collection");
		cities.remove(0);		
		size = cities.size();
		
		System.out.println("There are now " + size + " elements in the collection");
		for(String city : cities) {
			System.out.println(city);}
	}

}
