package lambdaFunction;

import java.util.ArrayList;

interface squ {
	int sqr(int a);
}

public class LambdaInCollection {
	public static void main(String[] args) {
		ArrayList<Integer> ar = new ArrayList<Integer>();
		ar.add(4);
		ar.add(5);
		ar.add(9);
		ar.add(10);
		squ s= (a)->a*a;
		System.out.println("square of elements of array:");
		ar.forEach((n)-> System.out.println(s.sqr(n)));
	}
}
