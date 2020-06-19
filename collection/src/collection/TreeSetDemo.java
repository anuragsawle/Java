package collection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.*;


public class TreeSetDemo {
	public static void main(String ar[])
	{
		TreeSet<Integer> ts = new TreeSet<Integer>();
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
		ts.addAll(a);
		for(int i:ts)
		{
			System.out.println(i);
		}
		System.out.println(a);
		System.out.print(ts);
	}
	static ArrayList getA()
	{
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
		return (ArrayList) a;
	}
	static ArrayList getB()
	{
		List<String> a = new ArrayList<String>();
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
				a.add(rs.getString(2));
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		Collections.shuffle(a);
		return (ArrayList) a;
	}
}
