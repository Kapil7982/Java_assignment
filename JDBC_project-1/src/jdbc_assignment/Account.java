package jdbc_assignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Account {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("problem with loading the driver related main class");
		}
		
		
		String url = "jdbc:mysql://localhost:3306/jdbc_assignment";
		
		
		
		try(Connection  conn=  DriverManager.getConnection(url, "root", "port")) {

			
			
		
		PreparedStatement ps= conn.prepareStatement("select * from employee where deptid=14");
		 	
		ResultSet rs = ps.executeQuery();	
		 
		
		while(rs.next()) {
			
			
			int id= rs.getInt("empid");
			String n= rs.getString("ename");
			String add= rs.getString("address");
			String mob = rs.getString("mobile");
			int deptid = rs.getInt("deptid");
			
			
			
			System.out.println("ID is :"+id);
			System.out.println("Name is :"+n);
			System.out.println("address is :"+add);
			System.out.println("mobile no is :" +mob);
			System.out.println("dept id :" +deptid);
		
			
		}
				 
		}catch(SQLException e) {
			
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}

}
