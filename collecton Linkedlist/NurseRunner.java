package com.xworkz.doctor.ruuner;

import java.util.LinkedList;
import java.util.ListIterator;

import com.xworkz.doctor.dto.NurseDto;

public class NurseRunner {

	public static void main(String[] args) {

		LinkedList<NurseDto> list = new LinkedList<NurseDto>();

		NurseDto nusse = new NurseDto("Sheela", 4350);
		NurseDto nusse1 = new NurseDto("Shweta", 7350);
		NurseDto nusse2 = new NurseDto("shanti", 7650);
		NurseDto nusse3 = new NurseDto("sowmya", 9876);
		NurseDto nusse4 = new NurseDto("ranjini", 8907);

		list.add(nusse);
		list.add(nusse1);
		list.add(nusse2);
		list.add(nusse3);
		list.add(nusse4);
		

		ListIterator<NurseDto> iterator = list.listIterator();

		while (iterator.hasNext()) {

			NurseDto value = iterator.next();

			if (value.equals(new NurseDto("Sheela", 4350))) {
				iterator.add(new NurseDto("rani", 6543));
				System.out.println(value);
			} else {
				iterator.remove();

			}

		}
		for (NurseDto dto : list) {
			System.out.println(dto);

		}

	}

}
