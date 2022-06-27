package com.belajar.spring;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WelcomeController {
	private String message = "Hello from spring web";

	private List<String> tasks = Arrays.asList("a", "b", "c", "d", "e", "f", "g");

	@GetMapping("/")
	public String main(Model model) {
		model.addAttribute("message", message);
		model.addAttribute("tasks", tasks);
		return "welcome";
	}

	@GetMapping("/hello")
	public String mainWithParam(
			@RequestParam(name = "name", required = false, defaultValue = "") 
			String name, Model model) {
		model.addAttribute("message", name);
		return "welcome";
	}

}
