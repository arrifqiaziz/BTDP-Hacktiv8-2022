package com.belajar.spring.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.belajar.spring.entity.User;
import com.belajar.spring.repository.UserRepository;

@Service
@Transactional
public class UserService {

	@Autowired
	private UserRepository userRepository;

	public List<User> listAllUser() {
		return userRepository.findAll();
	}

	public User saveUser(User user) {
		return userRepository.save(user);
	}

	public Optional<User> getUser(Long id) {
		return userRepository.findById(id);
	}

	public void deleteUser(Long id) {
		userRepository.deleteById(id);
	}
}
