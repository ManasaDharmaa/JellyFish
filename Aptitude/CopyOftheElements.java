package com.xworkz.practice.boot;

public class CopyOftheElements {

	public static void main(String[] args) {

	
	int[] elements = {20, 40, 60, 80, 90};
	
	int [] numbers = elements;
	
	for(int i=0; i<numbers.length; i++) {
		System.out.println(numbers[i]);
	}
	
	}

}
