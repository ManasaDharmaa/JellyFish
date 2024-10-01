package com.xworkz.tv.runner;


import com.xworkz.tv.boot.TV;

public class TVRunner {
	
public static void main(String[] args) {
		
		TV tv = new TV("Mi", 10000, 9.0f, 'p', 8907654534l, "Lei jun",
				"WRGB", 456, 23789.0f, 8907654534l , "john logie",
				8907654534l , 123, "DTH", 10000, 8907654534l,
				"smart tv", "BPL", "Rajat sharma", "Ritu Dhawan", 568900,
				7899.0f, 'M', 8907654534l, "Sivakumaran",
				"Sony", 345, 8799.0f, 8907654534l,
				"J.L. Baird", 78899.0f, 8907654534l,"Chung ju yung",
				5999.0f, 8907654534l, "koo in hwoi");
		
                System.out.println(tv.toString());
                System.out.println(tv.hashCode());
	}

}
