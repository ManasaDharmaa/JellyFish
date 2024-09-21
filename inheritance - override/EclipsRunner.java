package com.xworkz.meta.runner;

import com.xworkz.meta.boot.ProjectExplorer;

public class EclipsRunner {
	
	public static void main(String[] args) {
		
		ProjectExplorer projectExplorer = new ProjectExplorer();
		
		projectExplorer.name();
		projectExplorer.menuBar();
		projectExplorer.startingWord();
		projectExplorer.projects();
		projectExplorer.isIDKAvailabele();
		
		
		
	}

}
