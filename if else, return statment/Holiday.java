class Holiday{
	
	public static boolean diwali(String date ){
		
		if(date == "31/oct/24"){
			return true;
		} else {
			return false;
		}
	}
	
	
	
	public static int summerHolidays(int month){
		
		if(month == 4){
			return 15;
		} else {
			return 30;
		}
	}
	
	
	
	public static String midterm(int daysOfHoliday){
		
		if(daysOfHoliday == 15){
			return "dasara Holiday";
		} else {
			return "Summer Holiday";
		}
	}
	
	
	
	public static char ganeshaChaturthi(String colorofGaneshji){
		
		if(colorofGaneshji == "Pink"){
			return 'B';
		} else {
			return 'R';
		}
	}
}