package com.wp;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class AddVehicle {

	public static void main(String[] args) {
	
		Session session = HibernateUtil.getSessionFactory().openSession();
		
		Transaction transaction = session.beginTransaction();
		
		Vehicle vehicle1 = new Vehicle("V101", "BMW", "C0B0", 510010);
		Vehicle vehicle2 = new Vehicle("V102", "Ford", "D0B1", 110010);
		
		session.save(vehicle1);
		session.save(vehicle2);
		
		transaction.commit();
		
		System.out.println("Vehicle Added!");
		
		session.close();
	}
}
