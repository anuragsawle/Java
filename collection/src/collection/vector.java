package collection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.*;
public class vector {
	public static void main(String arp[])
	{
		Vector<Integer> v= new Vector<Integer>();
		System.out.println("SIZE OF VECTOR IS:"+v.size());
		System.out.println("CAPACITY OF VECTOR IS:"+v.capacity());
		v.add(null);
		v.add(1);
		v.add(3);
		v.add(5);
		v.add(3);
		v.add(5);
		v.add(7);
		v.add(4);
		v.add(4);
		v.add(5);
		v.addElement(5);
		System.out.println("SIZE OF VECTOR IS:"+v.size());
		System.out.println("CAPACITY OF VECTOR IS:"+v.capacity());
		try
		{
			Class.forName("com.mysql.jdbc.Driver"); 
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee?"+"autoReconnect=true&useSSL=false","anurag","anurag88");
			Statement stmt = con.createStatement();
			String s= "select * from Employee.Emp";
//			PreparedStatement ps = con.prepareStatement(s);
			ResultSet rs= stmt.executeQuery(s);
			while(rs.next())
			{
				v.add(rs.getInt(1));
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("SIZE OF VECTOR IS:"+v.size());
		System.out.println("CAPACITY OF VECTOR IS:"+v.capacity());
		Enumeration<Integer> enumr=v.elements();
		while(enumr.hasMoreElements())
		{
			System.out.println(enumr.nextElement());
		}
	}
}
