package multithreading;

import java.util.ArrayList;

public class Market1 {
	protected ArrayList<String> fruits = new ArrayList<>();
	private int fruitsNumber;

	// make a constructor to get set the fruit number on initializing the market
	
	public Market1(int fruitsNumber) {
		if (fruitsNumber > 0) {
			this.fruitsNumber = fruitsNumber;
		} else {
			throw new IllegalArgumentException("This argument is not valid");
		}
	} // end of the constructor

	public Market1() {
		// TODO Auto-generated constructor stub
	}
	// check if their is no place or its full //
	protected synchronized boolean isFull() {
		return fruits.size() == this.fruitsNumber;
	}

	protected synchronized boolean isEmpty() {
		return fruits.isEmpty();
	}
}
