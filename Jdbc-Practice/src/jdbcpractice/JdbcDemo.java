package jdbcpractice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JdbcDemo {

	public static void main(String[] args) {
		
		String mySqlDriver="com.mysql.cj.jdbc.Driver";
		String username="root";
		String password="root";
		String url="jdbc:mysql://localhost:3306";
		
		try {
			Class.forName(mySqlDriver);
			Connection con=DriverManager.getConnection(url,username,password);
			System.out.println("Connected");
			Statement stmt=con.createStatement();  
			stmt.execute("create database jdbcdemo");
			System.out.println("Database created");
		}
		
		catch(Exception e) {
			e.getMessage();
		}
		
		finally {
			
		}
		
	}

}
