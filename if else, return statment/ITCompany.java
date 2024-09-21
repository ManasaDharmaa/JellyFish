class  ITCompany{
	
	public static double adobe (char logo, String ceo){
		
		if (logo =='A' && ceo == "Shantanu Narayen"){
			return 20.766;
		} else {
			return 30.766;
		}
	}
	
	public static int amazon(String headquarters, String founder){
		
		if (headquarters == "Seattle" && founder == "Andy Jassy "){
			return 1525000;
		} else {
			return 2525000;
		}
	}
	
	public static String microsoft(String headquarters, int employees){
		
		if(headquarters == "United States" && employees == 221000){
			return "Bill Gates";
		} else {
			return "Paul Allen";
		}
	}
	
	public static double apple(String ceo, String coo){
		
		if (ceo == "Jeff Williams" && coo =="Tim Cook"){
			return 8004.1966;
		} else {
			return 800.040;
		}
	}
	
	
	public static boolean flipkart(String headquarters, String parentOrganization){
		
		if (headquarters == "Bengaluru" || parentOrganization == "Walmart"){
			return true;
		} else {
			return false;
		}
	}
	
	public static float google(String subsidiaries, String areaServed){
		
		if(subsidiaries == "YouTube" || areaServed == "National"){
			return 4467.00f;
		} else {
			return 6658.00f;
		}
	}
	
	public static String intel( String founder, int customerService ){
		
		if (founder == "Gordon Moore" ||customerService == 80042319){
			return "California";
		} else {
			return "United States";
		}
	}


	
	public static String salesforce(String ceo, String cfo, String clo, String cto){
		
		if(cfo == "Marc Benioff" || ceo == "Amy Weaver"){
			return cto;
		} else {
			return clo;
		}
	}
	
	
	
	
}