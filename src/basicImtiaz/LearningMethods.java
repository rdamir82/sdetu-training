package basicImtiaz;

import someotherpackage.ExampleClass;

public class LearningMethods{

	public static void main(String[] args) {
		
//		System.out.println("sdfgsdfgsdfsd");
//		MyUtils.printSomeJunk(34);
//		MyUtils.printSomeJunk("34");
//		
//		MyUtils.sum2Numbers(10, 23);
		
		int myVar = MyUtils.add10(99) + 1000 - 50;
		System.out.println(myVar);
		
		int someJunkInt = MyUtils.printSomeJunk(34);
		System.out.println(someJunkInt);
		
		ExampleClass.doSomething();
	}
	
	
	

}
