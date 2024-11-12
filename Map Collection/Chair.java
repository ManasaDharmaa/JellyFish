package com.xworkz.chairSet.boot;

import java.util.HashMap;
import java.util.Map;


public class Chair {
	
	private static final char[] Values = null;

	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("4 siter", 3000);
		map.put("3 siter", 5600);
		map.put("2 siter", 3000);
		map.put("3 siter", 5600);
		map.put("3 siter", 6500);
		
		
	     
		System.out.println(map.keySet());
		System.out.println(map.values());
		System.out.println(map.entrySet());
		
	}

}
