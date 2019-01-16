package algorithms;

public class Demo {

	public static void main(String[] args) {
		int[] numbers = {10, 25, 433, 26, 73, 132, 5};
		
		// Call a function that searches for a specific number;
		int pos = algorithms.Search.linearSearch(numbers, 73);
		System.out.println("Found at index: " + pos);

	}

}
