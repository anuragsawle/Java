package collection;
import java.util.*;
public class stack1 {
	public static void main(String ar[])
	{
		Stack<Integer> st= new Stack<Integer>();
		st.add(34);
		st.add(54);
		st.add(56);
		Iterator<Integer> itr = st.iterator();
		while(itr.hasNext())
		{
			System.out.println( itr.next());
		}
	}
}
