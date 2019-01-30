package traversingListCustomTypes;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Application {

	public static void main(String[] args) {
		ArrayList<String> animals = new ArrayList<String>();
		animals.add("lion");
		animals.add("cat");
		animals.add("dog");
		animals.add("bird");
		
		for(int i = 0; i < animals.size(); i++) {
			System.out.println(animals.get(i));
		}
		// For Each introduced at JAVA 5
		
		for(String value : animals) {
			System.out.println(value);
		}
		
		
		LinkedList<Vehicle> vehicles = new LinkedList<Vehicle>();
		Vehicle vehicle2 = new Vehicle("Toyota", "Camery", 1200, false);
		
		vehicles.add(new Vehicle("Honda", "accord", 1200, false));
		vehicles.add(vehicle2);
		vehicles.add(new Vehicle("Jeep", "Wrangler", 25000, true));
		
		for(Vehicle values : vehicles) {
			System.out.println(values);
			/*System.out.println(values.make);
			System.out.println(values.model);
			System.out.println(values.price);
			System.out.println(values.fourWDrive);
			*/
		}
					
		printElements(animals);
		printElements(vehicles);
		
	}
	
	public static void printElements(List someList) {
		for(int i = 0; i < someList.size(); i++) {
			System.out.println(someList.get(i));
		}
	}

}
