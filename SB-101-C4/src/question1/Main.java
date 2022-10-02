package question1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Student roll no :- ");
		int sroll = sc.nextInt();
		
		System.out.println("Enter Student name:- ");
		String sname = sc.next();
		
		System.out.println("Enter Student address:- ");
		String saddress = sc.next();
		
		System.out.println("Enter Student mobile no :- ");
		String smobile = sc.next();
		
		
try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		
		String url = "jdbc:mysql://localhost:3306/evaluation";
		
		try(Connection con = DriverManager.getConnection(url, "root", "port")) {
			
			PreparedStatement ps = con.prepareStatement("insert into student values(?,?,?,?)");
			
			ps.setInt(1, sroll);
			ps.setString(2, sname);
			ps.setString(3, saddress);
			ps.setString(4, smobile);
			
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
	
