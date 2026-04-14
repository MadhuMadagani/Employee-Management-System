package com.example.EmployeeManagementSystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.EmployeeManagementSystem.security.JwtUtil;

@RestController
@RequestMapping("/auth")
public class AuthController {
        @Autowired	
	    private final JwtUtil jwtUtil = new JwtUtil();

	    @PostMapping("/login")
	    public String login(@RequestParam String username) {
	        return jwtUtil.generateToken(username);
	    }
	}


