package jdbcpractice;

//1. Import the sql packages
import java.sql.*;

public class JdbcDemo2 {

	public static void main(String[] args) throws Exception {
		
		//String driverName="com.mysql.cj.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306";
		String username="root";
		String password="root";
		String sqlQuery="create database jdbcdemo2";
		
		//2. load the driver class
		// one way to load the driver
		Driver driver=new com.mysql.cj.jdbc.Driver();
		DriverManager.registerDriver(driver);
		System.out.println("Driver loaded");
		
		//another way to load driver class
		//The forName() method of java.lang.Class class 
		//It is used to get the instance of this Class with the specified class name
		//Class.forName(driverName);
		//System.out.println("Driver loaded");
		
		//3. Connect to the database
		Connection con=DriverManager.getConnection(url,username,password);
		System.out.println("Create Connection");
		
		//4. Create Statement
		Statement stmt=con.createStatement();
		System.out.println("Create Statement");
		
		//5. Execute the statement
		stmt.execute(sqlQuery);
		System.out.println("Execute sql query");
		System.out.println("Database Created");
		
		//6. Close the connection
		stmt.close();
		con.close();
		
		
	}

}
