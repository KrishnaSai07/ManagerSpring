package com.skilltrace.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skilltrace.model.SkillRequest;
import com.skilltrace.repo.SkillRequestRepo;

@Service
public class SkillRequestServiceImpl implements SkillRequestService {

	@Autowired
	private SkillRequestRepo skillRequests;
	
	@Override
	public List<SkillRequest> getAllSkillRequests() {
		// TODO Auto-generated method stub
		return skillRequests.findAll();
	}

	@Override
	public boolean deleteSkillRequest(long requestId) {
		// TODO Auto-generated method stub
		boolean isDeleted=false;
		if(skillRequests.existsById(requestId))
		{
			skillRequests.deleteById(requestId);
			isDeleted=true;
		}
		return isDeleted;
	}

	@Override
	public SkillRequest getRequestById(long requestId) {
		// TODO Auto-generated method stub
		SkillRequest skillRequest=null;
		Optional<SkillRequest> optNominees=skillRequests.findById(requestId);
		if(optNominees.isPresent())
		{
			skillRequest=optNominees.get();
		}
		
		return skillRequest;
	}

}
