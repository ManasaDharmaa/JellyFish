package com.xworkz.laptop.boot;

public class Apple {
	
	String fullName;
	int cost;
	float kiloGram;
	double gigaByte;
	float gigaByteInSSD;
	String oporetingSystem;
	int windows;
	double inches;
	String intalCore;
	int gen;
	
	
	public Apple(String fullName, int cost, float kiloGram, double gigaByte, float gigaByteInSSD,
			String oporetingSystem, int windows, double inches, String intalCore, int gen) {
		super();
		this.fullName = fullName;
		this.cost = cost;
		this.kiloGram = kiloGram;
		this.gigaByte = gigaByte;
		this.gigaByteInSSD = gigaByteInSSD;
		this.oporetingSystem = oporetingSystem;
		this.windows = windows;
		this.inches = inches;
		this.intalCore = intalCore;
		this.gen = gen;
	}
	
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}
		if(obj == null || getClass() == obj.getClass()) {
			return false;
		}
		
		Apple apple = (Apple) obj;
		
		return fullName.equals(apple.fullName) && cost == apple.cost &&
				kiloGram == apple.kiloGram && gigaByte == apple.gigaByte &&
				gigaByteInSSD == apple.gigaByteInSSD && oporetingSystem.equals(apple.oporetingSystem) &&
				windows == apple.windows && inches == apple.inches && intalCore.equals(apple.intalCore) &&
				gen == apple.gen;
	}
	

}
