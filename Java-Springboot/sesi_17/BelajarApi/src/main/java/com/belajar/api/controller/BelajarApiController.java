package com.belajar.api.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/belajar-api/v1")
public class BelajarApiController {
	
	@GetMapping(value = "/get")
	public String belajarApi() {
		return "Mari Belajar API Java Spring Boot";
	}

}