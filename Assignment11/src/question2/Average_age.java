package question2;

import java.util.Scanner;

public class Average_age {

	
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
        System.out.println("Enter total no. of employees: ");
        int noOfEmployees = scn.nextInt();
        
        if(noOfEmployees>1)
        {
            double temp = 0.0; 
            int count=0;
            int[] arr = new int[noOfEmployees];
    
            System.out.println("Enter the age for "+noOfEmployees+" employees:");
            for(int i = 0; i<noOfEmployees; i++)
            {
                arr[i]=scn.nextInt();
                temp += arr[i];
            }
           
            if(count!=1)
            {
            	 
                temp = temp/noOfEmployees;
                System.out.println("The average age is "+String.format("%.02f",temp));
            }
           
        }
        else
        {
           System.out.println("Please enter a valid employee count"); 
        }
		
		

    }
}   