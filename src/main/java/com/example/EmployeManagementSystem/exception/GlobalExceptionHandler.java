package com.example.EmployeManagementSystem.exception;


import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {
   
	@ExceptionHandler(Exception.class)
	public String handle() {
		return "Error Occured";
	}
	
}
