package com.emp.employee.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.emp.employee.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
