package com.skilltrace.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skilltrace.model.Employee;
import com.skilltrace.model.SkillRequest;
import com.skilltrace.repo.EmployeeRepo;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepo employeeRepo;
	
	@Override
	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		return employeeRepo.findAll();
	}
	
	@Override
	public Employee getRequestById(long employeeId) {
		// TODO Auto-generated method stub
		Employee employee=null;
		Optional<Employee> optNominees=employeeRepo.findById(employeeId);
		if(optNominees.isPresent())
		{
			employee=optNominees.get();
		}
		
		return employee;
	}

}
