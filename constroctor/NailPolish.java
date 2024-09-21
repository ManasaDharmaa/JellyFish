class NailPolish{
	
	
	String brand;
	int setOfbox;
	long customerCare;
	double price;
	float deliveryPrice;
	char color;
	boolean isPresent;
	
	
	public NailPolish(String brand, int setOfbox, long customerCare, double price, float deliveryPrice, char color, boolean isPresent){
		
		this.brand = brand;
		this.setOfbox = setOfbox;
		this.customerCare = customerCare;
		this.price = price;
		this.deliveryPrice = deliveryPrice;
		this.color =color;
		this.isPresent = isPresent;
	}
	
	public String getBrand(){
		return brand;
	}
	public int getSetOfbox(){
		return setOfbox;
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