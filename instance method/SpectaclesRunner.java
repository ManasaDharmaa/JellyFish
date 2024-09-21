class SpectaclesRunner{
	
	
	public static void main(String[] args){
		
		Spectacles spectacles = new Spectacles();
		
		spectacles.specDetails("Prada", 9807654329l, 'L', true, 2000.0d, 4.0f);
		
		System.out.println("spectacles Brand Name : " +spectacles.brandName("Prada"));
		System.out.println("spectacles brand custumer care: "+spectacles.CustomerCare(9807652341l));
		System.out.println("spectacles size : " +spectacles.siz('M'));
		System.out.println("present : "+spectacles.isOnlieDeliveryPresent(false));
		System.out.println("spectacles price : "+spectacles.Price(5500.0d));
		System.out.println("spectacles rating : "+spectacles.rating(4.3f));
		
		
	}
}