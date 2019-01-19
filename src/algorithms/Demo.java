package algorithms;

public class Demo {

	public static void main(String[] args) {
		int[] numbers = {10, 25, 433, 26, 73, 132, 5, 35};
		int[] sortedNumbers = {5, 9, 12, 18, 21, 26, 29, 35, 39, 45, 49, 51, 58, 59, 61, 72, 88, 91, 94};
		
		// Call a linear search function that searches for a specific number;
		int pos = algorithms.Search.linearSearch(numbers, 73);
		System.out.println("Found at index: " + pos);
		
		
		// Call the binary search
		algorithms.Search.binarySearch(sortedNumbers, 94, 0, sortedNumbers.length-1);
		
		
		// Call the bubble sort function
		
		Sort.bubbleSort(numbers);
		
	}

}
