package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ProcedureDemo {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		String driverName="com.mysql.cj.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/animated_movies";
		String username="root";
		String password="root";
		
		
		String query = "Call SelectALLMovies()";
		Class.forName(driverName);
		Connection con = DriverManager.getConnection(url, username, password);
		
		Statement stmt = con.createStatement();
		ResultSet rs= stmt.executeQuery(query);
		// print all the rows on the console
		
		while(rs.next())
		{
			System.out.print("Title: " + rs.getString("title") + "\t");
			System.out.print("genre: " + rs.getString("genre") + "\t");
			System.out.print("Director: " + rs.getString("director") + "\t");
			System.out.println("release_year: " + rs.getString("release_year") + "\t");
		}
		
		// Close the connection
		
		con.close();

	}

}
