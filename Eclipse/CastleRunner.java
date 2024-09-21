package com.xworkz.palace.runner;

import com.xworkz.palace.boot.Castle;

public class CastleRunner {
	
	public static void main(String [] args) {
		
		Castle castle = new Castle("Mysore Palace", 5, 9980755381l, 15.0d, 16000.0f, 'O', true);
		
		System.out.println("name of the palace : "+castle.getNameOfThePalace());
		System.out.println("number of princes : "+castle.getNoOfPrince());
		System.out.println("phone number of king : " +castle.getNoOfKing());
		System.out.println("number of ministers : "+castle.getNoMinisters());
		System.out.println("no of soldjiers : "+castle.getNoOfsoldjier());
		System.out.println("color of flog : "+castle.getFlogColor());
		System.out.println("palace is visited place : "+castle.isVisited());
			
		}

}
