package com.twitter.daoControllers;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DaoUtil {

	public static SessionFactory DbUtil() {

		return new Configuration().configure().buildSessionFactory();
	}

}
