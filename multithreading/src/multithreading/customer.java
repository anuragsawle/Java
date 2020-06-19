package multithreading;

public class customer extends Market1 {
	
	public customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public synchronized String buyFruit() {

		if (isEmpty()) {
			System.out.println("we don't have any goods yet");
			try {
				wait();
			} catch (InterruptedException e) {
				System.out.println("interruption occure !!!");
			}
		}
		
		String currentFruitRecusted = fruits.remove(0);
		notifyAll();
		return currentFruitRecusted;
	}
	
}
