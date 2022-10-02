package jdbc_assignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Department ID :- ");
		int id = sc.nextInt();
		
		System.out.println("Enter the Department name :- ");
		String dname = sc.next();
		
		System.out.println("Enter the Location :- ");
        String location = sc.next();
        
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		
		String url = "jdbc:mysql://localhost:3306/jdbc_assignment";
		
		try(Connection con = DriverManager.getConnection(url, "root", "port")) {
			
			PreparedStatement ps = con.prepareStatement("insert into department values(?,?,?)");
			
			ps.setInt(1, id);
			ps.setString(2, dname);
			ps.setString(3, location);
			
			int dep = ps.executeUpdate();
			
			if(dep > 0)
				System.out.println("Record inserted sucessfully");
			else
				System.out.println("Not inserted");
			
			
			
			
			
		} catch (SQLException e) {
			
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}

}
