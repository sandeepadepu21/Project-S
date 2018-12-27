package com.twitter.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.twitter.pojos.User;
import com.twitter.serviceControllers.ServiceController;

@Controller
public class TwitterController {

	@Autowired
	ServiceController sc;

	@RequestMapping(value = "/register")
	public String registerUser(User u) {
		System.out.println("registerUser::TwitterController");
		return sc.registerService(u);
	}

	@RequestMapping(value = "/login")
	public String loginUser() {
		System.out.println("loginUser::TwitterController");
		return "login";
	}
	
	
}
