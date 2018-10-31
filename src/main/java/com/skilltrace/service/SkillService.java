package com.skilltrace.service;

import java.util.List;

import com.skilltrace.model.Skill;

public interface SkillService {
	
	List<Skill> getAllSkills();
	public Skill addSkill(Skill skill);
	public boolean deleteSkill(Skill skill);
	

}
