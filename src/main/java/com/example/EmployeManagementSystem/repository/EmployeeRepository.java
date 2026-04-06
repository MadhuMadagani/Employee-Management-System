package com.example.EmployeManagementSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.EmployeManagementSystem.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Long>{

}
