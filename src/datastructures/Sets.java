package datastructures;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sets {

	public static void main(String[] args) {
		// LinkedHash - in order that they were entered
		// HashSet - complete random order
		// TreeSet - rearranges to natural order (abc) 
		
		// 1. Define the collection
		Set<String> animals = new TreeSet<String>();
		
		// 2. Adding elements
		animals.add("dog");
		animals.add("pig");
		animals.add("hog");
		animals.add("cat");
		animals.add("snake");		
		// System.out.println(animals + " " + animals.size());
		
		animals.add("cat");
		animals.add("snake");
		animals.add("goose");
		System.out.println(animals + " " + animals.size());
		
		// Create new set that we use for comparasion
		
		Set<String> farmAnimals = new HashSet<String>();
		farmAnimals.add("chicken");
		farmAnimals.add("cow");
		farmAnimals.add("pig");
		farmAnimals.add("horse");
		farmAnimals.add("dog");
		
		// What is the INTERSECTION between animals and farm animals
		// 1. CCopy existing set into a new set
		Set<String> intersectionSet = new HashSet<String>(animals);
			
		System.out.println(intersectionSet);
		// 2. Retain ONLY the elements that are also in the other set
		intersectionSet.retainAll(farmAnimals);
		System.out.println("The intesection is: " + intersectionSet);
		
		// What is the UNION between animals and farm animals
		Set<String> unionSet = new HashSet<String>(farmAnimals);
		unionSet.addAll(animals);
		System.out.println("The union is: " + unionSet);
		
		// What is DIFFERENCE (what is unique in selected list!!!)
		Set<String> differenceSet = new HashSet<String>(animals);
		differenceSet.removeAll(farmAnimals);
		System.out.println("The difference is: " + differenceSet);
		
		// What is DIFFERENCE (what is unique in selected list!!!)
				Set<String> differenceSet2 = new HashSet<String>(farmAnimals);
				differenceSet2.removeAll(animals);
				System.out.println("The difference2 is: " + differenceSet2);
		
		
	}
 
}
