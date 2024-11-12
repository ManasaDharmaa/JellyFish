package com.xworkz.stand.runner;

import com.xworkz.stand.boot.BusAnonymous;

public class BusAnonymousRunner {

	public static void main(String[] args) {
		
		BusAnonymous busAnonymous = new BusAnonymous() {

			public void stand() {
				System.out.println("this is Anonymous class");
				
			}
			
			
		};
		
		busAnonymous.stand();
	}

}
