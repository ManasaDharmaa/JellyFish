class CupRunner{
	
	
	public static void main(String[] args){
		
		Cup cup = new Cup();
		
		cup.setBrand("Stanley");
		cup.setTotalSetOfCup(1);
		cup.setCustomerCare(9807659872l);
		cup.setFirstLetter('P');
		cup.setPrice(2500.0d);
		cup.setDeliveryCost(50.0f);
		cup.setisLid(false);
		
		System.out.println(cup.getbrand());
		System.out.println(cup.getTotalSetOfCup());
		System.out.println(cup.getCustomerCare());
		System.out.println(cup.getFirstLetter());
		System.out.println(cup.getPrice());
		System.out.println(cup.getDeliveryCost());
		System.out.println(cup.isLid());
	}
}