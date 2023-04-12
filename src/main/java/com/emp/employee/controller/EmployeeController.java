package com.emp.employee.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.emp.employee.service.EmployeeService;
import com.emp.employee.entity.Employee;

@Controller
public class EmployeeController {

	private EmployeeService employeeService;

	public EmployeeController(EmployeeService employeeService) {
		super();
		this.employeeService = employeeService;
	}
	
	@GetMapping("/employees")
	public String listEmployee(Model model) {
		model.addAttribute("employees",employeeService.getAllEmployees());
		return "employees";
	}
	
	@GetMapping("/employees/new")
	public String CreateEmployee(Model model) {
		Employee employee=new Employee();
		model.addAttribute("employee", employee);
		return "create_employee";
	}
	
	@PostMapping("/employees")
	public String saveEmployee(@ModelAttribute("employee")Employee employee) {
		employeeService.saveEmployee(employee);
		return "redirect:/employees";
	}
	
	@GetMapping("/employees/update/{id}")
	public String updateEmployeeForm(@PathVariable Long id,Model model) {
	model.addAttribute("employee", employeeService.getEmployeeById(id))	;
	return "update_employee";
	}
	
	@PostMapping("employees/{id}")
	public String editEmployee(@PathVariable Long id, @ModelAttribute("employee") Employee employee,Model model) {
		Employee existEmployee = employeeService.getEmployeeById(id);
		existEmployee.setId(id);
		existEmployee.setFirstName(employee.getFirstName());
		existEmployee.setLastName(employee.getLastName());
		existEmployee.setEmail(employee.getEmail());
		
		employeeService.updateEmployee(existEmployee);
		return "redirect:/employees";
	}
	
	@GetMapping("employees/{id}")
	public String deleteEmployeeById(@PathVariable Long id) {
		employeeService.deleteEmployeeById(id);
		return "redirect:/employees";
	}
}
