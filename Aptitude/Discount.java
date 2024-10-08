package com.xworkz.practice.boot;

import java.util.Scanner;

public class Discount {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the cost");
		int cost = sc.nextInt();
		System.out.println("enter the discount");
		int discount = sc.nextInt();
		double productSalePrice = cost * (discount/100.0d);
		
		System.out.println("price : " + productSalePrice);
		
	}
}
