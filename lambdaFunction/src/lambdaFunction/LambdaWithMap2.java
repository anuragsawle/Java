package lambdaFunction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class LambdaWithMap2 {
	public static void main(String[] args) {
		List<ArrayList<Integer>> numbers= new ArrayList<ArrayList<Integer>>();
		numbers.add(new ArrayList<Integer>( Arrays.asList(2,4,6,8,10)));
		numbers.add(new ArrayList<Integer>( Arrays.asList(1,2,3,4)));
		numbers.add(new ArrayList<Integer>( Arrays.asList(1,3,5,7)));
		numbers.add(new ArrayList<Integer>( Arrays.asList(2,4,8,16,32,64,128)));
		System.out.println("2D array list is");
		numbers.forEach((n)-> System.out.println(n));
		System.out.println("Sum of each row is");
		List<Integer> squares = numbers.stream().map( i ->i.stream().mapToInt(a->a).sum()
				).collect(Collectors.toList());
		System.out.println(squares);
		}
}
