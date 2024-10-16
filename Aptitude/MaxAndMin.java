package com.xworkz.practice.boot;

import java.util.Collection;
import java.util.Scanner;

public class MaxAndMin {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int e = sc.nextInt();
		
		int alp[] = {a, b, c, d, e};
		
		int max = alp[0];
		int min = alp[0];
		
		for(int i=0; i<5; i++) {
			
			if(alp[i] > max) {
				max = alp[i];
			}
			if(alp[i] < min) {
				min = alp[i];
			}
		}
		
		System.out.println("max value : " + max);
		System.out.println("min value : " + min);
		
	}

}
