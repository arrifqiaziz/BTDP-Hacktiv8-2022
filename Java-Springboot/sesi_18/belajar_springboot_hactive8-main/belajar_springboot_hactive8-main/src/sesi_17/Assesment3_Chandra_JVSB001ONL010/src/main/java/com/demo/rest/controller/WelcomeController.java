package com.demo.rest.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {
	private String message = "Guest";
	private List<String> tasks = Arrays.asList(
			"http://localhost:8081/api/v1/product" + " (GET) get all product",
			"http://localhost:8081/api/v1/product" + " (POST) add new product",
			"http://localhost:8081/api/v1/product/id/5" + " (GET) get product by id",
			"http://localhost:8081/api/v1/product?id=5" + " (PUT) update product",
			"http://localhost:8081/api/v1/product?id=5" + " (DELETE) delete product"
	);

	@RequestMapping("/")
	public String main(Model model) {
		model.addAttribute("message", message);
		model.addAttribute("tasks", tasks);
		return "index";
	}
}
