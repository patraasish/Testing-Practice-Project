package jdbcpractice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class PreparedStatementDemo {

	public static void main(String[] args) {
		
		//PreparedStatement extends Statement Interface
		//It is used for perform dynamic query that means query takes arguments dynamically
		//All parameter represents by "?" symbol which is known as parameter maker
		
		String driverName="com.mysql.cj.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/demodatabase";
		String username="root";
		String password="root";
		String query="insert into student values(?,?)";
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter student id :");
		int s_id=sc.nextInt();
		System.out.println("Enter Student name :");
		String s_name=sc.next();
	
		
		
		try {
			Class.forName(driverName);
			Connection con=DriverManager.getConnection(url,username,password);
			System.out.println("connected");
			PreparedStatement pstmt=con.prepareStatement(query);
			pstmt.setInt(1, s_id);
			pstmt.setString(2,s_name);
			pstmt.executeUpdate();
			System.out.println("executed...");
			
		}
		
		catch(Exception e) {
			e.getMessage();
		}
		
		sc.close();
		

	}

}
