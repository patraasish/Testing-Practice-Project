package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertQueryDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		String driverName="com.mysql.cj.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/animated_movies";
		String username="root";
		String password="root";
		//String query="insert into movies values('title1','genre1','director1','2000')";
		String query2="insert into movies values(?,?,?,?)"; 
		
		Class.forName(driverName);
		Connection con=DriverManager.getConnection(url,username,password);
//		Statement stmt=con.createStatement();
//		stmt.executeUpdate(query);
//		
		
		//using prepared statement
		PreparedStatement ps=con.prepareStatement(query2);
		ps.setString(1, "title2");
		ps.setString(2, "genre2");
		ps.setString(3, "director2");
		ps.setString(4, "2002");
		
		ps.executeUpdate();
		con.close();
		
		
	}

}
