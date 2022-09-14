package question4;

import java.util.Scanner;

public class CheckTheString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter a String =>");
	   String str = sc.next();
	   
	   
	   System.out.println("Enter a Position =>");
	   int pos = sc.nextInt();
	   
	   char[] ch = new char[str.length()];
	   
	   for(int i=0; i<str.length(); i++)
	   {
		   ch[i] = str.charAt(i);
	   }
		   
	   for(int i=0; i<ch.length; i++)
	   {
		   if((i)==pos)
		   {
			   System.out.println(ch[i]);
			   break;
		   }
		   else if(pos>ch.length)
		   {
			   System.out.println("Invalid position, Please enter a valid position =>");
			   break;
		   }
	   }
	   sc.close();
	}

}
