class Collage{
	
	public static void main(String [] args){
		
		int standard = 10;
		int faculty = 15;
		int students = 475;
		int code = 4;
		int workers = 5;
		
		
		int[] totalInteger = {standard, faculty, students, code, workers};
		System.out.println("the length of the integer : " + totalInteger.length);
		
		
		for(int i=0; i<=4; i++){
			System.out.println(totalInteger[i]);
		}
		
		
	}
}