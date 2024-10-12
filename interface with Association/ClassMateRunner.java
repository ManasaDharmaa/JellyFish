package com.xworkz.classMate.runner;

import com.xworkz.classMate.boot.Boys;
import com.xworkz.classMate.boot.CoEd;
import com.xworkz.classMate.boot.Girls;
import com.xworkz.classMate.bridge.ClassMateInterface;

public class ClassMateRunner {
	
	public static void main(String[] args) {
		
		ClassMateInterface boys = new Boys();
		ClassMateInterface girls = new Girls();
		
		boys.nameOfClassMate();
		boys.numberOfClassMate();
		
		girls.nameOfClassMate();
		girls.numberOfClassMate();
		
		CoEd coed = new CoEd();
		
		coed.setClassMateInterface(boys);
		coed.classMateInterface.nameOfClassMate();
		coed.classMateInterface.numberOfClassMate();
		
		coed.setClassMateInterface(girls);
		coed.classMateInterface.nameOfClassMate();
		coed.classMateInterface.numberOfClassMate();
		
	}

}
