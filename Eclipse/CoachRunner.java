package com.xworkz.coach.runner;

import com.xworkz.coach.boot.Coach;

public class CoachRunner {
	
	public static void main(String [] args) {
		
		 Coach coach = new Coach("Vidya", 32, 9087694576l, 25000.0d, 15.0f, 'B', true);
		 
		 System.out.println("name of the Coach : " + coach.getName());
		 System.out.println("age of the coach : " + coach.getAge());
		 System.out.println("number of the coach : " + coach.getPhNo());
		 System.out.println("Coach salary : " + coach.getSalary());
		 System.out.println("Number of the students : " + coach.getStudents());
		 System.out.println("name of the game : " + coach.getGame());
		 System.out.println("Coach is present : " + coach.isPresent());
	}

}
