package collection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class test {
	public static void main(String[] args) throws ClassNotFoundException {
		Class.forName("com.mysql.jdbc.Driver");
		try {
			Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee?"+"autoReconnect=true&useSSL=false", "anurag", "anurag88");
			System.out.println("c");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
