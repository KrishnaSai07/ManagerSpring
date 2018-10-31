package com.skilltrace.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.skilltrace.model.Skill;

@Repository
public interface SkillRepo extends JpaRepository<Skill, Long>{

}
