	package com.example.EmployeeManagementSystem.controller;

	import java.util.Map;
	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.RestController;

	@RestController
	public class HomeController {

	    @GetMapping("/")
	    public Map<String,String> home() {
	        return Map.of(
	            "project","Employee Management System",
	            "status","LIVE",
	            "message","Application running successfully",
	            "employees","/api/employees?page=0&size=20"
	        );
	    }
	}

