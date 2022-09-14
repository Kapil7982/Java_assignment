package question1;

import java.util.Scanner;

public class Main {

	
	public static String reversString(String input)
	{
		String r="";  
		for(int i=input.length();i>0;--i)  
		{  
		    r=r+(input.charAt(i-1));   
		}  
		return r;  
		}  	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String to reverse");
		String orignalString = sc.next();
		String result = reversString(orignalString);
		
		System.out.println("Original String is :"+ orignalString);
		
		System.out.println("Reversed String is :"+ result);

	}

}
