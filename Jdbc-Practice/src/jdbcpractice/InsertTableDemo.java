package jdbcpractice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertTableDemo {

	public static void main(String[] args) {
		
		String driverName="com.mysql.cj.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/demodatabase";
		String username="root";
		String password="root";
		String query="insert into student values(2,'Chinu')";
		
		
		try {
			
			Class.forName(driverName);
			Connection con=DriverManager.getConnection(url,username,password);
			con.setAutoCommit(true);
			Statement stmt=con.createStatement();
			int status=stmt.executeUpdate(query);
			System.out.println(status+" row effected");
			//con.close();
			
		}
		
		catch(Exception e) {
			e.getMessage();
		}
		
	}

}
