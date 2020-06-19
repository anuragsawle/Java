package collection;
import java.util.*;
public class linkedlist {
	public static void main(String a[])
	{
		LinkedList<String> l1 = new LinkedList<String>();
		l1.add("ABC");
		l1.add("ABD");
		l1.add("ABE");
		Iterator<String> itr = l1.iterator();
		while (itr.hasNext())
		{
			System.out.println(itr.next());
		}
		l1.remove(1);
		LinkedList<String> l2 = new LinkedList<String>();
		l2.push("acb");
		l2.push("abc");
		Iterator<String> itr11 = l2.iterator();
		while (itr11.hasNext())
		{
			System.out.println(itr11.next());
		}
	}
}
