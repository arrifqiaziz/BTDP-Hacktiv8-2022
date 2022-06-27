package com.demo.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.rest.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	Product findProductByName(String name);

	Product findProductById(Long id);

}
