package com.xworkz.practice.boot;

import java.util.Scanner;

public class PositiveNumber {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num;
		do {
			System.out.println("Enter the positive number");
			 num = sc.nextInt();
			
		}while(num <= 0);
		System.out.println(num);
		
	}

}
