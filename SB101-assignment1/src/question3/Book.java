package question3;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Book {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Set<Library> library=new TreeSet<Library>(new Library());
		int count = 1;

		while (true) {
			System.out.println("Enter Book "+ count++ +" Details :");
			
			System.out.println("BookId");
			int bookId=sc.nextInt();
			System.out.println("Book name");
			String bookName=sc.next();
			System.out.println("Book Author");
			String bAuthor = sc.next();
			Library l=new Library(bookId, bookName, bAuthor);
			library.add(l);
			System.out.println("Do you want to add more books ...? y/n");
			String ans = sc.next();
			if (ans.equalsIgnoreCase("n")) {
				break;
			}
		}
		for(Library i:library) {
			System.out.println("Book Id => "+i.getBookid());
			System.out.println("Book Name => "+i.getBookName());
			System.out.println("Book Author => "+i.getBookAuthor());
			System.out.println("=========================");
		}
	}
}
