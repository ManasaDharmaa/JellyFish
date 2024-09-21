class RefrigeratorRunner{
	
	public static void main(String [] args){
		
		
		Refrigerator.setBrandName("Godrej 564L");
		Refrigerator.setPrice(59990);
		Refrigerator.setCustomerCareNumber(18002095511l);
		Refrigerator.setEMI(4999.17f);
		Refrigerator.setCapacity(216.5d);
		Refrigerator.setColor('B');
		Refrigerator.setIsRefrigeratorPresent(true);
		
		
		System.out.println("The brand name : " + Refrigerator.getBrandName());
		System.out.println("the price of the refrigerator : " + Refrigerator.getPrice());
		System.out.println("customer care number : " +Refrigerator.getCustomerCareNumber());
		System.out.println("the EMI payment : " +Refrigerator.getEMI());
		System.out.println("the capacity of the refrigerator : " + Refrigerator.getCapacity());
		System.out.println("the color of the refrigerator : "+Refrigerator.getColor());
		System.out.println("the refrigerator is present : " +Refrigerator.isRefrigeratorPresent());
		
	}

}