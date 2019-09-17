package com.wp;

import java.util.Scanner;

import org.hibernate.Session;

public class SearchEmployee {

	public static void main(String[] args) {
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter Employee Code : ");
		int code = scanner.nextInt();
		
		Emp emp = session.get(Emp.class,code);
		
		System.out.println("\nEmployee Details :");
		System.out.println(emp.getCode());
		System.out.println(emp.getName());
		System.out.println(emp.getSalary());
		
		System.out.println("\nLaptop Details :");
		System.out.println(emp.getLaptop().getCode());
		System.out.println(emp.getLaptop().getBrand());
		System.out.println(emp.getLaptop().getPrice());
		
		System.out.println("\nVehicle Details :");
		System.out.println(emp.getVehicle().getCode());
		System.out.println(emp.getVehicle().getBrand());
		System.out.println(emp.getVehicle().getModel());
		System.out.println(emp.getVehicle().getPrice());
		
		session.close();
		
		scanner.close();
	}
}
