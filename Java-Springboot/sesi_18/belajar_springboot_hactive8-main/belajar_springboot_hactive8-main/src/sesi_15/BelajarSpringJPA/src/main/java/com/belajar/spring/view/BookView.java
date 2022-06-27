package com.belajar.spring.view;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.belajar.spring.Main;
import com.belajar.spring.entity.Book;
import com.belajar.spring.entity.BookCategory;
import com.belajar.spring.repository.BookCategoryRepository;
import com.belajar.spring.repository.BookRepository;

public class BookView {

	static Logger logger = Logger.getLogger(Main.class.getName());

	public static void viewBook(BookRepository bookRepository) {
		final String title = "Belajar Spring Boot 1";
		List<Book> byTitle = bookRepository.findByTitle(title);
		logger.log(Level.INFO, "Title : " + byTitle);

		List<Book> books = bookRepository.findAll();
		logger.log(Level.INFO, "Books : " + books);

		final String writer = "Wilson aja";
		List<Book> byWriter = bookRepository.findAllByWriter(writer);
		logger.log(Level.INFO, "Writer : " + byWriter);

		final String isbn = "IS-909089";
		List<Book> byIsbn = bookRepository.findByIsbn(isbn);
		logger.log(Level.INFO, "ISBN : " + byIsbn);

		List<Book> nativeBooksQuery = bookRepository.findAllQueryNative();
		logger.log(Level.INFO, "Book by native query : " + nativeBooksQuery);

		final String nativeWriter = "Kevin";
		List<Book> byNativeWriter = bookRepository.findAllByWriterQueryNative(nativeWriter);
		logger.log(Level.INFO, "Writer by native query : " + byNativeWriter);
	}

	public static List<BookCategory> viewBookCategory(BookCategoryRepository bookCategoryRepository) {
		return bookCategoryRepository.findAll();
	}
}
