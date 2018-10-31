package com.skilltrace.service;

import java.util.List;

import com.skilltrace.model.Employee;

public interface EmployeeService {
	
	List<Employee> getAllEmployee();
	public Employee getRequestById(long employeeId);

}
