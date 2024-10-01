package com.xworkz.laptop.boot;

public class Samsung {
	
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
	
	
	public Samsung(String fullName, int cost, float kiloGram, double gigaByte, float gigaByteInSSD,
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
		
		Samsung samsung = (Samsung) obj;
		
		return fullName.equals(samsung.fullName) && cost == samsung.cost &&
				kiloGram == samsung.kiloGram && gigaByte == samsung.gigaByte &&
				gigaByteInSSD == samsung.gigaByteInSSD && oporetingSystem.equals(samsung.oporetingSystem) &&
				windows == samsung.windows && inches == samsung.inches && intalCore.equals(samsung.intalCore) &&
				gen == samsung.gen;
	}
	
	

}
