package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.exception.BooknotFoundException;
import com.example.demo.model.Book;
import com.example.demo.repo.BooksDao;

@RestController
public class MyController {

	@Autowired
	private BooksDao bdao;
	
	
	@PostMapping("/book")
	public Book createbook(@RequestBody Book b) {
		
		 return bdao.save(b);
		
	}
	@GetMapping("/book")
	
	public List<Book> getallbooks() throws BooknotFoundException{
		
		if(bdao.findAll().size()>0) {
			
			return bdao.findAll();
		}
		else
			throw new BooknotFoundException("No books available");
	}
	
	@GetMapping("/book/{id}")
	public Book bookbyid(@PathVariable Integer id) throws BooknotFoundException {
		
		if(bdao.findById(id).get() != null)
			return bdao.findById(id).get();
			
		
			else
				throw new BooknotFoundException("No books available");
		
	}
	
	@PutMapping("/book")
	public Book updatebook(@RequestBody Book b) throws BooknotFoundException {
		
		if(bdao.findById(b.getBookId())!=null) {
			return bdao.save(b);
		}
		else
			throw new BooknotFoundException("Not book available");
		
	}
	
	@DeleteMapping("/book/{id}")
	public Book Deletebook(@PathVariable Integer id) throws BooknotFoundException {
		
		  Optional<Book> opt=bdao.findById(id);
		  if(opt.isPresent()) {
			  Book pr=opt.get();
			 bdao.delete(pr);
			 return pr;
		  }
			  
		
			else 
				throw new BooknotFoundException("Not book available");
	}
}
