package com.example.EmployeeManagementSystem.controller;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("dev")
public class Develop {
	public Develop() {
		
		System.out.println("Develop dev is connected");
		}
	

}
