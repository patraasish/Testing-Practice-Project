package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TransactionDemo {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		String driverName="com.mysql.cj.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/animated_movies";
		String username="root";
		String password="root";
		
		String query="insert into movies values('title3','genre3','director3','2003')";
		String query2="update movies set director='director4' where title='title3'";
		String query3="delete from movies where title='title3'";
		Connection con=null;
		
			try {
				Class.forName(driverName);
				con=DriverManager.getConnection(url,username,password);
				con.setAutoCommit(false);
				Statement stmt=con.createStatement();
				stmt.executeUpdate(query);
				stmt.executeUpdate(query2);
				stmt.executeUpdate(query3);
				con.commit();
				System.out.println("Successfully Commited...");
			}
			catch(Exception e) {
				con.rollback();
				System.out.println("Rollbacked....");
			}
		
	

	}

}
