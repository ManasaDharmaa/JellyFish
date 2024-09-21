class XWorks{
	
	static int students;
	static char logoColor;
	static byte floor;
	static short faculty;
	static long  chair;
	static float hour; 
	static double fee;
	static boolean openClose;
	
	public static void main(String[] args){
		students = 7905;
		logoColor = 'O';
		floor = 1;
		faculty = 10;
		chair = 1436727l;
		hour = 2.30f;
		fee = 25000.6667779d;
		openClose = true;
		
		System.out.println("x-Works Students : " + students);
		System.out.println("x-Works logo Color : " + logoColor);
		System.out.println("x-Works office in : " + floor);
		System.out.println("x-Works faculty : " + faculty);
		System.out.println("x-Works chair : " + chair);
		System.out.println("x-Works class hour : " + hour);
		System.out.println("x-Works students paying fee : " + fee);
		System.out.println("x-Works is open and close : " + openClose);
	}
}