package com.emp.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.emp.employee.entity.Employee;
import com.emp.employee.repo.EmployeeRepository;

@SpringBootApplication
public class EmployeeApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(EmployeeApplication.class, args);
	}

	@Autowired
	private EmployeeRepository employeeReository;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
//		Employee emp1 = new Employee("Diwakar","Yanamala","diwakar@gmail.com");
//		employeeReository.save(emp1);
//		
//		Employee emp2 = new Employee("Kaveri","Gosala","priya@gmail.com");
//		employeeReository.save(emp2);
//		
//		Employee emp3 = new Employee("ObulaReddy","Yanamala","obi@gmail.com");
//		employeeReository.save(emp3);
		
	}

}
