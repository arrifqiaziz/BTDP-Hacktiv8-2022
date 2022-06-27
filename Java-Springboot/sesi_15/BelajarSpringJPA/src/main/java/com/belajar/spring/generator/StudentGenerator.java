package com.belajar.spring.generator;

import java.util.List;
import java.util.Set;

import com.belajar.spring.entity.Course;
import com.belajar.spring.entity.Student;
import com.belajar.spring.repository.StudentRepository;

public class StudentGenerator {
	
	StudentRepository studentRepository;
	
	public StudentGenerator(StudentRepository studentRepository) {
		this.studentRepository = studentRepository;
	}
	
	public Set<Course> addStudentCourse(List<Course> course) {

		Student student = new Student("Arrifqi", 19);
		student.getCourses().addAll(course);
		studentRepository.save(student);
		return student.getCourses();
	}
}
