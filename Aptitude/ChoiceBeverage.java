package com.xworkz.practice.boot;

import java.util.Scanner;

public class ChoiceBeverage {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int chooceNumber = sc.nextInt();
		
		switch(chooceNumber) {
		
		case 1:
			System.out.println("You Selected Coffee");
			break;
		case 2:
			System.out.println("You Selected Tea");
			break;
		case 3:
			System.out.println("You Selected Milk");
			break;
		case 4:
			System.out.println("You Selected Green Tea");
			break;
		case 5:
			System.out.println("You Selected Badam Milk");
			break;
		case 6:
			System.out.println("You Selected Lemon Tea");
			break;
		case 7:
			System.out.println("You Selected Black Tea");
			break;
		case 8:
			System.out.println("You Selected Black Coffee");
			break;
		case 9:
			System.out.println("You Selected Cold Coffee");
			break;
		}
			
		
	}

}
