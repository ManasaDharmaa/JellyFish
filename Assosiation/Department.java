package com.xworkz.studio.boot;

public class Department {
	
	public String name;
	public int NoOfstudents;
	public long deptNo;
	public double NoOfFacultys;
	public float NoOfSec;
	public boolean isHoliday;
	public char shortFormOfDeptName;
	public Students students;
	
	
	
	public Department(String name, int NoOfstudents,long deptNo,double NoOfFacultys, float NoOfSec, boolean isHoliday,char shortFormOfDeptName,Students students) {
		
		this.name = name;
		this.NoOfstudents = NoOfstudents;
		this.deptNo= deptNo;
		this.NoOfFacultys = NoOfFacultys;
		this.NoOfSec = NoOfSec;
		this.isHoliday = isHoliday;
		this.shortFormOfDeptName = shortFormOfDeptName;
		this.students =students;
	}
	
	public String getName() {
		return name;
	}
	public int getNoOfstudents() {
		return NoOfstudents;
	}
	public long getDeptNo() {
		return deptNo;
	}
	public double getNoOfFacultys() {
		return NoOfFacultys;
	}
	public float getNoOfSec() {
		return NoOfSec;
	}
	public boolean isHoliday() {
		return isHoliday;
	}
	public char getShortFormOfDeptName() {
		return shortFormOfDeptName;
	}
	public Students getStudents() {
		return students;
	}
	

}
