package jdbc_assignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Delete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the id to delete :");
		int roll= sc.nextInt();
		
		
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("problem with loading the driver");
		}
		
		
		String url = "jdbc:mysql://localhost:3306/jdbc_assignment";
		
		
		
		try(Connection  conn=  DriverManager.getConnection(url, "root", "port")) {

			
			
		
		PreparedStatement ps= conn.prepareStatement("delete from department where did = ?");
		 	
		ps.setInt(1, roll);	
		
		int x= ps.executeUpdate();	
		 
		if(x > 0)
			System.out.println(x+ " Record deleted Sucessfully");
		else
			System.out.println("Record does not exist.");
		 
		 
		}catch(SQLException e) {
			
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}

}
