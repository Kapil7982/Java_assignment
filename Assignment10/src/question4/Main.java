package question4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		
		int n = sc.nextInt();
		
		if(n>=1 && n<=10)
		{
			Parent p = new Child(n);
			p.method1();
			p.method2();
			p.method3();
			
			Child c = (Child)p;
			c.method4();
		}
		
		else
		{
			System.out.println("Invalid Number");
		}
	}

}
