class Lab{
	
	String name;
	int totalSub;
	long systemNo;
	double price;
	float deliveryPrice;
	char color;
	boolean isPresent;
	
	
	public Lab(String name, int totalSub, long systemNo, double price, float deliveryPrice, char color, boolean isPresent){
		
		this.name = name;
		this.totalSub = totalSub;
		this.systemNo = systemNo;
		this.price = price;
		this.deliveryPrice = deliveryPrice;
		this.color =color;
		this.isPresent = isPresent;
	}
	
	public String getName(){
		return name;
	}
	public int getTotalSub(){
		return totalSub;
	}
	public long getSystemNo(){
		return systemNo;
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