package question4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s1=new Scanner(System.in);
		
		System.out.println("Enter the two numbers:- ");
		
        System.out.println("Enter the first number");
        
        int num1=s1.nextInt();
        
        System.out.println("Enter the second number");
        
        int  num2=s1.nextInt();
        
        try{
            System.out.println(Math.floor(num1/num2));
        }
        catch (ArithmeticException ae)
        {
            System.out.println(ae.getMessage());
        }
        finally 
        {
            System.out.println("inside finaly block");
        }
	}

}
