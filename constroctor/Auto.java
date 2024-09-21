class Auto{
	
	String material;
	int wheel;
	long customerCare;
	double price;
	float deliveryPrice;
	char color;
	boolean isReturnable;
	
	
	public Auto(String material, int wheel, long customerCare, double price, float deliveryPrice, char color, boolean isReturnable){
		
		this.material = material;
		this.wheel = wheel;
		this.customerCare = customerCare;
		this.price = price;
		this.deliveryPrice = deliveryPrice;
		this.color =color;
		this.isReturnable = isReturnable;
	}
	
	public String getMaterial(){
		return material;
	}
	public int getWheel(){
		return wheel;
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
	public boolean isReturnable(){
		return isReturnable;
	}
	
}