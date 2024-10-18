package com.xworkz.exception.runner;

import com.xworkz.exception.boot.Marks;

public class MarksRunner {
	
	public static void main(String[] args) {
		
		Marks marks = new Marks();
		marks.marksAge(11);
		marks.marksEmail("anshu@gmail.com");
		marks.marksPassword("Ansf#12");
		marks.marksName("Anshika");
		marks.marksPhoneNum(9980765432l);
	}

}
