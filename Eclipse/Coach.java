package com.xworkz.coach.boot;

public class Coach {
	
	static String name;
	static int age;
	static long phNo;
	static double salary;
	static float students;
	static char game;
	static boolean isPresent;
	
	public Coach(String name, int age, long phNo, double salary, float students, char game, boolean isPresent) {
		this.name = name;
		this.age = age;
		this.phNo = phNo;
		this.salary = salary;
		this.students = students;
		this.game = game;
		this.isPresent = isPresent;
		
	}
	
	public static String getName() {
		return name;
	}
	public static int getAge() {
		return age;
	}
	public static long getPhNo() {
		return phNo;
	}
	public static double getSalary() {
		return salary;
	}
	public static float getStudents() {
		return students;
	}
	public static char getGame() {
		return game;
	}
	public static boolean isPresent() {
		return isPresent;
	}

}
