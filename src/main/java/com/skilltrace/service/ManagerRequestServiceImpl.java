package com.skilltrace.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skilltrace.model.ManagerRequest;
import com.skilltrace.repo.ManagerRequestRepo;

@Service
public class ManagerRequestServiceImpl implements ManagerRequestService {

	@Autowired
	private ManagerRequestRepo managerReqRepo;
	
	@Override
	public ManagerRequest addManagerRequest(ManagerRequest managerRequest) {
		// TODO Auto-generated method stub
		return managerReqRepo.save(managerRequest);
	}

}
