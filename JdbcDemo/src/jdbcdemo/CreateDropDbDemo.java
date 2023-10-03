package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateDropDbDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		String driver="com.mysql.cj.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306";
		String username="root";
		String password="root";
		String createDb="create database demodb";
		String useDb="use demodb";
		String dropDb="drop database demodb";
		
		Class.forName(driver);
		Connection con=DriverManager.getConnection(url,username,password);
		Statement stmt=con.createStatement();
		//stmt.execute(createDb);
		//System.out.println("Database created....");
		
		stmt.execute(useDb);
		System.out.println("Database used....");
		
		stmt.execute(dropDb);
		System.out.println("Database deleted....");
	}

}
