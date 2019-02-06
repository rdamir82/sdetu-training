package threadingSynchronization;

public class Sequence {
	
	private int value = 0;
	
	public synchronized int getNext() {				
		value++;
		return value;		
	}
}


// or use synchronized block  synchronized(this){ code goes here.. }