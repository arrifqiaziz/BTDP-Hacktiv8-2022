package com.belajar.spring.latihan;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.belajar.spring.latihan.entity.Address;
import com.belajar.spring.latihan.entity.User;
import com.belajar.spring.latihan.repository.AddressRepository;
import com.belajar.spring.latihan.repository.UserRepository;

@SpringBootApplication
public class Main implements CommandLineRunner {

	Logger logger = Logger.getLogger(Main.class.getName());

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private AddressRepository addressesRepository;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		User user1 = new User("arrifqi@gmail.com", "Arrifqi", "123");
		User user2 = new User("aziz@gmail.com", "Aziz", "123");

		userRepository.save(user1);
		userRepository.save(user2);
		// userRepository.save(user2); ERROR duplicate entries 1 email per user

		Address addr1 = new Address("bogor", "indonesia", "indonesia", "mayor street 123", "12345", user1);
		Address addr2 = new Address("bandung", "indonesia", "indonesia", "minor street 321", "54321", user2);
		// Addresses addr3 = new Addresses("jakarta", "indonesia", "indonesia", "mayor street 123", "66666", user1);

		addressesRepository.save(addr1);
		// addressesRepository.save(addr3); ERROR duplicate entries (same id)
		addressesRepository.save(addr2);

		System.out.println(addr1);
		System.out.println(addr2);
	}

	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);

	}
}
