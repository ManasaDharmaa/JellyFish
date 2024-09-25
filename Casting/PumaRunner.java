package com.xworkz.puma.runner;

import com.xworkz.puma.boot.Puma;
import com.xworkz.puma.boot.Cloths;

public class PumaRunner {
	
	public static void main(String[] args) {
		
		Cloths cloths = new Cloths();
		
		cloths.casting();
		cloths.shows();
		
		Puma Puma = new Puma();

		Cloths cloth = (Cloths) Puma;
		
		
	}

}
