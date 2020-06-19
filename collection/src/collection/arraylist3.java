package collection;
import java.util.*;

public class arraylist3 {
	public static void main(String ar[])
	{
		List<Integer> a = new ArrayList<Integer>();
		a.add(34);
		a.add(45);
		a.add(65);
		a.add(23);
		Collections.shuffle(a);
		SortedSet<Integer> s = new TreeSet<Integer>();
		s.addAll(a);
		Iterator<Integer> itr = s.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}
