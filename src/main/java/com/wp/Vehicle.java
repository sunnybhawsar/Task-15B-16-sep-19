package com.wp;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Vehicle {

	@Id
	private String code;
	private String brand;
	private String model;
	private int price;
	
	// constructors 
	
	public Vehicle(String code, String brand, String model, int price) {
		super();
		this.code = code;
		this.brand = brand;
		this.model = model;
		this.price = price;
	}
	public Vehicle(String code) {
		super();
		this.code = code;
	}
	public Vehicle() {
		super();
	}
	
	// Getters and Setters
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	// ToString
	
	@Override
	public String toString() {
		return "Vehicle [code=" + code + ", brand=" + brand + ", model=" + model + ", price=" + price + "]";
	}
	
	
}
