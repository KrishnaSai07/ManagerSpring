package com.skilltrace.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.skilltrace.model.Employee;

public interface EmployeeRepo extends JpaRepository<Employee,Long> {

}
