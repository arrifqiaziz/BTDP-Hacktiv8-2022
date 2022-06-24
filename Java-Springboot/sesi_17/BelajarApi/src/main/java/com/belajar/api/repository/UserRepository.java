package com.belajar.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.belajar.api.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	
}