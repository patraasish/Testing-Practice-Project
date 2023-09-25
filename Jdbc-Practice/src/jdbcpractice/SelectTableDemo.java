package jdbcpractice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SelectTableDemo {

	public static void main(String[] args) {
		String driverName="com.mysql.cj.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/demodatabase";
		String username="root";
		String password="root";
		String query="Select * from student";
		
		try {
			Class.forName(driverName);
			Connection con=DriverManager.getConnection(url,username,password);
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery(query);
			
			while(rs.next()) {
				System.out.println("student id: "+rs.getInt("s_id"));
				System.out.println("Student name: "+rs.getString("s_name"));
			}
			
			
		}
		catch(Exception e) {
			e.getMessage();
		}

	}

}
