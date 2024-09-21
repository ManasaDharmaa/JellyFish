class Govt{
	
	
	public static void parliment(int types, char headOfTheParliment ){
		
		
		if (types == 3 && headOfTheParliment == 'P'){
			System.out.println("it is if condition");
		} else {
			System.out.println("it is else contion");
		}
		
		
		if (types == 3 && headOfTheParliment == 'M'){
			System.out.println("it is if condition");
		} else {
			System.out.println("it is else condition");
		}
		
		
		if (types == 2 && headOfTheParliment == 'P'){
			System.out.println("it is if condition");
		} else {
			System.out.println ("it is else condition");
		}
		
		
		if (types == 2 && headOfTheParliment == 'M'){
			System.out.println("it is if condition");
		} else {
			System.out.println("it is else condition");
		}
		
		
		if (types == 3 || headOfTheParliment == 'P'){
			System.out.println("it is if condition");
		} else {
			System.out.println("it is else contion");
		}
		
		
		if (types == 3 || headOfTheParliment == 'M'){
			System.out.println("it is if condition");
		} else {
			System.out.println("it is else condition");
		}
		
		
		if (types == 2 || headOfTheParliment == 'P'){
			System.out.println("it is if condition");
		} else {
			System.out.println ("it is else condition");
		}
		
		
		if (types == 2 || headOfTheParliment == 'M'){
			System.out.println("it is if condition");
		} else {
			System.out.println("it is else condition");
		}
	}
}