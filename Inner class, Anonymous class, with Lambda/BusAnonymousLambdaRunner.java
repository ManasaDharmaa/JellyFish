package com.xworkz.stand.runner;

import com.xworkz.stand.boot.Bus;
import com.xworkz.stand.boot.BusAnonymousLambda;

public class BusAnonymousLambdaRunner {
	
	public static void main(String[] args) {

		BusAnonymousLambda anonymousLambda= (s)->System.out.println(s);
		
		anonymousLambda.stand("Rajajinagar");
	}

}
