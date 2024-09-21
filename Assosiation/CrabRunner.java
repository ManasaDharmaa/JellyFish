package com.xworkz.studio.runner;

import com.xworkz.studio.boot.Crab;
import com.xworkz.studio.boot.Pron;

public class CrabRunner {
	
	public static void main(String [] args) {
		
		Crab crab = new Crab();
		Pron pron = new Pron();
		
		crab.setType("Red king crab");
		crab.setShoulders(2);
		crab.setClaw(2.0d);
		crab.setLegs(10.0f);
		crab.setFirstLetter('C');
		crab.setAlive(true);
		crab.setPron(pron);
		
		
		crab.pron.setType("Prawns fish");
		crab.pron.setShoulders(2);
		crab.pron.setClaw(3.0d);
		crab.pron.setLegs(5.0f);
		crab.pron.setFirstLetter('P');
		crab.pron.setAlive(true);
		
		
		System.out.println(crab.getType());
		System.out.println(crab.getShoulders());
		System.out.println(crab.getClaw());
		System.out.println(crab.getLegs());
		System.out.println(crab.getFirstLetter());
		System.out.println(crab.isAlive());
		
		
		System.out.println(crab.pron.getType());
		System.out.println(crab.pron.getShoulders());
		System.out.println(crab.pron.getClaw());
		System.out.println(crab.pron.getLegs());
		System.out.println(crab.pron.getFirstLetter());
		System.out.println(crab.pron.isAlive());
		
		
		
	}

}
