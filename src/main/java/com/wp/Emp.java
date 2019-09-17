package com.wp;

import javax.persistence.Entity;
//import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Emp {
	
	@Id
	private int code;
	private String name;
	private int salary;
	
	@OneToOne //(fetch=FetchType.LAZY)
	private Laptop laptop;
	
	
	@OneToOne
	private Vehicle vehicle;
	
	// Constructors 
	
	public Emp(int code, String name, int salary) {
		super();
		this.code = code;
		this.name = name;
		this.salary = salary;
	}
	public Emp() {
		super();
	}
	public Emp(int code) {
		super();
		this.code = code;
	}
	
	// Getters and Setters
	
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	// ToString method
	
	@Override
	public String toString() {
		return "Emp [code=" + code + ", name=" + name + ", salary=" + salary + ", laptop=" + laptop + ", vehicle="
				+ vehicle + "]";
	}
	
	// Updated constructor
	
	public Emp(int code, String name, int salary, Laptop laptop) {
		super();
		this.code = code;
		this.name = name;
		this.salary = salary;
		this.laptop = laptop;
	}
	
	public Laptop getLaptop() {
		return laptop;
	}
	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}
	public Vehicle getVehicle() {
		return vehicle;
	}
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	public Emp(int code, String name, int salary, Laptop laptop, Vehicle vehicle) {
		super();
		this.code = code;
		this.name = name;
		this.salary = salary;
		this.laptop = laptop;
		this.vehicle = vehicle;
	}
	
}
