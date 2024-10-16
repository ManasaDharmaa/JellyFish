package com.xworkz.practice.boot;

import java.util.Scanner;

public class CountTheNumberOfDigits {
	
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a number: ");
	        String number = sc.nextLine();

	        
	        int digitCount = number.length();

	        System.out.println("The number of digits in " + number + " is: " + digitCount);

	        sc.close();
	    }

}
