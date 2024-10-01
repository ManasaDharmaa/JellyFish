package com.xworkz.laptop.boot;

public class Asus {
	
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
	
	
	public Asus(String fullName, int cost, float kiloGram, double gigaByte, float gigaByteInSSD, String oporetingSystem,
			int windows, double inches, String intalCore, int gen) {
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
		if (obj == null || getClass() == obj.getClass()) {
			return false;
		}
		
		Asus asus = (Asus) obj;
		
		return fullName.equals(asus.fullName) && cost == asus.cost && kiloGram == asus.kiloGram &&
				gigaByte == asus.gigaByte && gigaByteInSSD == asus.gigaByteInSSD &&
				oporetingSystem.equals(asus.oporetingSystem) && windows == asus.windows &&
				inches == asus.inches && intalCore.equals(asus.intalCore) && gen == asus.gen;
		
		
	}
	

}
