package com.xworkz.language.runner;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LanguageStringRunner {
	
	public static void main(String[] args) {
		
		Comparator<String> comparator = new Comparator<String>() {

			public int compare(String i, String j) {
				
				return j.compareToIgnoreCase(i);
			}
			
		};
		
		List<String> list = new ArrayList<String>();
		list.add("Kan");
		list.add("Eng");
		list.add("Hin");
		list.add("c");
		
		Collections.sort(list, comparator);
		
		System.out.println(list);
	}

}
