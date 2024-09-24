package com.xworkz.hospital.runner;

import com.xworkz.hospital.boot.Clinic;
import com.xworkz.hospital.boot.Dental;

public class HospitalRunner {
	
	public static void main(String[] args) {
		
		
		Clinic clinic = new Clinic();
		
	    clinic.display();
	    
	    
	    Dental dental = new Dental();
	    
	    dental.dental();
	}

}
