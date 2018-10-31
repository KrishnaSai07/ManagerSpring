package com.skilltrace.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.skilltrace.model.SkillRequest;

@Repository
public interface SkillRequestRepo extends JpaRepository<SkillRequest, Long> {

}
