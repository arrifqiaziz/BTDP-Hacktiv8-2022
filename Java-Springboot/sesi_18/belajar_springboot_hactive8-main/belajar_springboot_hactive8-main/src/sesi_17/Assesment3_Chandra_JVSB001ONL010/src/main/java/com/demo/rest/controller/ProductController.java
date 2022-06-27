package com.demo.rest.controller;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.demo.rest.entity.Product;
import com.demo.rest.repository.ProductRepository;
import com.demo.rest.service.ProductService;

@CrossOrigin(origins = "http://localhost:8081")
@RestController
@RequestMapping("/api/v1")
public class ProductController {

	@Autowired
	private ProductRepository productRepository;

	@Autowired
	private ProductService productService;

	@GetMapping("/product")
	public List<Product> findAllProducts() {
		return productRepository.findAll();
	}

	@PostMapping("/product")
	public Product saveProduct(@RequestBody Product product) {
		return productService.saveProduct(product);
	}

	@GetMapping("/product/id/{id}")
	public ResponseEntity<?> findProductById(@PathVariable Long id) {
		Optional<Product> product = productService.findProductById(id);
		if (product.isEmpty()) {
			return new ResponseEntity<>("ID Produk tidak ditemukan", HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity<>(product, HttpStatus.OK);
	}

	@DeleteMapping("/product")
	public ResponseEntity<?> deleteProduct(@RequestParam Long id) {
		productService.deleteProductById(id);
		return new ResponseEntity<>("Product deleted", HttpStatus.OK);
	}

	@PutMapping("/product")
	public ResponseEntity<?> updateProductById(@RequestBody Product product, @RequestParam Long id) {
		try {
			Optional<Product> checkProduct = productService.findProductById(id);
			if (checkProduct.isEmpty()) {
				return new ResponseEntity<>("ID Data produk tidak sesuai", HttpStatus.BAD_REQUEST);
			}
			product.setId(id);
			productService.saveProduct(product);

			// update from tb_product set name="Acer", hargaBeli=500, hargaJual=501
			// where id=?1
			return new ResponseEntity<>(product, HttpStatus.OK);

		} catch (NoSuchElementException e) {
			return new ResponseEntity<>("Terjadi kesalahan" + e.getMessage(), HttpStatus.OK);
		}
	}

}

