package jdbcpractice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class BatchProcessingDemo {

	public static void main(String[] args) {
		
		String driver="com.mysql.cj.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/demodatabase";
		String username="root";
		String password="root";
		String sql="insert into student values (1,'Asish')";
		String sql2="insert into student values (4,'Asish2')";
		String sql3="insert into student values (5,'Asish3')";
		
		try {
			Class.forName(driver);
			Connection con=DriverManager.getConnection(url,username,password);
			con.setAutoCommit(false);
			Statement stmt=con.createStatement();
			stmt.addBatch(sql);
			stmt.addBatch(sql2);
			stmt.addBatch(sql3);
			stmt.executeBatch();
			con.commit();
			
		}
		catch(Exception e) {
			e.getMessage();
		}
	}

}
