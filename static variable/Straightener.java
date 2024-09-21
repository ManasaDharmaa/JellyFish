class Straightener{
	static int weight;
	static char color;
	static byte garantee;
	static short wattage;
	static long  price;
	static float netQuantity; 
	static double rating;
	static boolean onOff;
	
	public static void main(String[] args){
		weight = 920;
		color = 'B';
		garantee = 12;
		wattage = 1000;
		price = 1999l;
		netQuantity = 1.455f;
		rating = 4.55555d;
		onOff = true;
		
		System.out.println("Straightener weight : " + weight);
		System.out.println("Straightener color : " + color);
		System.out.println("Straightener garantee : " + garantee);
		System.out.println("Straightener wattage : " + wattage);
		System.out.println("Straightener price : " + price);
		System.out.println("Straightener net Quantity : " + netQuantity);
		System.out.println("Straightener rating : " + rating);
		System.out.println("Straightener on or off : " + onOff);
	}
}