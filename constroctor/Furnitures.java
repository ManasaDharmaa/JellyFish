class Furnitures{
	
	String name;
	int seater;
	long customerCare;
	double price;
	float deliveryPrice;
	char color;
	boolean isFourSeater;
	
	
	public Furnitures(String name, int seater, long customerCare, double price, float deliveryPrice, char color, boolean isFourSeater){
		
		this.name = name;
		this.seater = seater;
		this.customerCare = customerCare;
		this.price = price;
		this.deliveryPrice = deliveryPrice;
		this.color =color;
		this.isFourSeater = isFourSeater;
	}
	
	public String getName(){
		return name;
	}
	public int getSeater(){
		return seater;
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
	public boolean isFourSeater(){
		return isFourSeater;
	}

}