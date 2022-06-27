package com.belajar.spring.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false)
	private String name;

	@Column(nullable = false)
	private int age;
	
	@ManyToMany(
			fetch = FetchType.LAZY,
			cascade = CascadeType.MERGE
	)
	@JoinTable(
			name = "students_courses",
			joinColumns = {
					@JoinColumn(name = "student_id", referencedColumnName = "id", nullable=false, updatable=false)
			},
			inverseJoinColumns = {
					@JoinColumn(name = "course_id", referencedColumnName = "id", nullable=false, updatable=false)
			}
	)
	private Set<Course> courses = new HashSet<>();
	
	public Student() {
		
	}
	
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Set<Course> getCourses() {
		return courses;
	}

	public void setCourses(Set<Course> courses) {
		this.courses = courses;
	}
	
	@Override
	public String toString() {
		return "Student{" +
				"id=" + id +
				", courses='" + courses + '\'' +
				'}';
	}
}
