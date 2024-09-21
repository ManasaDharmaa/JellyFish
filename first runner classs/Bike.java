class Bike{
	
	static int number;
	static char color;
	static byte tyre;
	static short petrol;
	static long  rpm;
	static float engineCc; 
	static double km;
	static boolean startStop;
	
	public static void main(String[] args){
		number = 7905;
		color = 'R';
		tyre = 2;
		petrol = 120;
		rpm = 12000l;
		engineCc = 199.3645f;
		km = 420.367681183d;
		startStop = false;
		
		System.out.println("Bike number : " + number);
		System.out.println("Bike color : " + color);
		System.out.println("Bike number of tyre : " + tyre);
		System.out.println("Bike petrol : " + petrol);
		System.out.println("Bike rpm : " + rpm);
		System.out.println("Bike engine CC : " + engineCc);
		System.out.println("Bike km : " + km);
		System.out.println("Bike start or stop : " + startStop);
	}
}