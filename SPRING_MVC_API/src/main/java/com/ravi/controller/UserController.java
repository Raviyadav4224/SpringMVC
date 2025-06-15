package com.ravi.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UserController {

	@GetMapping("/users")
	public String getUsers() {

		return "Server is running successfully";
	}

	@GetMapping("/products")
	public List<String> getProducts() {

		return List.of("Shoes", "Bedsheets");
	}
}
