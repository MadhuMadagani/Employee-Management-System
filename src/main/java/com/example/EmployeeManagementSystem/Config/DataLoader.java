package com.example.EmployeeManagementSystem.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.boot.CommandLineRunner;

import com.example.EmployeeManagementSystem.entity.Employee;
import com.example.EmployeeManagementSystem.repository.EmployeeRepository;

	@Configuration
	public class DataLoader {

	    @Bean
	    CommandLineRunner loadData(EmployeeRepository repo) {
	        return args -> {
         
	        	System.out.println("🔥 DataLoader Running...");

	        	
	            if (repo.count() == 0) {
    
	                // 🔥 MANUAL DATA 
	                repo.save(new Employee(null,"Madhu","madhu@gmail.com","Developer",30000));
	                repo.save(new Employee(null,"Ravi","ravi@gmail.com","Tester",25000));
	                repo.save(new Employee(null,"Sita","sita@gmail.com","HR",28000));
	                repo.save(new Employee(null,"John","john@gmail.com","Developer",35000));
	                repo.save(new Employee(null,"Anu","anu@gmail.com","Tester",26000));
	                repo.save(new Employee(null, "Raj", "raj@gmail.com", "Devops",24000));
	                repo.save(new Employee(null, "Mukesh" , "mukesh@gmail.com", "Web Developer", 15000));
	                repo.save(new Employee(null, "Naresh", "naresh@gmail.com", "Marketing", 12000));
	                repo.save(new Employee(null, "Mahesh", "mahesh@gmail.com", "Tester", 20000));
	                repo.save(new Employee(null, "Prashanth", "prashanth@gmail.com","SEO",25000));
	                repo.save(new Employee(null, "Santhosh", "santhosh@gmail.com","HR",20000));
	                repo.save(new Employee(null, "Naveen", "naveen@gmail.com", "Developer",22000));
	                repo.save(new Employee(null, "Visva", "visva@gmail.com", "Tester",22000));
	                repo.save(new Employee(null, "Rakesh", "rakesh@gmail.com", "Developer",45000));
	                repo.save(new Employee(null, "Yashwanth", "yashwanth@gmail.com", "Developer",22000));
	                repo.save(new Employee(null, "Ganesh", "ganesh@gmail.com", "HR",18000));
	                repo.save(new Employee(null, "Karthik", "karthik@gmail.com","Tester",32000));
	                repo.save(new Employee(null, "Pasha", "pasha@gmail.com", "Developer", 28000));
	                repo.save(new Employee(null, "Sharukh" , "sharukh@gmil.com", "HR",19000));
	                repo.save(new Employee(null, "Sai", "sai@gmail.com", "Tester", 27000));
	                repo.deleteAll();   
	        }
	        };
	    }
	}

