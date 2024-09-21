package com.xworkz.studio.runner;

import com.xworkz.studio.boot.Department;
import com.xworkz.studio.boot.Students;

public class DepartmentRunner {
	
	public static void main(String [] args) {
		
		Students students = new Students("Manasa",402, 22.0d, 95000.0f, true,'D');
		Department department = new Department("ISE", 850, 9807654376l, 30.0d , 8.0f, false ,'I', students);
		
		System.out.println("name of the department: " + department.getName());
		  System.out.println("no of students : " + department.getNoOfstudents());
		  System.out.println("department number : " + department.getDeptNo());
		  System.out.println("no of faculty : " + department.getNoOfFacultys());
		  System.out.println("no of section : "+ department.getNoOfSec());
		  System.out.println("is holiday : "+ department.isHoliday());
		  System.out.println("short name of department : "+ department.getShortFormOfDeptName());
		  System.out.println("students name : " + department.students.getName());
		  System.out.println("students roll number : " + department.students.getRollNo());
		  System.out.println("students age : " + department.students.getAge());
		  System.out.println("students fee : " + department.students.getFee());
		  System.out.println("students is present : " + department.students.isPresent());
		  System.out.println("students initial : " + department.students.getInitial());
		  
	}

}
