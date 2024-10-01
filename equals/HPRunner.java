package com.xworkz.laptop.runner;

import com.xworkz.laptop.boot.HP;

public class HPRunner {
	
	 public static void main(String[] args) {
			
	    	HP hp = new HP("HP Laptop 15", 55000, 1.59f, 16.0d, 512.0f, "windows", 11, 39.6d, "intal core 5", 13);
			
			System.out.println(hp.equals(hp));
		}

}
