package com.skilltrace.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skilltrace.model.Skill;
import com.skilltrace.repo.SkillRepo;

@Service
public class SkillServiceImpl implements SkillService {

	@Autowired 
	private SkillRepo skillRepo;
	
	@Override
	public List<Skill> getAllSkills() {
		// TODO Auto-generated method stub
		return skillRepo.findAll();
	}

	@Override
	public Skill addSkill(Skill skill) {
		// TODO Auto-generated method stub
		return skillRepo.save(skill);
	}

	@Override
	public boolean deleteSkill(Skill skill) {
		// TODO Auto-generated method stub
		boolean isDeleted=false;
		if(skillRepo.existsById(skill.getSkillId()))
		{
			skillRepo.deleteById(skill.getSkillId());
			isDeleted=true;
		}
		return isDeleted;
	}

}
