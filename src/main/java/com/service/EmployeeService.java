package com.service;

import java.util.List;

import com.entity.Employee;

public interface EmployeeService {
	
	Employee addEmployee(Employee employee);
	
	List<Employee> getAllEmployees();

}
