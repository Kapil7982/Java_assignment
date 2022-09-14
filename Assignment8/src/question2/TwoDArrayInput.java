package question2;

import java.util.Scanner;

public class TwoDArrayInput {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int m, n, i, j;   
		Scanner sc=new Scanner(System.in);   
		System.out.print("Enter the number of rows: ");   
		  
		m = sc.nextInt();   
		System.out.print("Enter the number of columns: ");   
		 
		n = sc.nextInt();   
		 
		int array[][] = new int[m][n];   
		 
		System.out.println("Enter the elements of the array: ");   
		 
		for (i = 0; i < m; i++)   
		 
		for (j = 0; j < n; j++)   
		array[i][j] = sc.nextInt();   
		   
		System.out.println("Elements of the array are: ");   
		for (i = 0; i < m; i++)   
		{   
		for (j = 0; j < n; j++)   
		  
		System.out.print(array[i][j] + " ");   
		 
		System.out.println();   
		} 
		
		System.out.println("------------------------------Answer-------------------------------");
		 
	
	for( i=0; i<m; i++)
	{
		int sum=0;
		for( j=0; j<n; j++)
		{
			if(array[j][i]%2==0)
			{
				sum+= array[j][i];
			}
		}
		System.out.print(sum);
		System.out.println();
	}
	
	}
}


