package com.belajar.spring.latihan.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.belajar.spring.latihan.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
