package com.wp;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class AddEmployee {

	public static void main(String[] args) {
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		
		Transaction transaction = session.beginTransaction();
		
		Emp emp1 = new Emp(111, "Sunny", 2000, new Laptop("L101"), new Vehicle("V101"));
		Emp emp2 = new Emp(222, "Vinod", 4000, new Laptop("L102"), new Vehicle("V102"));
		
		session.save(emp1);
		session.save(emp2);
		
		transaction.commit();
		
		System.out.println("Employee Added!");
		
		session.close();
	}
}
