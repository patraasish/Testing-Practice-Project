package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectQueryDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
	
		String driver="com.mysql.cj.jdbc.Driver";
		String dburl="jdbc:mysql://localhost:3306/animated_movies";
		String username="root";
		String password="root";
		
		Class.forName(driver);
		Connection con=DriverManager.getConnection(dburl,username,password);
		System.out.println("Successfully connected....");
		
		String query="Select * from movies";
		Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery(query);
		
		while(rs.next()) {
			//title       | genre  | director    | release_year
			System.out.print(" title :"+rs.getString(1)+"\t");
			System.out.print(" genre :"+rs.getString(2)+"\t");
			System.out.print(" director :"+rs.getString(3)+"\t");
			System.out.println(" release_year :"+rs.getString(4)+"\t");
			
		}
		

	}

}
