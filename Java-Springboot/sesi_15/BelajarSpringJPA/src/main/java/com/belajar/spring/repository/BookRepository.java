package com.belajar.spring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.belajar.spring.entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

	List<Book> findAllByWriter(String writer);

	List<Book> findByIsbn(String isbn);

	List<Book> findByTitle(String title);

	@Query(
			nativeQuery = true,
			value = "select * from book"
	)
	List<Book> findAllQueryNative();
	
	@Query(
			nativeQuery = true,
			value = "select * from book where writer = ?"
	)
	List<Book> findAllByWriterQueryNative(String writer);

}
