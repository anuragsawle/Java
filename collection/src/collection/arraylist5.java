package collection;
import java.util.Date;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collections;

public class arraylist5 {
	public static void main(String a[])
	{
		ArrayList<Integer> a1= new ArrayList<Integer>();
		for(int i=1;i<=100000;i++)
		{
			a1.add(i);
		}
		Collections.shuffle(a1);      
		Date date = new Date();
	    long timeMilli = date.getTime();
		Collections.sort(a1);
        long timeMilli1 = date.getTime();
		long t3 = timeMilli1-timeMilli;
		System.out.print(timeMilli);
		
	}
}
