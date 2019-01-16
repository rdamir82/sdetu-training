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

}
