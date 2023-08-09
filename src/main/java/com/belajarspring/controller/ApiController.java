package com.belajarspring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

	/*
	 *URL : http://localhost:8080/api/v1/employee/123 
	 */
	
	@GetMapping("/api/v1/employee/{id}")
	public String coba(@PathVariable String id) {
		return "Employee "+id;
	}
	
	/*
	 * URL : http://localhost:8080/api/v1/employee?id=456
	 */
	
	@GetMapping("/api/v1/employee")
	public String coba2(@RequestParam String id) {
		return "Employee "+id;
	}
}