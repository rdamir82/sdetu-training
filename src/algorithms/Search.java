package algorithms;

public class Search {
	
	public static int linearSearch(int[] dataset, int target) {
		// Iterate through dataset searching for target
		for(int i = 0; i < dataset.length; i++) {
			if(dataset[i] == target) {
				return i;
			}
		}
		return -1;
	}
	
	public static int binarySearch(int[] dataSet, int target, int start, int end) {
		// binary search assumes a sorted array and can therfore continually split our search domain in half
		
		int midpoint = (int) Math.floor(((start + end)/2));
		
		//System.out.println("midpoint: " + midpoint);
		
		int value = dataSet[midpoint];
		
		//System.out.println("value is: " + value);
		if(end < start) { 
			
			System.out.println("Cant found " + target + " in this array");
			
			return -1; }
		
		if (target > value ) {
			//System.out.println( target + " > " + value);
			
			return binarySearch(dataSet, target, midpoint + 1, end);
		}
		
		else if (target < value) {
			
			//System.out.println( target + " < " + value);
			
			return binarySearch(dataSet, target, start, midpoint - 1);
		}
		
		
		System.out.println("Target (" + target + ") find at position: " + midpoint);
		
		return midpoint;
	
	
	}

}
