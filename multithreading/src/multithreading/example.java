package multithreading;

public class example {
	public static void main(String[] args) {
		customer c = new customer();
		for(int i=0;i<=12; i++)
		{
			System.out.println("fruit buyed:"+c.buyFruit());
		}
	}
}
