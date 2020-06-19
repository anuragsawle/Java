package multithreading;

public class farmer extends Market1 {
	
	String fruit;
	public farmer(int fruitsNumber) {
		super(fruitsNumber);
	}

	public synchronized void addFruit(String fruit) {
		if (isFull()) {
			System.out
					.println("We can not accept more fruites at the moment !!");
			try {
				wait();
			} catch (InterruptedException e) {
				System.out.println("Interruption");
			}
		}
		fruits.add(fruit);
		System.out.printf("fruit : %s is added !!!%n", fruit);
	}
}
