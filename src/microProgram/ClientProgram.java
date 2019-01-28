package microProgram;

public class ClientProgram {

	public static void main(String[] args) {
		
		Multiplier mult = new Multiplier();
		int result = mult.multiply(2, 3, 4);
		System.out.println("Result of Multiplier:");
		System.out.println(result);

	}

}
