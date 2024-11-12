package com.xworkz.language.runner;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LanguageIntRunner {

	public static void main(String[] args) {

		Comparator<Integer> comparator = new Comparator<Integer>() {

			public int compare(Integer i, Integer j) {
				if (i % 10 > j % 10) {
					return 1;
				} else {
					return -1;
				}
			}

		};

		List<Integer> list = new ArrayList<Integer>();

		list.add(23);
		list.add(76);
		list.add(98);
		list.add(12);
		list.add(654);
		list.add(89);
		Collections.sort(list, comparator);

		System.out.println(list);

	}

}
