package com.xworkz.practice.boot;

public class SumOfAllElementsInArray {

	public static void main(String[] args) {

		int apple = 50;
		int banana = 20;
		int orange = 70;
		int grapes = 80;
		int guva = 10;

		int[] frutes = { apple, banana, orange, grapes, guva };

		int sum = 0;

		for (int i = 0; i < frutes.length; i++) {
			sum = sum + frutes[i];

			System.out.println(sum);
		}
	}

}
