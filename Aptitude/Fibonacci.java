class Fibonacci{
	
	
	public static void main(String [] args){
		
		int numA = 0;
		int numB = 1;
		int fibo;
		int count = 100;
		
		System.out.println(numA + " " + numB);
		
		for (int i=2; i<count; i++ ){
			fibo = numA + numB;
			System.out.println("" + fibo);
			numA = numB;
			numB = fibo;
		}
		
		
	}
}