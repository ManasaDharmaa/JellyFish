package com.xworkz.laptop.boot;

public class Lenovo {
	
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
	
	
	public Lenovo(String fullName, int cost, float kiloGram, double gigaByte, float gigaByteInSSD,
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
		
		Lenovo lenovo = (Lenovo) obj;
		
		return fullName.equals(lenovo.fullName) && cost == lenovo.cost &&
				kiloGram == lenovo.kiloGram && gigaByte == lenovo.gigaByte &&
				gigaByteInSSD == lenovo.gigaByteInSSD && oporetingSystem.equals(lenovo.oporetingSystem) &&
				windows == lenovo.windows && inches == lenovo.inches && intalCore.equals(lenovo.intalCore) &&
				gen == lenovo.gen;
	}

}
