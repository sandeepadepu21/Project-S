package com.twitter.serviceControllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.twitter.daoControllers.DaoController;
import com.twitter.pojos.User;

@Service
public class ServiceController {
	
	@Autowired
	DaoController dc;
	
	public String registerService(User u) {
		System.out.println("registerService::ServiceController");
		return dc.register(u);		
	}

}
