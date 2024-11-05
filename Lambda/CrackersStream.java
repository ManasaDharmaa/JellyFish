package com.xworkz.crackers.runner;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CrackersStream {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(23, 44, 65, 21, 19);
		Stream<Integer> value = list.stream();
		value.sorted().forEach(n -> System.out.println(n));
	}
}
