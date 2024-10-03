package com.xworkz.college.runner;

public class College {
	
	public static void main(String[] args) {
		
		String collegeName = "Malnad College Of Engineering";
		
		int number = collegeName.length();
		System.out.println("name of the college : " + number);
		
		boolean branchName = collegeName.contains(" Information Science");
		System.out.println("is true or false : " + branchName);
		
		String nameOfCollege = collegeName.toLowerCase();
		System.out.println("convert all lowercase : " + nameOfCollege);
		
		String nameOfBranch = collegeName.toUpperCase();
		System.out.println("convert all upper case : " + nameOfBranch);
		
	     String nameConcat = collegeName.concat(" Information Science");
	     System.out.println("concat : " + nameConcat);
	     
	     boolean nameEmpty = collegeName.isEmpty();
	     System.out.println("is empty : " + nameEmpty);
	     
	    
	     int nameIndex = collegeName.indexOf('E');
	     System.out.println(nameIndex);
			
	     boolean nameEnds = collegeName.endsWith("ing");
	     System.out.println(nameEnds);
	     
	     char nameCharAt = collegeName.charAt(7);
	     System.out.println(nameCharAt);
	     
	     int nameCompare = collegeName.compareTo("Malnad");
	     System.out.println(nameCompare);
	     
	     byte[] nameByte = collegeName.getBytes();
	     System.out.println(nameByte[9]);
	     
	     
	     int nameHashCode = collegeName.hashCode();
	     System.out.println(nameHashCode);
	     
	     boolean nameMatches = collegeName.matches("Malnad College Of Engineering");
	     System.out.println(nameMatches);
	     
	     String nameReplace = collegeName.replace('l', 'N');
	     System.out.println(nameReplace);
	     
	     
	     
	     StringBuffer name = new StringBuffer("Malnad");
	     
	     name.append(" Hello");
	     System.out.println(name);
	     
	     System.out.println( name.reverse());
	     
		}
		
		
	}

