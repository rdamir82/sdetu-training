package threadingInventoryManager;

public class Application {

	public static void main(String[] args) {
		
		InventoryManager manager = new InventoryManager();
		
		Thread inventoryTask = new Thread(new Runnable() {
			
			@Override
			public void run() {
				manager.populateSoldProducts();
			}
			
		});
		
		Thread displayTask = new Thread(new Runnable() {
			
			@Override
			public void run() {
				manager.displaySoldProducts();
			}
			
		});
		
		inventoryTask.start();
		try {
			/* !!! sleep() are pieces that are good to know about 
			 * but these lower level methods are not meant to
			 * be used for managing threat execution.
			 * Java provides some other mechanisms for managing 
			 * threat execution known as the executer framework with
			*/			
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		displayTask.start();
		
	}

}
