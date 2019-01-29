package collectionsAndGenerics;

import java.util.ArrayList;
import java.util.LinkedList;

public class Applications {

	public static void main(String[] args) {
		
		// ArrayList words = new ArrayList(); // pre java 5
		ArrayList<String> words = new ArrayList<String>(); // Parametrisation 
		
		words.add("hello");
		words.add("there");
		words.add("10");
		
		String item1 = words.get(2);
		
		System.out.println(item1);
		
		
		
		// pre java 5:
		//int item1 = (int) words.get(2);
		//int item2 = (int) words.get(3);
		//System.out.println(item1 + item2);
		
		
		// Linked list you can't use primitives here!
		LinkedList<Integer> numbers = new LinkedList<Integer>();
		numbers.add(100);
		numbers.add(200);
		numbers.add(45);
		numbers.add(1000);
		
		for(int number : numbers) {
			System.out.println(number);
		}
		
		
		

	}

}
