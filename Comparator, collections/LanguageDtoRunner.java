package com.xworkz.language.runner;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.xworkz.language.dto.LanguageDto;

public class LanguageDtoRunner {

	public static void main(String[] args) {

		Comparator<LanguageDto> comparator = new Comparator<LanguageDto>() {

			public int compare(LanguageDto i, LanguageDto j) {
				return Integer.compare(j.getCost() % 10, i.getCost() % 10);
			}

		};
		
		List<LanguageDto> list = new ArrayList<LanguageDto>();
		
		list.add(new LanguageDto(93, "java"));
		list.add(new LanguageDto(34, "c"));
		list.add(new LanguageDto(54, "python"));
		
		Collections.sort(list, comparator);
		
		System.out.println(list);
	}

}
