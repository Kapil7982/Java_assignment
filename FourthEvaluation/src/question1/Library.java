package question1;

import java.util.LinkedHashSet;

public class Library {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedHashSet<Book> booksCollection = new LinkedHashSet<>();
		
		booksCollection.add(new Book(1,"Name1","Author1"));
		booksCollection.add(new Book(2,"Name2","Author1"));
		booksCollection.add(new Book(3,"Name1","Author1"));
		booksCollection.add(new Book(1,"Name4","Author2"));
		
		for(Book book:booksCollection)
		{
			System.out.println(book);
		}	
	}

}
