package com.xworkz.practice.boot;

import java.util.Scanner;

public class multiplicationTableWhileLoop {
	
	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		int i=1; 
		while(i<=10) {
			
			int mul =num*i;
			System.out.println(num + "*" + i + "=" +mul);
			i++;

		}
	}

}
