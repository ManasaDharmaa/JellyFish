import java.util.Scanner;

class Factorial{
	
	public static void main(String [] args){
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int facto = 1;
		
		for(int i=1; i<=num;  i++){
		 facto =facto*i;
		}
		System.out.println(facto);
	}
	
	
	
}