package com.emp.employee.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.emp.employee.entity.Employee;
import com.emp.employee.repo.EmployeeRepository;
import com.emp.employee.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	private EmployeeRepository empRepo;
	
	

	public EmployeeServiceImpl(EmployeeRepository empRepo) {
		super();
		this.empRepo = empRepo;
	}



	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return empRepo.findAll();
	}



	@Override
	public Employee saveEmployee(Employee employee) {
		// TODO Auto-generated method stub
		
		return empRepo.save(employee);
	}



	@Override
	public Employee getEmployeeById(Long id) {
		// TODO Auto-generated method stub
		return empRepo.findById(id).get();
	}



	@Override
	public Employee updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return empRepo.save(employee);
	}



	@Override
	public void deleteEmployeeById(Long id) {
		// TODO Auto-generated method stub
		empRepo.deleteById(id);
		
	}

}
