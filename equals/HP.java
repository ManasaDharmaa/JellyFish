package com.xworkz.laptop.boot;

public class HP {
	
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
	
	
	public HP(String fullName, int cost, float kiloGram, double gigaByte, float gigaByteInSSD, String oporetingSystem,
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
		
		HP hp = (HP) obj;
		
		return fullName.equals(hp.fullName) && cost == hp.cost && kiloGram == hp.kiloGram &&
				gigaByte == hp.gigaByte && gigaByteInSSD == hp.gigaByteInSSD &&
				oporetingSystem.equals(hp.oporetingSystem) && windows == hp.windows &&
				inches == hp.inches && intalCore.equals(hp.intalCore) && gen == hp.gen;
		
		
	}
	
	

}
