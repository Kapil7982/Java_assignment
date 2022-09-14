package question2;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

//import question1.Product;
 


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Queue<Product> product = new PriorityQueue<>(new ProductCompByPrice());
		
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
			int price = sc.nextInt();
			
			
			product.add(new Product(id, name, price));
			
			
			System.out.println("Do you want add more Product....? y/n");
			String btaoo = sc.next();
			if(btaoo.equalsIgnoreCase("n"))
			{
				break;
			}
			
			
			
		}
		System.out.println("Thanku you!!");

		Iterator<Product> itr = product.iterator();
		
//		while(itr.hasNext())
//		{
//			System.out.println(itr.next());
//		}
//		System.out.println("==================================================");
		while(!product.isEmpty())
		{
			System.out.println(product.poll());
		}
}
}
