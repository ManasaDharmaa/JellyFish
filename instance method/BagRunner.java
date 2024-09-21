class BagRunner{
	
	
	public static void main(String[] args){
		
		Bag bag = new Bag();
		
		bag.bagDetails("Lavie", 3, 9807654329l, 'L', true, 2000.0d, 5.3f);
		
		System.out.println("bag Brand Name : " +bag.brndName("Coach"));
		System.out.println("compartment Number : "+bag.compartmentNo(4));
		System.out.println("bag brand custumer care: "+bag.brandCustomerCare(9807652341l));
		System.out.println("bag size : " +bag.siz('M'));
		System.out.println("present : "+bag.bagisOnlieDeliveryPresent(false));
		System.out.println("bag price : "+bag.bagPrice(1500.0d));
		System.out.println("bag rating : "+bag.rating(4.0f));
		
		
	}



}