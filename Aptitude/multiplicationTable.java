package com.xworkz.practice.boot;

import java.util.Scanner;

public class multiplicationTable {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		for(int i=1; i<=10; i++) {
			
			int mul =num*i;
			System.out.println(num + "*" + i + "=" +mul);

		}
	
	}

}
