package com.xworkz.studio.boot;

public class Students {
	
	public String name;
	public int rollNo;
	public double age;
	public float fee;
	public boolean isPresent;
	public char initial;
	
	
	public Students(String name, int rollNo, double age, float fee, boolean isPresent,char initial) {
		
		this.name = name;
		this.rollNo = rollNo;
		this.age = age;
		this.fee = fee;
		this.isPresent = isPresent;
		this.initial = initial;
		
	}
	
	
	public String getName() {
		return name;
	}
	public int getRollNo() {
		return rollNo;
	}
	public double getAge() {
		return age;
	}
	public float getFee() {
		return fee;
	}
	public boolean isPresent() {
		return isPresent;
	}
	public char getInitial() {
		return initial;
	}
	

}
