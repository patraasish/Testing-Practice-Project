package jdbcpractice;

import java.sql.*;
public class CreateDatabaseDemo {

	public static void main(String[] args) throws SQLException {
		
		String driverName="com.mysql.cj.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306";
		String username="root";
		String password="root";
		String query="create database demodatabase";
		
		Connection con=null;
		Statement stmt=null;

		try {
			Class.forName(driverName);
			con=DriverManager.getConnection(url,username,password);
			System.out.println("Connected");
			stmt=con.createStatement();
			
			// execute() method used for static query
			stmt.execute(query);
			System.out.println("Database Created..");	
		}
		
		catch(Exception e) {
			e.getMessage();
		}
		
		finally {
			stmt.close();
			con.close();
			System.out.println("Database Closed");
		}
		
	}

}
