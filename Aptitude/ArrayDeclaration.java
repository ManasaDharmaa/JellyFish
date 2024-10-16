package com.xworkz.practice.boot;

import java.util.Scanner;

public class ArrayDeclaration {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int kan =sc.nextInt();
		int eng = sc.nextInt();
		int hin = sc.nextInt();
		int maths = sc.nextInt();
		int science = sc.nextInt();
		
		int[] sub = {kan, eng, hin, maths, science};
		
		System.out.println("length of array : " + sub.length );
		
		for(int i=0; i<sub.length; i++) {
			System.out.println(sub[i]);
		}
		
	}

}
