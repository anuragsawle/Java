package lambdaFunction;

public class threadwithLambda {
	public static void main(String[] args) {
		new Thread(() -> System.out.println("My Runnable")).start();
	}
}
