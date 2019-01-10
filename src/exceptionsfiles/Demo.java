package exceptionsfiles;

public class Demo {

	public static void main(String[] args) {
		System.out.println("Program start!");
		int a = 5;
		int b = 0;
		doMath(a, b);
		System.out.println("Program end!");		
	}
	
	public static void doMath(int a, int b) {
		answer(a, b);
	}
	
	public static double answer(int x, int z) {
		// Catch ERROR HERE
		return x / z;
	}

}
