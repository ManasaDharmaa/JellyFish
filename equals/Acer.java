package com.xworkz.laptop.boot;

public class Acer {
	
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
	
	
	public Acer(String fullName, int cost, float kiloGram, double gigaByte, float gigaByteInSSD, String oporetingSystem,
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
		if(obj == null || getClass() == obj.getClass()) {
			return false;
		}
		
		Acer acer = (Acer) obj;
		
		return fullName.equals(acer.fullName) && cost == acer.cost &&
				kiloGram == acer.kiloGram && gigaByte == acer.gigaByte &&
				gigaByteInSSD == acer.gigaByteInSSD && oporetingSystem.equals(acer.oporetingSystem) &&
				windows == acer.windows && inches == acer.inches && intalCore.equals(acer.intalCore) &&
				gen == acer.gen;
	}
	

}
