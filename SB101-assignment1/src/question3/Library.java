package question3;

import java.util.Comparator;

public class Library implements Comparator<Library> {

	private int bookid;
	private String bookName;
	private String bookAuthor;
	
	public int getBookid() {
		return bookid;
	}
	public void setBookid(int bookid) {
		this.bookid = bookid;
	}
	
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	
	public String getBookAuthor() {
		return bookAuthor;
	}
	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}
	
	public Library(int bookid, String bookName, String bookAuthor) {
		super();
		this.bookid = bookid;
		this.bookName = bookName;
		this.bookAuthor = bookAuthor;
	}
	
	public Library() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public int compare(Library o1, Library o2) {
		if(o1.getBookid()>o2.getBookid())
			return 1;
		else if(o1.getBookid()<o2.getBookid())
			return -1;
		else
			return 0;
	}	
}
