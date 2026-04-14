package com.example.EmployeeManagementSystem.service;



import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.example.EmployeeManagementSystem.Dto.EmployeeDTO;


public interface EmployeeService {
	
	Page<EmployeeDTO> getAll(Pageable pageable);
	EmployeeDTO save(EmployeeDTO dto);

}
