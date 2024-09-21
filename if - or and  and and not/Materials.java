class Materials{
	
	public static void gold(String element, int cost){
		
		if(element == "Chemical" && cost == 71945){    
			System.out.println("it is if condition");
		} else{
			System.out.println("it is else condition");
		}
		
		
		
		if (element == "Chemical" && cost == 71000){    
			System.out.println("it is if condition");
		} else {
			System.out.println("it is else condition");
		}
		
		
		
		if (element == "Natural" && cost == 71945){
			System.out.println("it is if condition");
		} else {
			System.out.println("it is else condition");
		}
		
		
		
		if (element == "Natural" && cost == 71000){
			System.out.println("it is if condition");
		} else {
			System.out.println("it is else condition");
		}
		
		
		
		if (element == "Chemical" || cost == 71945){
			System.out.println("it is if condition");
		} else {
			System.out.println ("it is else condition");
		}
		
		
		
		if(element == "Chemical" || cost == 71000){
			System.out.println("it is if condition");
		} else {
			System.out.println("it is else condition");
		}
		
		
		
		if(element == "Natural"  || cost == 71945){
			System.out.println("it is if condition");
		} else {
			System.out.println("it is else condition");
		}
		
		
		if(element == "Natural" || cost == 71000){
			System.out.println("it is if condition");
		} else {
			System.out.println("it is else condition");
		}
	}
}