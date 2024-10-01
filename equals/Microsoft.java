package com.xworkz.laptop.boot;

public class Microsoft {
	
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
	
	
	public Microsoft(String fullName, int cost, float kiloGram, double gigaByte, float gigaByteInSSD,
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
		
		Microsoft microsoft = (Microsoft) obj;
		
		return fullName.equals(microsoft.fullName) && cost == microsoft.cost &&
				kiloGram == microsoft.kiloGram && gigaByte == microsoft.gigaByte &&
				gigaByteInSSD == microsoft.gigaByteInSSD && oporetingSystem.equals(microsoft.oporetingSystem) &&
				windows == microsoft.windows && inches == microsoft.inches && intalCore.equals(microsoft.intalCore) &&
				gen == microsoft.gen;
	}
	
	

}
