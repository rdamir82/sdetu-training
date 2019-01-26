package practiceStrings;

public class StringsPractice {

	public static void main(String[] args) {
		
		String str = "ABCDEFG";
		
		String extractedString = str.substring(0, 7);
		
		System.out.println(str.charAt(6));
		
		System.out.println(extractedString);
		
		String a = "hello";
		String b = "there";
		
		
		if(a.equals(b)) {
			// USE THIS!!!
		}
		
		if(b.equalsIgnoreCase("There")) {
			System.out.println("Printed there");
		}
		
		String test = "Hello there yogi there";
		
		int inexOf = test.indexOf("there", 7);
		
		System.out.println(inexOf);
		
		int lastIndexOf = test.lastIndexOf("yogi");
		
		System.out.println(lastIndexOf);
		
	}

}
