package practiceLoops;

public class LoopsPractice {

	public static void main(String args[]) {/*
											 * 
											 * int count = 0;
											 * 
											 * while(count <= 100) { System.out.println("Imtiaz: " + count ); if (count
											 * == 50) { break; } count++; }
											 * 
											 */

		// Extract all categories from the String argument USE WHILE LOOP!
		String str = "We have large inventory of things in our warehose falling  in "
				+ "the category:apperal and the slightly"
				+ "more in demand category:makeup along with category:furniture and... ";

		System.out.println(str);

		printCategories(str);

		printCategories2(str);

	}

	// My solution:
	public static void printCategories(String str) {
		int searchFrom = 0;
		System.out.println("Categories found in str: ");
		while (searchFrom != -1) {
			searchFrom = str.indexOf("category:", searchFrom);
			if (searchFrom == -1) {
				break;
			}
			int firstChar = (searchFrom + 9);
			int lastChar = str.indexOf(" ", firstChar);
			System.out.println(str.substring(firstChar, lastChar));
			searchFrom = lastChar;
		}

	}

	// Tutor solution:
	public static void printCategories2(String str) {
		int i = 0;
		while (true) {
			int found = str.indexOf("category:", i);
			if (found == -1)
				break;
			int start = found + 9; // Start of the actual category
			int end = str.indexOf(" ", start);
			System.out.println(str.substring(start, end));
			i = end + 1;
		}
	}

}
