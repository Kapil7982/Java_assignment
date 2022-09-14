package question2;

import java.util.Scanner;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet<Employee> t1 = new TreeSet<>(new SortingBySalary());
		
		Scanner sc = new Scanner(System.in);
		
		int count=1, value=1;
		
		while(count<=4)
		{
			count++;
			System.out.println("Enter the Details of Employee:- "+ value++);
			
			
			System.out.println("Enter the Employee Name:- ");
			String name = sc.next();
			
			System.out.println("Enter the Employee ID:- ");
			int id = sc.nextInt();
			
			System.out.println("Enter the Employee Salary:- ");
			double salary = sc.nextDouble();
			
			t1.add(new Employee(id,name, salary));
			
			
		}
		
		System.out.println(t1);
	}

}
