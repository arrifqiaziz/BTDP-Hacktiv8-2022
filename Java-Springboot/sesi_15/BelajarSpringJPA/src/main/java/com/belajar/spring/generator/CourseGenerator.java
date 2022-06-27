package com.belajar.spring.generator;

import java.util.Arrays;
import java.util.List;

import com.belajar.spring.entity.Course;
import com.belajar.spring.repository.CourseRepository;
import com.belajar.spring.repository.StudentRepository;

public class CourseGenerator {

	public List<Course> generateCourse(CourseRepository courseRepository, StudentRepository studentRepository) {
		Course course1 = new Course("Beggining Spring Boot", 12, 1500);
		Course course2 = new Course("Spring Reactive", 8, 800);
		Course course3 = new Course("Microservices Architecture", 9, 100);

		return courseRepository.saveAll(Arrays.asList(course1, course2, course3));

	}
}
