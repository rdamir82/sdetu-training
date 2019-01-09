package basics;

public class Assigment {

	public static void main(String[] args) {
		
		System.out.println(function(4));
		
		System.out.println(factorial(5));
		
		double[] test = {2.00, 1, 2, 2};
		
		System.out.println(minimun(test));
		
		System.out.println(maximum(test));
		
		System.out.println(avarage(test));
		
		
		

	}
	
	public static int function( int n ) {
		int res = 0;
		for( int i = 1; i <= n ; i ++) {
			res += i; 
		}		
		return res;		
	}
	
	public static int factorial(int n) {
		if ( n == 0 || n == 1 ) {
			return 1;
		} 
		else { return ( n * factorial(n-1));    }
	}
	
	public static double minimun( double[] arr) {
		double min = arr[0];
		for(int i = 1; i < arr.length; i++ ) {
			if(min > arr[i]) {
				min = arr[i];
			}
		}		
		return min;
	}
	
	public static double maximum( double[] arr) {
		double max = arr[0];
		for(int i = 1; i < arr.length; i++ ) {
			if(max < arr[i]) {
				max = arr[i];
			}
		}		
		return max;
	}
	
	public static double avarage( double[] arr) {
		double sum = 0;
		for(int i = 0; i < arr.length; i++ ) {
			sum += arr[i];
		}		
		return sum / arr.length;
	}
	
	

}
