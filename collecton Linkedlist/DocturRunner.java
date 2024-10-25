package com.xworkz.doctor.ruuner;

import java.util.LinkedList;
import java.util.ListIterator;

import com.xworkz.doctor.dto.DdoctorDto;

public class DocturRunner {

	public static void main(String[] args) {

		LinkedList<DdoctorDto> list = new LinkedList<DdoctorDto>();

		list.add(new DdoctorDto("Harshith", 50000));
		list.add(new DdoctorDto("Hamsa", 75000));
		list.add(new DdoctorDto("Jagdeesh", 230000));
		list.add(new DdoctorDto("Rashmi", 10100));

		ListIterator<DdoctorDto> dto = list.listIterator();

		while (dto.hasNext()) {

			dto.add(new DdoctorDto("mahima", 789800));
			DdoctorDto value = dto.next();
			System.out.println(value);

		}
		
		for(DdoctorDto doctor : list) {
			
			System.out.println(doctor);
		}
		

	}
}
