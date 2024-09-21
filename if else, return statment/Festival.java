class Festival{
	
	public static int diwali (String date, String speciality){
		
		if (date == "31/oct/24" && speciality == "lights"){
			return 3;
		} else {
			return 2;
		}
	}
	
	public static boolean holi(String speciality, String date){
		
		if (speciality == "colors" && date == "14/3/25"){
			return true;
		} else {
			return false;
		}
	}
	
	public static String onam(String speciality, String date){
		
		if(speciality == "flowers" && date == "29/aug/23"){
			return "kerala";
		} else {
			return "king mahabali";
		}
	}
	
	public static double janmashtami(String speciality, String date){
		
		if (speciality == "butter" && date =="30/aug/23"){
			return 84.196;
		} else {
			return 80.040;
		}
	}
	
	
	
	
	
	public static int dussehra (String god, String state){
		
		if (god == "chamundeshwari" || state == "karnataka"){
			return 3;
		} else {
			return 2;
		}
	}
	
	public static boolean durgaPuja(String god, String state){
		
		if (god == "durga" || state == "kerala"){
			return true;
		} else {
			return false;
		}
	}
	
	public static String makarSankranthi(String state, String date){
		
		if(state == "karnataka" || date == "15/jan/23"){
			return "Pongal";
		} else {
			return "sankranthi";
		}
	}
	
	public static double eid(String speciality, String date){
		
		if (speciality == "moon" && date =="31/mar/23"){
			return 84.196;
		} else {
			return 80.040;
		}
	}
	
	
}