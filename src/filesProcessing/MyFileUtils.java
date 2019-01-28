package filesProcessing;

public class MyFileUtils {
	public int subtract10FromLargerNumber(int number) throws Exception {
		if(number < 10) {
			throw new FooRuntimeException("The Number passed was smaller then 10");
		}
		return number -10;
	}
	
	public class FooRuntimeException extends Exception{
		public FooRuntimeException(String message) {
			super(message);
		}
	}
}
