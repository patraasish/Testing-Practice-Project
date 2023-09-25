package jdbcpractice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Savepoint;
import java.sql.Statement;

public class TransactionDemo {

	public static void main(String[] args) throws SQLException {
		
		String driver="com.mysql.cj.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/demodatabase";
		String username="root";
		String password="root";
		String sql="insert into student values (3,'Mona')";
		String sql2="insert into student values (4,'Mona2')";
		String sql3="insert into student3 values (5,'Mona3')";
		Connection con=null;
		Savepoint sv=null;
		try {
			Class.forName(driver);
			con=DriverManager.getConnection(url,username,password);
			con.setAutoCommit(false);
			Statement stmt=con.createStatement();
			stmt.executeUpdate(sql);
			sv=con.setSavepoint();
			System.out.println("execute 1");
			stmt.executeUpdate(sql2);
			System.out.println("execute 2");
			stmt.executeUpdate(sql3);
			System.out.println("execute 3");
			con.commit();
		}
		
		catch(Exception e) {
			e.getMessage();
			con.rollback(sv);
			System.out.println("rollbacked....");
		}

	}

}
