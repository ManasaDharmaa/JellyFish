package com.xworkz.sea.boot;

public class Octopus {
	
	public String order;
	public int arms;
	public double variesFeet;
	public float variesLength;
	public Seaweed seaweed;
	
	
	public Octopus(String order, int arms, double variesFeet, float variesLength, Seaweed seaweed) {
		super();
		this.order = order;
		this.arms = arms;
		this.variesFeet = variesFeet;
		this.variesLength = variesLength;
		this.seaweed = seaweed;
	}
	
	
	public String getOrder() {
		return order;
	}
	public int getArms() {
		return arms;
	}
	public double getVariesFeet() {
		return variesFeet;
	}
	public float getVariesLength() {
		return variesLength;
	}
	public Seaweed getSeaweed() {
		return seaweed;
	}
	public void setOrder(String order) {
		this.order = order;
	}
	public void setArms(int arms) {
		this.arms = arms;
	}
	public void setVariesFeet(double variesFeet) {
		this.variesFeet = variesFeet;
	}
	public void setVariesLength(float variesLength) {
		this.variesLength = variesLength;
	}
	public void setSeaweed(Seaweed seaweed) {
		this.seaweed = seaweed;
	}
	
	

}
