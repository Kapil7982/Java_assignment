package question1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 
		        System.out.println("start of main..");
		       
		         try {
		        Scanner sc = new Scanner(System.in);
		        System.out.println("Enter num1");
		        String num = sc.next();
		        int num1=Integer.parseInt(num);
		        System.out.println("Enter num2");
		        int num2 = sc.nextInt();
		        String message = null;

		            int num3 = num1 / num2;
		            if (num3 > 10) 
		            {
		                message = "Welcome to Exception Handling ";
		            }
		            System.out.println("Message is :" + message.toUpperCase());
		        }
		        catch(ArithmeticException ae)
		         {
		            System.out.println("num2 should not be zero");
		        }
		        catch(NullPointerException npe)
		         {
		            System.out.println("String can not be null");
		        }
		        catch (NumberFormatException nfe)
		         {
		            System.out.println("Enter proper integer");
		        }
		        System.out.println("end of main");
		 }
	
		
	}


