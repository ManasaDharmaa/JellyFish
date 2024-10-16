package com.xworkz.practice.boot;

import java.util.Scanner;

public class CountBinaryDigits {
	

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        
	        System.out.print("Enter a number: ");
	        int number = sc.nextInt();
	        
	        
	        int binaryDigitCount = countBinaryDigits(number);
	        
	        System.out.println("The number of binary digits in " + number + " is: " + binaryDigitCount);
	        
	        sc.close();
	    }

	    public static int countBinaryDigits(int num) {
	        if (num == 0) {
	            return 1; 
	        }

	        int count = 0;

	        
	        while (num > 0) {
	            num >>= 1; 
	            count++;   
	        }

	        return count; 
	    }
	}


