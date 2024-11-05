package com.xworkz.crackers.runner;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CrackersEven {
	
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(21, 92, 67, 38);
		Stream<Integer> value = list.stream();
		value.filter(n -> n%2==0).forEach(n ->  System.out.println(n));
	}

}
