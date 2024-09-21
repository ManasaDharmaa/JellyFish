class EyeLiner{
	
	static int cost; 
	
	public static void brandName(String EyeLinerBrandName){
		
		switch(EyeLinerBrandName){
			
			case "Lakme" :
			cost = 1500;
			break;
			
			case "Maybelline New York" :
			cost = 1800;
			break;
			
			case "Plum" :
			cost = 800;
			break;
			
			case "L'Oreal Paris" :
			cost = 2500;
			break;
			
			case "Nykaa Cosmetics" :
			cost = 1200;
			break;
			
			case "Kay Beauty" :
			cost = 900;
			break;
			
			case "Swiss Beauty" :
			cost = 1000;
			break;
			
			case "M.A.C" :
			cost = 3000;
			break;
			
			case "Avon" :
			cost = 600;
			break;
			
			case "Rimmel Scandal eyes" :
			cost = 700;
			break;
			
			default :
			cost = 0;
			break;
		}
		
		System.out.println("the cost of this eyeLiner : " + cost);
	}
	
	
}