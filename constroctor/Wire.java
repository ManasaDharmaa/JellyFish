class Wire{
	
	String brand;
	int meter;
	long customerCare;
	double price;
	float deliveryPrice;
	char color;
	boolean isPresent;
	
	
	public Wire(String brand, int meter, long customerCare, double price, float deliveryPrice, char color, boolean isPresent){
		
		this.brand = brand;
		this.meter = meter;
		this.customerCare = customerCare;
		this.price = price;
		this.deliveryPrice = deliveryPrice;
		this.color =color;
		this.isPresent = isPresent;
	}
	
	public String getBrand(){
		return brand;
	}
	public int getMeter(){
		return meter;
	}
	public long getCustomerCare(){
		return customerCare;
	}
	public double getPrice(){
		return price;
	}
	public float getDeliverPrice(){
		return deliveryPrice;
	}
	public char getColor(){
		return color;
	}
	public boolean isPresent(){
		return isPresent;
	}
}