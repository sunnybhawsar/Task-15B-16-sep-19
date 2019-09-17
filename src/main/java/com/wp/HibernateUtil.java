package com.wp;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	
	public static SessionFactory getSessionFactory()
	{
	Configuration configuraton = new Configuration().configure();
	
	SessionFactory sessionFactory = configuraton.buildSessionFactory();
	
	return sessionFactory;
	}
}
