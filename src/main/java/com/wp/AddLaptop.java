package com.wp;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class AddLaptop {

	public static void main(String[] args) {
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		
		Transaction transaction = session.beginTransaction();
		
		Laptop laptop1 = new Laptop("L101", "Apple", 140000);
		Laptop laptop2 = new Laptop("L102", "HP", 75000);
		
		session.save(laptop1);
		session.save(laptop2);
		
		transaction.commit();
		
		System.out.println("Laptop Added!");
		
		session.close();
	}
}
