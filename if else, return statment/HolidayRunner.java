class HolidayRunner{
	
	public static void main(String[] args){
		
		boolean festivalHoliday = Holiday.diwali( "31/oct/24" );
		System.out.println("the date of the diwali is : " + festivalHoliday);
		
		
		int daysOfHoliday = Holiday.summerHolidays(4);
		System.out.println("days of holiday : " + daysOfHoliday);
		
		
		String nameOfTheHoliday = Holiday.midterm(20);
		System.out.println("days of holidays : " + nameOfTheHoliday);
		
		
		
		char color = Holiday.ganeshaChaturthi("Pink");
		System.out.println("color of ganesha : " + color);
	}
}