package collection;
import java.util.*;


public class HashSetDemo {
	public static void main(String ar[])
	{
		HashSet<Object> hs = new HashSet<Object>();
		hs.add(23);
		hs.add(56);
		hs.add(45);
		hs.add(76);
		hs.add(21);
		hs.add(67);
		hs.add(23);
		hs.add(32);
		System.out.println(hs);
	}
}
