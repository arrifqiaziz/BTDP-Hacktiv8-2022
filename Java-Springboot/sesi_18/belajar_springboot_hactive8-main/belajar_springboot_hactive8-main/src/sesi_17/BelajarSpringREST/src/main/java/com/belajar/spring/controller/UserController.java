package com.belajar.spring.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.belajar.spring.entity.User;
import com.belajar.spring.service.UserService;

@RestController
@RequestMapping("/api/v1")
public class UserController {

	@Autowired
	UserService userService;

	@GetMapping("/users")
	public List<User> getAllUser() {
		return userService.listAllUser();
	}

	@GetMapping("/users/id/{id}")
	public ResponseEntity<?> getUser(@PathVariable Long id) {
		try {
			Optional<User> user = userService.getUser(id);
			if (user.isEmpty()) {
				return new ResponseEntity<>(user, HttpStatus.NOT_FOUND);
			}
			return new ResponseEntity<>(user, HttpStatus.OK);

		} catch (Exception e) {
			return new ResponseEntity<User>(HttpStatus.NOT_FOUND);
		}
	}

	@PostMapping("/users")
	public User addUser(@RequestBody User user) {
		return userService.saveUser(user);
	}

	@PutMapping("/users")
	public ResponseEntity<?> updateUser(@RequestBody User user, @RequestParam Long id) {
		try {
			Optional<User> existUser = userService.getUser(id);
			if (existUser.isEmpty()) {
				return new ResponseEntity<>("User tidak ditemukan", HttpStatus.NOT_FOUND);
			}
			user.setId(id);
			userService.saveUser(user);
			return new ResponseEntity<>(user, HttpStatus.OK);

		} catch (Exception e) {
			return new ResponseEntity<>("Terjadi kesalahan" + e.getMessage(), HttpStatus.NOT_FOUND);
		}
	}

	@DeleteMapping("/users")
	public ResponseEntity<?> deleteUser(@RequestParam Long id) {
		userService.deleteUser(id);
		return new ResponseEntity<>("Product deleted", HttpStatus.OK);
	}
}
