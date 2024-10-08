package com.xworkz.practice.boot;

import java.util.Scanner;

public class ShopOpenOrClose {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int day = sc.nextInt();
		
		int time = sc.nextInt();
		
		if((day >= 1 && day <=5) && (time >= 10 && time <= 17)) {
			System.out.println("Open");
		}else {
			System.out.println("close");
		}
	}

}
