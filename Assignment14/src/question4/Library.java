package question4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Library {

	List<Book> bookList = new ArrayList<>();
	
	
	public List<Book> getBookList() {
		return bookList;
	}

	public void setBookList(List<Book> bookList) {
		this.bookList = bookList;
	}
		

	public void addBook(Book book)
	{
		bookList.add(book);
	}
	
	public boolean isEmpty() 
	{
		return bookList.isEmpty();
	}
	
	public List<Book> viewAllBooks()
	{
		return bookList;
	}
	
	public  List<Book> viewBooksByAuthor(String author )
	{
		 ArrayList<Book> result=new ArrayList<Book>();
		 Iterator iter=bookList.iterator();
		  while(iter.hasNext())
	         {
	             Book b=(Book)iter.next();
	             if(b.getAuthor().equalsIgnoreCase(author))
	             result.add(b);
	         }
	         return result;
		 
	}
	
	
	int countNoOfBook(String bookName)
	{
		int count=0;
        Iterator iter=bookList.iterator();
        while(iter.hasNext())
        {
            Book b=(Book)iter.next();
            if(b.getBookName().equalsIgnoreCase(bookName))
            count++;
        }
        return count;
    }
	
}
