package com.xworkz.stand.runner;

import com.xworkz.stand.boot.Bus;
import com.xworkz.stand.boot.Bus.Train;

public class BusRunner {

	public static void main(String[] args) {
		
		Bus bus= new Bus(); 
		bus.stand();
	    
		Train train = bus.new Train();
		train.stop();
		
}
	
}
