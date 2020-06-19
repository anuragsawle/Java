package lambdaFunction;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;



public class LambdaWithMap {
	public static void main(String[] args) {
		
	List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9); 
	System.out.println("Square of each element of List using Map:");
	List<Integer> squares = numbers.stream().map( i -> i*i).collect(Collectors.toList());
	System.out.println(squares);
	}
}
