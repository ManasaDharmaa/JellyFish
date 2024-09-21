class WatchRunner{
	
	public static void main(String[] args){
		
		Watch.setBrandName("Diesel");
		Watch.setHSNCode(91021100);
		Watch.setPrice(33995.00f);
		Watch.setStrapWidth(28.0d);
		Watch.setCaseColor('G');
		Watch.setUPC(698615148332l);
		Watch.setIsWatchPresent(true);
		
		System.out.println("brand name : " + Watch.getBrandName());
		System.out.println("HSN code : " + Watch.getHSNCode());
		System.out.println("price : " + Watch.getPrice());
		System.out.println("Strap width : " + Watch.getStrapWidth());
		System.out.println("Case Color : " + Watch.getCaseColor());
		System.out.println("UPC : " + Watch.getUPC());
		System.out.println("The Watch is Present : " + Watch.isWatchPresent());
	}
}