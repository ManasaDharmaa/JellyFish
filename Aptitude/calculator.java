package com.xworkz.practice.boot;

import java.util.Scanner;

public class calculator {
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("give input A");
		int inputA = sc.nextInt();
		System.out.println("give input B");
		int inputB = sc.nextInt();
		System.out.println("give input Oporator");
	    char op = sc.next().charAt(0);
	    
	    switch(op){
	    	
	        case '+': 
	    	    System.out.println( inputA +"+"+ inputB + (inputA + inputB));
	            break;
	    
	        case '-' :
	    	    System.out.println(inputA +"-"+ inputB+(inputA - inputB));
	    	    break;
	    	
	        case '*':
	        	System.out.println(inputA +"*"+ inputB+(inputA * inputB));
	        	break;
	        	
	        case '/':
	        	System.out.println(inputA +"/" + inputB+ (inputA / inputB));
	        	break;
	        	
	        case '%':
	        	System.out.println(inputA +"A%B "+ inputB + (inputA % inputB));
	    	    break;
	    	    
	       default :
	        	System.out.println("invalid 3");
	    	    break;

	    
	    }	
	}

}
