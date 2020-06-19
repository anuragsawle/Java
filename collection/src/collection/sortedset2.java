package collection;
import java.util.*;

public class sortedset2 {
	public static void main(String ar[])
	{
		SortedSet<Integer> s = new TreeSet<Integer>();
		List<Integer> a = new ArrayList<Integer>();
		a.add(23);
		s.addAll(a);
		Iterator<Integer> itr= a.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.hasNext());
		}
	}
}
