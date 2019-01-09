package basics;

public class FibonnaciApp {

	public static void main(String[] args) {
		// Fibonnaci number is defined by the sum of the 2 previous fibonnaci numbers
		// fib(0) = 0
		// fib(1) = 1
		// fib(2) = fib(1) + fib(0)
		// fib(3) = fib(2) + fib(1)
		/*
		int numberOfFibs = 20;
		int fib1 = 0;
		int fib2 = 1;
		
		for(int i = 0; i < numberOfFibs; i++) {
			int fib =  fib1 + fib2;
			System.out.println(fib);
			fib1 = fib2;
			fib2 = fib;			
		}
		*/
		int number = 200;
		System.out.println(fib(number));
	}
	
	public static int fib(int n) {
		if (n == 0) {
			return 0;
		}
		else if (n == 1) {
			return 1;
		}
		return ((fib(n-1) + fib(n-2)));
	}

}
