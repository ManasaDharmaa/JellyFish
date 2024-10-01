package com.xworkz.tools.runner;

import com.xworkz.tools.dto.ToolDto;

public class ToolRunner {
	
	public static void main(String[] args) {
		
		ToolDto toolDto = new ToolDto();
		
		toolDto.setToolBrand("Knipex");
		
		toolDto.setToolName("pliers");
		
		toolDto.setCost(1500);
		
		toolDto.setManufactureYear(2023);
		
		
		System.out.println(toolDto.toString());
		System.out.println(toolDto.hashCode());
		System.out.println(toolDto.equals(toolDto));
	}

}
