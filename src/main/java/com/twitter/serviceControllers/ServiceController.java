package com.twitter.serviceControllers;

import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import com.twitter.constants.TwitterConstants;
import com.twitter.daoControllers.DaoController;
import com.twitter.pojos.User;

@Service
public class ServiceController {

	@Autowired
	DaoController dc;
	TwitterConstants constants;

	public String registerService(User u) {
		System.out.println("registerService::ServiceController");
		return dc.register(u);
	}

	public String loginService(String email, String pword, Model m) {
		System.out.println("loginService::ServiceController");
		List<User> list = dc.login(email, pword);
		System.out.println("User: " + list.get(0).getEmail());
		if (list.isEmpty()) {
			m.addAttribute("err_msg", "Invalid Login! Check username and password");
			return constants.LOGIN_PAGE;
		}
		return constants.PROFILE_PAGE;
	}

	public List<User> getAllUsers() {
		System.out.println("getAllUsers::ServiceController");
		List<User> list = dc.getAllRecords();
		return list;
	}

	public String editUser(String email, Model m) {
		System.out.println("editUser::ServiceController");
		List<User> list = dc.editRecord(email);
		m.addAttribute("usrList", list.get(0));
		return constants.EDIT_USER_PAGE;
	}	

	public List<User> deleteUser(String email, Model m, Principal p) {
		System.out.println("deleteUser::ServiceController");	
		if( p.getName().equals(email)) {
			m.addAttribute("err_msg", "You can't delete your own account!");
			List<User> list = getAllUsers();
			return list;
		}
		List<User> list = dc.deleteRecord(email);
		return list;
	}

	public String updateUser(User u, Model m) {
		System.out.println("updateUser::ServiceController");
		List<User> list = dc.updateRecord(u);
		m.addAttribute("userList", list);
		return constants.DETAILS_PAGE;
	}
}
