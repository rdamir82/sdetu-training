package practiceLoops;

public class ForLoop {

	public static void main(String[] args) {

		String name = "LEDA";
		String hello = "GREATINGS!";
		

		countChar('A', name);
		countChar('G', hello);

		reverseString(name);
		reverseString(hello);

		printEvenNumberBetween(0, 1001);
		
		int counter = 0;
		printNums(counter);
		
		idxLoop(10);

	}

	public static void reverseString(String str) {
		System.out.println("Original string: " + str);
		System.out.print("reversed string: ");
		for (int i = str.length() - 1; i > -1; i--) {
			System.out.print(str.charAt(i));
		}
		System.out.println("");
	}

	public static void countChar(char x, String str) {
		int foundCount = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == x) {
				foundCount++;
			}
		}
		System.out.println("I found " + foundCount + "-" + x + " in name string");
	}

	public static void printEvenNumberBetween(int x, int y) {
		System.out.println("Even number between " + x + " and " + y + " are: ");
		if (x == 0) {
			x++;
		}
		int count = 0;
		int nextLine = 10;
		for (int i = x; i <= y; i++) {
			if (i / 2 + i / 2 == i) {
				System.out.print(i + ", ");
				count++;
			}
			if (count == nextLine) {
				System.out.println("");
				nextLine += 10;
			}
		}
	}
	
	public static void printNums(int counter) {
		for (int i = 0; i <= 100; i++) {
			System.out.println(i);
			int temp = counter + 1;
			counter = temp;
		}
	}
	
	public static void idxLoop(int idx) {
		
		for(int i = idx; i < 100; i++) {
		System.out.println(i);
			for (int j = 0; j < 10; j++) {
				System.out.println("The value of i(dx) was: " + i + " ----- " + j);
			}
		}
	}

}
