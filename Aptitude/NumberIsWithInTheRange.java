package com.xworkz.practice.boot;

import java.util.Scanner;

public class NumberIsWithInTheRange {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		if(num >= 10 && num <= 20) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
	}

}
