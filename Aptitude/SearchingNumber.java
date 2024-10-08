package com.xworkz.practice.boot;

import java.util.Scanner;

public class SearchingNumber {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num[] = {0,1,2,3,4,5,6,7,8,9};
		int search = sc.nextInt();
		
		for(int i=0; i<=9; i++) {
			if(num[i] == search) {
				System.out.println( search);
				break;
			}
		}
	}

}
