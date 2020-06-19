package collection;
import java.util.*;
import java.util.Map.Entry;

public class hashtabledemo {
	public static void main(String ar[])
	{
    	Hashtable<Integer,String> ht = new Hashtable<Integer,String>();	
    	List<Integer> ls = collection.TreeSetDemo.getA();
    	List<String> ls1 = collection.TreeSetDemo.getB();
    	Iterator<Integer> itr = ls.iterator();
    	Iterator<String> itr1 = ls1.iterator();
    	while(itr.hasNext())
    	{
    		int i = (int) itr.next();
    		String s = (String) itr1.next();
    		ht.put(i, s);
    	}
    	for(Entry<Integer, String> m: ht.entrySet())
    	{
    		System.out.println(m.getKey()+":"+m.getValue());
    	}
	}	
}
