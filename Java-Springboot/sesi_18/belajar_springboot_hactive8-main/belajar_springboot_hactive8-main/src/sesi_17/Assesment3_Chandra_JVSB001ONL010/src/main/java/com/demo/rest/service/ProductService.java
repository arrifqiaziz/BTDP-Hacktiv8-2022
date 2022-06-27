package com.demo.rest.service;

import java.util.List;
import java.util.Optional;

import com.demo.rest.entity.Product;

public interface ProductService {
	List<Product> findAllProduct(); // menampilkan semua product

	Product findProductByName(String name); // mencari product bedasarkan nama
	// select * from tb_product where nama = ?1
	// select * from tb_product where nama = ?1 and harga = ?2

	Optional<Product> findProductById(Long id);

	Product saveProduct(Product product);

	void deleteProductById(Long id);
}
