package question1;

import java.util.ArrayList;
import java.util.List;

public class Library {

	List<Book> bookList = new ArrayList<>();
	private Book[] books;
	
	void addBook(Book book)throws BookException{
		
		bookList.add(book);
		if(bookList.contains(book))
		{
			BookException b = new BookException("Duplicate book!");
			throw b;
		}
		System.out.println("Book added successfully");
	}
	
	List<Book> viewAllBooks()throws BookException{
		
		return bookList;
	}
	
	boolean isEmpty() {
        if(bookList.isEmpty())
		return true;
    	else
		return false;
	}
	
	
	int countNoOfBook(String bookName) { 
		  int count=0;
	        for (Book b: bookList){
	            if(b.getBookName().equals(bookName)){
	                count++;
	            }
	        }
	        return count;
	        }
	
	List<Book> viewBooksByAuthor(String author)throws BookException{
		
		List<Book> listOfBooks=new ArrayList<>();
		 if(listOfBooks.isEmpty()) {
			 System.out.println("The list is empty");
		 }
		 else if(!listOfBooks.isEmpty()){
	        for(Book b: bookList){
	            if(b.getAuthor().equals(author)){
	                listOfBooks.add(b);
	            }
	        }
		 }
		return listOfBooks;
	}
	
	Book getBookByISBN(Integer  isbn)throws BookException{
		  
		for(Book book : this.books)
		{
			if(isbn.equals(book.getIsbn()))
			{
				return book;
			}
		}
		throw new BookException();
		
	}
	
	
}
