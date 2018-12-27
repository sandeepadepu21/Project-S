package com.twitter.daoControllers;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.twitter.pojos.User;

@Repository
public class DaoController {
	static SessionFactory sf = DaoUtil.DbUtil();
	
	public String register(User u) {
		Session s = sf.openSession();
		s.save(u);
		s.beginTransaction().commit();
		s.close();
		return "login";
	}

}
