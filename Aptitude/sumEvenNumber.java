package com.xworkz.practice.boot;
import java.util.*;

public class sumEvenNumber {
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 int sum = 0;
		for(int i=0; i<=100; i++) {
			
			if(i % 2 == 0) {
				
				 sum = sum + i;
			}
		}
		System.out.println(sum);
	}

}
