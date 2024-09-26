package com.xworkz.moongDal.runner;

import com.xworkz.moongDal.boot.MoongDal;

public class MoongDalRunner {
	
	
      public static void main(String[] args) {
		
    	  MoongDal moongDal = new MoongDal();
    	  MoongDal moongDal1 = new MoongDal("Haldirams");
    	  MoongDal moongDal2 = new MoongDal("Haldirams", 50);
    	  MoongDal moongDal3 = new MoongDal("Haldirams", 50, 'L',25.0d);
    	  MoongDal moongDal4 = new MoongDal("Haldirams", 50, 'L', 25.0d,90.0f);
    	  MoongDal moongDal5 = new MoongDal("Haldirams", 50, 'L', 25.0d,90.0f,7865674329l);
    	  MoongDal moongDal6 = new MoongDal("Haldirams", 50, 'L', 25.0d,90.0f,7865674329l, true);
			
			
			
			
    	  moongDal.namkeen();
			System.out.println("this is one argument overloding polymorphism " + moongDal.namkeen(" Haldirams"));
			System.out.println("this is two argument overloding polymorphism " + moongDal.namkeen("Haldirams", 50));
			System.out.println("this is three argument overloding polymorphism " + moongDal.namkeen(" Haldirams",50,'L',25.0d));
			System.out.println("this is four argument overloding polymorphism " + moongDal.namkeen("Haldirams", 50, 'L', 25.0d,90.0f));
			System.out.println("this is five argument overloding polymorphism " + moongDal.namkeen("Haldirams", 50, 'L', 25.0d,90.0f,7865674329l));
			System.out.println("this is six argument overloding polymorphism " + moongDal.namkeen("Haldirams",  50, 'L', 25.0d,90.0f,7865674329l, true));
			
		}


}
