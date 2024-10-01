package com.xworkz.laptop.boot;

public class MiLaptop {
	
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
	
	public MiLaptop(String fullName, int cost, float kiloGram, double gigaByte, float gigaByteInSSD,
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
		if(obj == null || getClass() == obj.getClass() ) {
			return false;
		}
		MiLaptop miLaptop = (MiLaptop) obj;

		return fullName.equals(miLaptop.fullName) && cost ==miLaptop.cost && 
				kiloGram == miLaptop.kiloGram && gigaByte == miLaptop.gigaByte
				&& gigaByteInSSD == miLaptop.gigaByteInSSD &&
				oporetingSystem.equals(miLaptop.oporetingSystem) && windows == miLaptop.windows 
				&& inches == miLaptop.inches && intalCore.equals(miLaptop.intalCore) && 
				gen == miLaptop.gen;
		
	}
	
	

	
	
	
	
	

}
