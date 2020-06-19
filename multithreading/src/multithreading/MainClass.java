package multithreading;


public class MainClass {
	public static void main(String[] args) {
		Market market = new Market(5);
		market.farmer("apple");
		market.farmer("grapes");
		market.farmer("watermelon");
		market.farmer("orange");
		market.farmer("apple");
		System.out.println("buyed:"+market.consumer());
		System.out.println("buyed:"+market.consumer());
		System.out.println("buyed:"+market.consumer());
		market.farmer("grapes");
		market.farmer("watermelon");
		System.out.println("buyed:"+market.consumer());
		market.farmer("orange");
		market.farmer("apple");
		market.farmer("watermelon");
		market.farmer("orange");
	}
}
