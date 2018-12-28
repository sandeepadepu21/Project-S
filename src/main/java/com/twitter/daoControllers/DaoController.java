package com.twitter.daoControllers;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.twitter.constants.TwitterConstants;
import com.twitter.pojos.User;

@Repository
public class DaoController {
	static SessionFactory sf = DaoUtil.DbUtil();
	static TwitterConstants constants;

	public String register(User u) {
		System.out.println("register::DaoController");
		Session s = sf.openSession();
		s.save(u);
		s.beginTransaction().commit();
		s.close();
		return constants.LOGIN_PAGE;
	}

	public List<User> login(String email, String pword) {
		System.out.println("login::DaoController");
		Session s = sf.openSession();
		Query q = s.createQuery("from User where email=? and password=?");
		q.setString(0, email);
		q.setString(1, pword);
		List<User> list = q.list();
		s.close();
		return list;
	}

	public List<User> getAllRecords() {
		System.out.println("getAllRecords::DaoController");
		Session s = sf.openSession();
		Query q = s.createQuery("from User");
		List<User> list = q.list();
		s.close();
		return list;
	}

	public List<User> deleteRecord(String email) {
		System.out.println("deleteRecord::DaoController");
		Session s = sf.openSession();
		Query q = s.createQuery("delete from User where email=?");
		q.setString(0, email);
		q.executeUpdate();
		s.beginTransaction().commit();
		s.close();
		List<User> list = getAllRecords();
		return list;
	}

	public List<User> editRecord(String email) {
		System.out.println("editRecord::DaoController");
		Session s = sf.openSession();
		Query q = s.createQuery("from User where email=?");
		q.setString(0, email);
		List<User> list = q.list();
		return list;
	}

	public List<User> updateRecord(User u) {
		System.out.println("updateRecord::DaoController");
		Session s = sf.openSession();
		s.update(u);
		s.beginTransaction().commit();
		s.close();
		List<User> list = getAllRecords();
		return list;
	}

}
