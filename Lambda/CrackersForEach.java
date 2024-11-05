package com.xworkz.crackers.runner;

import java.util.Arrays;
import java.util.List;

public class CrackersForEach {
	
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(23, 77, 33, 87, 37, 20);
		
		list.forEach(n -> System.out.println("values : " + n));
	}

}
