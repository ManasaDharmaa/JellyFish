package com.xworkz.food.boot;

public class Zomato {
	
	public String services;
	public int founded;
	public double employees;
	public float revenue;
	public char expressDelivery;
	public boolean isAppAvailable;
	
	
	
	public Zomato(String services, int founded, double employees, float revenue, char expressDelivery,
			boolean isAppAvailable) {
		super();
		this.services = services;
		this.founded = founded;
		this.employees = employees;
		this.revenue = revenue;
		this.expressDelivery = expressDelivery;
		this.isAppAvailable = isAppAvailable;
	}
	public String getServices() {
		return services;
	}
	public int getFounded() {
		return founded;
	}
	public double getEmployees() {
		return employees;
	}
	public float getRevenue() {
		return revenue;
	}
	public char getExpressDelivery() {
		return expressDelivery;
	}
	public boolean isAppAvailable() {
		return isAppAvailable;
	}
	public void setServices(String services) {
		this.services = services;
	}
	public void setFounded(int founded) {
		this.founded = founded;
	}
	public void setEmployees(double employees) {
		this.employees = employees;
	}
	public void setRevenue(float revenue) {
		this.revenue = revenue;
	}
	public void setExpressDelivery(char expressDelivery) {
		this.expressDelivery = expressDelivery;
	}
	public void setAppAvailable(boolean isAppAvailable) {
		this.isAppAvailable = isAppAvailable;
	}
	
	

}
