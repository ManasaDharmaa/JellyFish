package com.xworkz.Diploma.runner;

import com.xworkz.Diploma.boot.BTech;
import com.xworkz.Diploma.boot.Engineering;

public class DiplomaRunner {
	
	public static void main(String[] args) {
		
		Engineering engineering = new Engineering();
		
		engineering.setBranch("ISE");
		engineering.setSection(6);
		engineering.setNoOfFaculty(30.0d);
		engineering.setNoOfStudents(300.0f);
		engineering.setHoliday(true);
		
		engineering.setTotalBranch("ISE, CSE, ME, CV, AU, EC, EEE");
		engineering.setTotalSection(25);
		engineering.setNoOfFacultes(300.0d);
		engineering.setNoOfStudentsOfBranch(830.0f);
		engineering.setDaycollege(true);
		
		System.out.println("diploma brand name : " + engineering.getBranch());
		System.out.println("diploma section name : " + engineering.getSection());
		System.out.println("diploma no of faculty : " + engineering.getNoOfFaculty());
		System.out.println("diploma no of students : " + engineering.getNoOfStudents());
		System.out.println("diploma is holiday : " + engineering.isHoliday());
		
		
		System.out.println("engineering brand name : " + engineering.getTotalBranch());
		System.out.println("engineering section name : " + engineering.getTotalSection());
		System.out.println("engineering no of faculty : " + engineering.getNoOfFacultes());
		System.out.println("engineering no of students : " + engineering.getNoOfStudentsOfBranch());
		System.out.println("engineering is  Day colleg : " + engineering.isDaycollege());
		
		
		BTech bTech = new BTech();
		
		bTech.setBranch("CSE");
		bTech.setSection(5);
		bTech.setNoOfFaculty(20.0d);
		bTech.setNoOfStudents(200.0f);
		bTech.setHoliday(true);
		
		bTech.setTotalBranch("ISE, CSE, ME, CV, AU, EC, EEE");
		bTech.setTotalSection(25);
		bTech.setNoOfFacultes(300.0d);
		bTech.setNoOfStudentsOfBranch(830.0f);
		bTech.setDaycollege(true);
		
		System.out.println("diploma brand name : " + bTech.getBranch());
		System.out.println("diploma section name : " + bTech.getSection());
		System.out.println("diploma no of faculty : " + bTech.getNoOfFaculty());
		System.out.println("diploma no of students : " + bTech.getNoOfStudents());
		System.out.println("diploma is holiday : " + bTech.isHoliday());
		
		
		System.out.println("BTech brand name : " + bTech.getTotalBranch());
		System.out.println("BTech section name : " + bTech.getTotalSection());
		System.out.println("BTech no of faculty : " + bTech.getNoOfFacultes());
		System.out.println("BTech no of students : " + bTech.getNoOfStudentsOfBranch());
		System.out.println("BTech is  Day colleg : " + bTech.isDaycollege());
	}

}
