package collection;
import java.util.*;
public class arraylist1 {
	public static void main(String a[])
	{
		ArrayList<String> a1= new ArrayList<String>();
		a1.add("Anurag");
		a1.add("ABC");
		a1.add("ABD");
		ArrayList<String> a2= new ArrayList<String>();
		a2.addAll(a1);
		Iterator<String> itr = a2.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
				
	}
}
