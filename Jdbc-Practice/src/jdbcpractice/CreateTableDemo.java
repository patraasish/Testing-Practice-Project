package jdbcpractice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateTableDemo {

	public static void main(String[] args) {
	
		String driverName="com.mysql.cj.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/demodatabase";
		String username="root";
		String password="root";
		String query="create table student(s_id integer,s_name varchar(50))";
		
		try {
			Class.forName(driverName);
			Connection con=DriverManager.getConnection(url,username,password);
			System.out.println("Connected");
			Statement stmt=con.createStatement();
			
			stmt.execute(query);
			System.out.println("Table Created Successfully");
			con.close();
		}
		
		catch(Exception e) {
			e.getMessage();
		}
		
		
	}

}
