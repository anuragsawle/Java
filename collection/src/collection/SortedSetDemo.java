package collection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.*;


public class SortedSetDemo {
	public static void main(String ar[])
	{
		SortedSet<Integer> s = new TreeSet<Integer>();
		List<Integer> a = new ArrayList<Integer>();
		try
		{
			Class.forName("com.mysql.jdbc.Driver"); 
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee?"+"autoReconnect=true&useSSL=false","anurag","anurag88");
			Statement stmt = con.createStatement();
			String s1= "select * from Employee.Emp";
//			PreparedStatement ps = con.prepareStatement(s);
			ResultSet rs= stmt.executeQuery(s1);
			while(rs.next())
			{
				a.add(rs.getInt(1));
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		Collections.shuffle(a);
		s.addAll(a);
		s.add(166);
		s.add(167);
		Iterator<Integer> itr = s.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println(a);
		System.out.println(s);
		
	}
}
