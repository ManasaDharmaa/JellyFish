package com.xworkz.laptop.boot;

public class Dell {
	
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
	
	
	public Dell(String fullName, int cost, float kiloGram, double gigaByte, float gigaByteInSSD, String oporetingSystem,
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
		
		Dell dell = (Dell) obj;
		
		return fullName.equals(dell.fullName) && cost == dell.cost 
				&& kiloGram == dell.kiloGram && gigaByte == dell.gigaByte && 
				gigaByteInSSD == dell.gigaByteInSSD && oporetingSystem.equals(dell.oporetingSystem) && 
				windows == dell.windows && inches == dell.inches && intalCore.equals(dell.intalCore) &&
				gen == dell.gen;
	}
	

}
