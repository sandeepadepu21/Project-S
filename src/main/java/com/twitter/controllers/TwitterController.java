package com.twitter.controllers;

import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.twitter.constants.TwitterConstants;
import com.twitter.pojos.User;
import com.twitter.serviceControllers.ServiceController;

@Controller
public class TwitterController {

	@Autowired
	ServiceController sc;
	TwitterConstants constants;

	@RequestMapping(value = "/register")
	public String registerUser(User u) {
		System.out.println("registerUser::TwitterController");
		return sc.registerService(u);
	}

	@RequestMapping(value = "/login")
	public String loginUser(Model m, @RequestParam("email") String email, @RequestParam("pwd") String pword) {
		System.out.println("loginUser::TwitterController");
		return sc.loginService(email, pword, m);
	}

	@RequestMapping(value = "/getAllUsers")
	public String getAllUser(Model m) {
		System.out.println("getAllUsers::TwitterController");
		List<User> list = sc.getAllUsers();
		m.addAttribute("userList", list);
		return constants.DETAILS_PAGE;
	}

	@RequestMapping(value = "/loginUser")
	public String goToLogin() {		
		System.out.println("goToLogin::TwitterController");
		return constants.LOGIN_PAGE;
	}

	@RequestMapping(value = "/goBack")
	public String goBack() {
		System.out.println("goBack::TwitterController");
		return constants.PROFILE_PAGE;
	}

	@RequestMapping(value = "/deleteUser")
	public String deleteUser(@RequestParam("mailId") String email, Model m, Principal p) {
		System.out.println("deleteUser::TwitterController");		
		List<User> list = sc.deleteUser(email,m, p);
		m.addAttribute("userList", list);
		return constants.DETAILS_PAGE;
	}

	@RequestMapping(value = "/editUser")
	public String editUser(@RequestParam("mailId") String email, Model m) {
		System.out.println("editUser::TwitterController");
		return sc.editUser(email, m);
	}

	@RequestMapping(value = "/updateUser")
	public String updateUser(User u, Model m) {
		System.out.println("updateUser::TwitterController");
		return sc.updateUser(u, m);
	}

	@RequestMapping(value= "/pageNotFound")
	public String pageNotFound(Model m) {
		m.addAttribute("err_msg", "The Resource you are accessing is not found or You don't have Permission to access");
		return constants.PAGE_NOT_FOUND_PAGE;
	}
}
