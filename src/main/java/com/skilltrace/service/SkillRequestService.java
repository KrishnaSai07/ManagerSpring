package com.skilltrace.service;

import java.util.List;

import com.skilltrace.model.SkillRequest;

public interface SkillRequestService {
	
	List<SkillRequest> getAllSkillRequests();
	public boolean deleteSkillRequest(long requestId);
	public SkillRequest getRequestById(long requestId);

}
