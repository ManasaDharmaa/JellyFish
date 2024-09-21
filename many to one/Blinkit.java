package com.xworkz.food.boot;

public class Blinkit {
	
	public String services;
	public int founded;
	public double employees;
	public float revenue;
	public char expressDelivery;
	public boolean isAppAvailable;
	public Zomato zomato;
	public Swiggy swiggy;
	
	
	
	
	public Blinkit(String services, int founded, double employees, float revenue, char expressDelivery,
			boolean isAppAvailable, Zomato zomato, Swiggy swiggy) {
		super();
		this.services = services;
		this.founded = founded;
		this.employees = employees;
		this.revenue = revenue;
		this.expressDelivery = expressDelivery;
		this.isAppAvailable = isAppAvailable;
		this.zomato = zomato;
		this.swiggy = swiggy;
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
	public Zomato getZomato() {
		return zomato;
	}
	public Swiggy getSwiggy() {
		return swiggy;
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
	public void setZomato(Zomato zomato) {
		this.zomato = zomato;
	}
	public void setSwiggy(Swiggy swiggy) {
		this.swiggy = swiggy;
	}
	
	

}
