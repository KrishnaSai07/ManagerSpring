package com.skilltrace.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skilltrace.model.CourseEmployee;
import com.skilltrace.repo.CourseEmployeeRepo;

@Service
public class CourseEmployeeServiceImpl implements CourseEmployeeService {

	@Autowired
	private CourseEmployeeRepo courseEmpRepo;
	
	@Override
	public CourseEmployee addCourseEmployee(CourseEmployee courseEmp) {
		// TODO Auto-generated method stub
		return courseEmpRepo.save(courseEmp);
	}

}
