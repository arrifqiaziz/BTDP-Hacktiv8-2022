package com.belajar.spring.generator;

import com.belajar.spring.entity.Book;
import com.belajar.spring.entity.BookCategory;
import com.belajar.spring.repository.BookCategoryRepository;
import com.belajar.spring.repository.BookRepository;

public class BookGenerator {

	public void generateBook(BookRepository bookRepository) {
		Book book1 = new Book();
		book1.setTitle("Belajar Spring Boot 1");
		book1.setWriter("Wilson aja");
		book1.setIsbn("IS-909190");

		Book book2 = new Book();
		book2.setTitle("Belajar Spring Boot 2");
		book2.setWriter("Kevin");
		book2.setIsbn("IS-909089");

		Book book3 = new Book();
		book3.setTitle("Belajar Spring Boot 3");
		book3.setWriter("Jackson");
		book3.setIsbn("IS-351089");

		bookRepository.save(book1);
		bookRepository.save(book2);
		bookRepository.save(book3);
	}
	
	public void generateBookCategory(BookCategoryRepository bookCategoryRepository) {
		bookCategoryRepository.save(
			new BookCategory("Programming",
			new Book("Java 1", "Teten N.", "SEI92002"),
			new Book("Java 2", "Teten N.", "UEOEI829"))
		);
	}
}
