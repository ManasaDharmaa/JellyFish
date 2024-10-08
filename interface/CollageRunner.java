package com.xworkz.collage.runner;

import com.xworkz.collage.boot.Branch;
import com.xworkz.collage.boot.Collage;

public class CollageRunner {
	
	public static void main(String[] args) {
		 
		Collage collage = new Branch();
		
		collage.classRoom();
		collage.name();
		collage.office();
		collage.principalName();
		System.out.println(collage.principalName());
		System.out.println(collage.fee());
	}

}
