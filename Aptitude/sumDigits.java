package com.xworkz.practice.boot;

import java.util.Scanner;

public class sumDigits {
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		int sum =0;
		int num = sc.nextInt();
		
		while(num !=0) {
			int remainder = num % 10;
			sum = sum + remainder;
			num = num/10;
			
		}
		
		System.out.println(sum);
	}

}
