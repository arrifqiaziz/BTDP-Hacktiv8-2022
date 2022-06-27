package com.belajar.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.belajar.spring.entity.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {

}
