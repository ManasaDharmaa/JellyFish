class JewelleryRunner{


    public static void main(String [] args){
		
		Jewellery.setJewelleryType("Necklace");
		Jewellery.setPrice(2180399);
		Jewellery.setGrossWeigth(280.330d);
		Jewellery.setMetalWeight(245.010f);
		Jewellery.setPurity('A');
		Jewellery.setCustomerCare(18001219076l);
		Jewellery.setIsJewelleryPresent(true);
		
		
		System.out.println("Type of jeweller name : " + Jewellery.getJewelleryType());
		System.out.println("jeweller price : " + Jewellery.getPrice());
		System.out.println("jeweller Gross Weigth : " + Jewellery.getGrossWeigth());
		System.out.println("jeweller MetalWeight : " + Jewellery.getMetalWeight());
		System.out.println("jeweller Purity : " + Jewellery.getPurity());
		System.out.println("jeweller Customer Care number : " + Jewellery.getCustomerCare());
		System.out.println("Jewellery is Present : " + Jewellery.isJewelleryPresent());


    }



}