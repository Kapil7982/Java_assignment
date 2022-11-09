package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Book;

public interface BooksDao extends JpaRepository<Book, Integer>{

}
