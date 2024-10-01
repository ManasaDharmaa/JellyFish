package com.xworkz.laptop.boot;

public class MSI {
	
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
	
	
	public MSI(String fullName, int cost, float kiloGram, double gigaByte, float gigaByteInSSD, String oporetingSystem,
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
		
		MSI msi = (MSI) obj;
		
		return fullName.equals(msi.fullName) && cost == msi.cost &&
				kiloGram == msi.kiloGram && gigaByte == msi.gigaByte &&
				gigaByteInSSD == msi.gigaByteInSSD && oporetingSystem.equals(msi.oporetingSystem) &&
				windows == msi.windows && inches == msi.inches && intalCore.equals(msi.intalCore) &&
				gen == msi.gen;
	}
	

}
