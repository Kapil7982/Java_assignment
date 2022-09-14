package question4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		Library l = new Library();
		
		int i, choice;
		
		for(i=0; i<50; i++)
		{
			
			System.out.println("1. Add Book");
			System.out.println("2. Display all book details");
			System.out.println("3.Search Book by author");
			System.out.println("4.Count number of books - by book name");
			System.out.println("5.Exit");
			
			System.out.println("Enter your choice:");
			choice = sc.nextInt();
			sc.nextLine();
			
			
			if(choice==1)
			{
				Book b = new Book();
				System.out.println("Enter the isbn no:");
				b.setIsbn(sc.nextInt());
				sc.nextLine();
				
				System.out.println("Enter the book name:");
				b.setBookName(sc.nextLine());
				
				
				System.out.println("Enter the author name:");
				b.setAuthor(sc.nextLine());
				l.addBook(b);
				System.out.println("Book added successfully");
			}
			
			if(choice==2)
			{
				 List<Book> result=l.viewAllBooks();
                 if(result.isEmpty())
                 {
                     System.out.println("The list is empty");
                     continue;
                 }
                 Iterator iter=result.iterator();
                 while(iter.hasNext())
                 {
                     Book b=(Book)iter.next();
                     System.out.println("Isbn No: "+b.getIsbn());
                     System.out.println("Book name:"+b.getBookName());
                     System.out.println("Author name: "+b.getAuthor());
                 }
			}
			
			if(choice ==3)
			{
				System.out.println("Enter the author name:");
				
				String name = sc.nextLine();
			    ArrayList<Book> result=(ArrayList<Book>) l.viewBooksByAuthor(name);
			    if(result.isEmpty())
			    {
			    	System.out.println("None of the book published by the author "+name);
			    	continue;
			    }
			    Iterator iter = result.iterator();
			    while(iter.hasNext())
			    {
			    	Book b =  (Book)iter.next();
			    	System.out.println("ISBN no: "+b.getIsbn());
			    	System.out.println("Book name: "+b.getBookName());
			        System.out.println("Author name: "+b.getAuthor());
			    	
			    }
				
			}
			
			if(choice ==4)
			{
				 System.out.println("Enter the book name");
                 String name=sc.nextLine();
                 System.out.println("Count is "+l.countNoOfBook(name));
			}
			
			if(choice ==5)
			{
				
				System.out.println("Thank You..!!");
			}
		}
	}

}
