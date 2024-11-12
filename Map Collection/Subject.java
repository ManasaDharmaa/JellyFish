package com.xworkz.chairSet.boot;

import java.util.HashMap;
import java.util.Map;

public class Subject {
	
	public static void main(String[] args) {
		
		Map<Double, Character> map = new HashMap<Double, Character>();
		
		map.put(21.9d, 'A');
		map.put(21.3d, 'G');
		map.put(22.0d, 'S');
		map.put(21.9d, 'A');
		map.put(91.4d, 'A');
		
		System.out.println(map.keySet());
		System.out.println(map.values());
		System.out.println(map.entrySet());
	}

}
