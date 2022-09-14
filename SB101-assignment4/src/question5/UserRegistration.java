package question5;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {
	
	public void registerUser(String username,String userCountry)throws InvalidCountryException 
	{
	
		if(userCountry.equalsIgnoreCase("India"))
		{
			System.out.println("User registration done successfully");
		}
		else
		 {
			InvalidCountryException e=new InvalidCountryException("User Outside India cannot be registered");
			throw e;
		 }
}
		public static void main(String[] args) {
			
			Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter Your Name : ");
			
			String name=sc.next();
			
			System.out.println("Enter Your Country : ");
			
			String country=sc.next();
			
			UserRegistration us=new UserRegistration ();
			try {
				us.registerUser(name, country);
			} 
			catch (InvalidCountryException e) 
			{
				System.out.println(e.getMessage());
			}
			
			System.out.println("Thank you!");
		}
			
	

}
