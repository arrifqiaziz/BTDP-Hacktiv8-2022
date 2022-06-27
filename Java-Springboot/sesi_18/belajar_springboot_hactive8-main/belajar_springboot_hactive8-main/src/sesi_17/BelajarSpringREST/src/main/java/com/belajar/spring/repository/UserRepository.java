package com.belajar.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.belajar.spring.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
