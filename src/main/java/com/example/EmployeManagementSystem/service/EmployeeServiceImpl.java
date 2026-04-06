package com.example.EmployeManagementSystem.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.example.EmployeManagementSystem.Dto.EmployeeDTO;
import com.example.EmployeManagementSystem.entity.Employee;
import com.example.EmployeManagementSystem.repository.EmployeeRepository;
import com.example.EmployeManagementSystem.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeRepository repo;
	
	private EmployeeDTO map(Employee e) {
		EmployeeDTO d = new EmployeeDTO();
		d.setId(e.getId()); d.setName(e.getName());
		d.setEmail(e.getEmail());
		d.setRole(e.getRole());
		d.setSalary(e.getSalary());
		return d;
	
       }
	private Employee mapE(EmployeeDTO d) {
		Employee e = new Employee();
		e.setName(d.getName());
		e.setRole(d.getRole());
		e.setEmail(d.getEmail());e.setSalary(d.getSalary());
		return e;
	}
	
	public Page<EmployeeDTO> getAll(Pageable pageable) {
		return repo.findAll(pageable).map(this::map);
	}
	
	public EmployeeDTO save(EmployeeDTO d) {
		return map(repo.save(mapE(d)));
	}
       
}
