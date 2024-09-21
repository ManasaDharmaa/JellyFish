class Coconut{
	
	public static void integerConverstion(){
		String price = "120";
		Integer cost = Integer.parseInt(price);
		System.out.println(cost);	
	}
	public static void byteConverstion(){
		String price = "12";
		Byte cost = Byte.parseByte(price);
		System.out.println(cost);	
	}
	public static void DoubleConverstion(){
		String price = "120";
		Double cost = Double.parseDouble(price);
		System.out.println(cost);	
	}
	
	
	
	public static void main(String [] args){
		integerConverstion();
		byteConverstion();
		DoubleConverstion();
	}
	 
	
}