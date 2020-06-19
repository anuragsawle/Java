package collection;
import java.util.*;

public class vector2 {
	public static void main(String ar[])
	{
		Vector v1= new Vector();
		ArrayList a = collection.TreeSetDemo.getB();
		v1.addAll(a);
		v1.remove(65);
		Iterator itr = v1.iterator();
		int i=1;
		while(itr.hasNext())
		{
			System.out.println(i+" "+itr.next());
			i+=1;
		}
	}
}
