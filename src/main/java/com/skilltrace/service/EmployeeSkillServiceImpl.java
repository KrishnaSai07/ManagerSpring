package com.skilltrace.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skilltrace.model.EmployeeSkill;
import com.skilltrace.repo.EmployeeSkillRepo;

@Service
public class EmployeeSkillServiceImpl implements EmployeeSkillService {

	@Autowired
	private EmployeeSkillRepo empSkillRepo;
	
	@Override
	public List<EmployeeSkill> getAllEmployeeSkills() {
		// TODO Auto-generated method stub
		return empSkillRepo.findAll();
	}

	@Override
	public List<EmployeeSkill> findAllBySkillName(String skillName) {
		// TODO Auto-generated method stub
		return empSkillRepo.findAllBySkillName(skillName);
	}

}
