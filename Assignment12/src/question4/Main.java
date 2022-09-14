package question4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		Test t = new Test();
		
	    System.out.println("Enter the number:- ");
	    
	    int[] arr = t.display(sc.nextInt());
	    
	    
	    
	    for(int i=2; i<arr.length; i++)
	    {
	    	if(arr[i] !=0)
	    	{
	    		System.out.print(arr[i]+" ");
	    	}
	    }
	}

}
