package com.xworkz.language.runner;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.xworkz.language.dto.LanguageCompareToDto;

public class LanguageCompareToDtoRunner {

    public static void main(String[] args) {

        List<LanguageCompareToDto> list = new ArrayList<LanguageCompareToDto>();

        list.add(new LanguageCompareToDto(93, "Java"));
        list.add(new LanguageCompareToDto(34, "C"));
        list.add(new LanguageCompareToDto(54, "Python"));

        Collections.sort(list);

        System.out.println(list);
    }
}
