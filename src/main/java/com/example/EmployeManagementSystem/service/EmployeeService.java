package com.example.EmployeManagementSystem.service;



import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.example.EmployeManagementSystem.Dto.EmployeeDTO;


public interface EmployeeService {
	
	Page<EmployeeDTO> getAll(Pageable pageable);
	EmployeeDTO save(EmployeeDTO dto);

}
