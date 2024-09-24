package com.xworkz.hospital.boot;

public class Dental {
	
	
       public void dental() {
		
        Hospital hospital = new Hospital();
		
    	   //Protected
		hospital.isHaveMediacal = true;
		hospital.symbol = 'P';
		
		
		// Default
		hospital.noOfICU = 5.0d;
		hospital.noOfWards = 50.0f;
		
		//public 
		
		hospital.gynecologistName = "Suresh";
		hospital.noOfNurse = 70;
		
		
		
		
		System.out.println(hospital.isHaveMediacal);
		System.out.println(hospital.symbol);
		System.out.println(hospital.noOfICU);
		System.out.println(hospital.noOfWards);
		System.out.println(hospital.gynecologistName);
		System.out.println(hospital.noOfNurse);
		
		
	}


}
