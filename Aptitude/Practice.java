
import java.util.Scanner;

public class Practice {
	
	public static void main (String [] args){
	
	Scanner sc = new Scanner(System.in);
	

	int a = sc.nextInt();
	
	String b = (a >= 18) ? "Eligible": "not eligible";
	
	System.out.println(b);
	}
}