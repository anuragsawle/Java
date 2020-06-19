package collection;
import java.sql.*;
import java.util.*;
public class stack {
	public static void main(String ar[])
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver"); 
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee?"+"autoReconnect=true&useSSL=false","anurag","anurag88");
			Statement stmt = con.createStatement();
			String s= "select * from Employee.Emp";
//			PreparedStatement ps = con.prepareStatement(s);
			ResultSet rs= stmt.executeQuery(s);
			List<Employee> st = new Stack<Employee>();
			while(rs.next())
			{
				st.add(new Employee(rs.getInt(1),rs.getString(2)));
			}
			for(Employee e:st)
			{
				System.out.println("ID:"+e.id+" NAME:"+e.name);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
