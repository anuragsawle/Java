package collection;
import java.util.*;


public class arraylist4 {
	public static void main(String ar[])
	{
		List<Employee> al = new ArrayList<Employee>();
		List<Integer> i = collection.TreeSetDemo.getA();
		List<String> s = collection.TreeSetDemo.getB();
		Iterator<Integer> itr = i.iterator();
		Iterator<String> itr1 = s.iterator();
		while(itr.hasNext())
		{
			Employee e= new Employee(itr.next(),itr1.next());
			al.add(e);
		}
		Iterator<Employee> itr2 = al.iterator();
		while(itr2.hasNext())
		{
			Employee e=itr2.next();
			System.out.println(e.id+":"+e.name);
		}
	}
}
