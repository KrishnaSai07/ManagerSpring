package com.skilltrace.service;

import java.util.List;

import com.skilltrace.model.EmployeeSkill;

public interface EmployeeSkillService {
	
	List<EmployeeSkill> getAllEmployeeSkills();
	List<EmployeeSkill> findAllBySkillName(String skillName);

}
