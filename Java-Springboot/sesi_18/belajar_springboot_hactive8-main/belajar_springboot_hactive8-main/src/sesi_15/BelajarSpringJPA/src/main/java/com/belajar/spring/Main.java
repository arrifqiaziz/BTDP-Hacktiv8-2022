package com.belajar.spring;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.belajar.spring.entity.Course;
import com.belajar.spring.generator.BookGenerator;
import com.belajar.spring.generator.CourseGenerator;
import com.belajar.spring.generator.StudentGenerator;
import com.belajar.spring.repository.BookCategoryRepository;
import com.belajar.spring.repository.BookRepository;
import com.belajar.spring.repository.CourseRepository;
import com.belajar.spring.repository.StudentRepository;
import com.belajar.spring.view.BookView;

@SpringBootApplication
public class Main implements CommandLineRunner {

	Logger logger = Logger.getLogger(Main.class.getName());

	@Autowired
	private BookRepository bookRepository;

	@Autowired
	private StudentRepository studentRepository;

	@Autowired
	private CourseRepository courseRepository;

	@Autowired
	private BookCategoryRepository bookCategoryRepository;

	@Override
	public void run(String... args) throws Exception {
		BookGenerator bookGenerator = new BookGenerator();
		bookGenerator.generateBook(bookRepository);
		bookGenerator.generateBookCategory(bookCategoryRepository);

		CourseGenerator courseGenerator = new CourseGenerator();
		List<Course> course = courseGenerator.generateCourse(courseRepository, studentRepository);

		StudentGenerator studentGenerator = new StudentGenerator(studentRepository);

		BookView.viewBook(bookRepository);
		logger.log(Level.INFO, "List of course : " + course);
		logger.log(Level.INFO, "Student course : " + studentGenerator.addStudentCourse(course));
	}

	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);
	}

}
