package com.belajar.spring.repository;

import com.belajar.spring.model.Book;

//import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long>{
//	List<Book> findAll();
}
