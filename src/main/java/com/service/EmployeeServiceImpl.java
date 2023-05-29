package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.entity.Employee;
import com.repo.EmployeeRepo;

@Component
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepo employeeRepo;

//	public EmployeeServiceImpl(EmployeeRepo employeeRepo) {
//		this.employeeRepo = employeeRepo;
//	}
//
//	public EmployeeServiceImpl() {
//	}

	@Override
	public Employee addEmployee(Employee employee) {
		
		return employeeRepo.save(employee);
	}

	@Override
	public List<Employee> getAllEmployees() {
		
		return employeeRepo.findAll();
	}

}
