package question1;

import java.util.Scanner;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet<Product> t1 = new TreeSet<>(new SortingById());
		TreeSet<Product> t2 = new TreeSet<>(new SortingByName());
		TreeSet<Product> t3 = new TreeSet<>(new SortingByPrice());
		
		Scanner sc = new Scanner(System.in);
		int count=1;
		
		while(true)
		{
			System.out.println("Enter the Product Detatis:- "+count++);
			
			System.out.println("Enter the Product ID:- ");
			int id = sc.nextInt();
			
			
			System.out.println("Enter the Product Name:- ");
			String name = sc.next();
			
			System.out.println("Enter the Product Price:- ");
			double price = sc.nextDouble();
			
			
			t1.add(new Product(id, name, price));
			t2.add(new Product(id, name, price));
			t3.add(new Product(id, name, price));
			
			
			System.out.println("Do you want add more Product....? y/n");
			String btaoo = sc.next();
			if(btaoo.equalsIgnoreCase("n"))
			{
				break;
			}
			
			
			
		}
		
		while(true)
		{
			System.out.println("Select your choice for sotring Products:- ");
			
			System.out.println("1 for sorting the product by its ID:- ");
			System.out.println("2 for sorting the product by its Name:- ");
			System.out.println("3 for sorting the product by its Price:- ");
			
			String choice = sc.next();
			if(choice.equals("1"))
			{
				System.out.println(t1);
			}
			else if(choice.equals("2"))
			{
				System.out.println(t2);
			}
			else if(choice.equals("3"))
			{
				System.out.println(t3);
			}
			else
				System.out.println(t1);
			
			
			System.out.println("Do you want to sort for more Products....? y/n");
			String btaoo = sc.next();
			if(btaoo.equalsIgnoreCase("n"))
			{
				break;
			}
		}
		
		System.out.println("Thanku you!!");
	}

}
