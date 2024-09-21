class Cup{
	
	String brand = "Pigeon"; 
	int totalSetOfCup = 5;
	long customerCare = 9087673402l;
	char firstLetter = 'C';
	double price = 560.0d;
	float deliveryCost = 90.0f;
	boolean isLid = true;
	
	public void setBrand(String brand){
		System.out.println("before initializ : " + this.brand);
		this.brand = brand;
		System.out.println("after initializ : " + this.brand);
	}
	
	public void setTotalSetOfCup(int totalSetOfCup){
		System.out.println("before initializ : "+ this.totalSetOfCup);
		this.totalSetOfCup = totalSetOfCup;
		System.out.println("after initializ : " + this.totalSetOfCup);
	}
	
	public void setCustomerCare(long customerCare){
		System.out.println("before initializ : " + this.customerCare);
		this.customerCare = customerCare;
		System.out.println("after initializ : " + this.customerCare);
	}
	
	public void setFirstLetter(char firstLetter){
		System.out.println("before initializ : "+ this.firstLetter);
		this.firstLetter = firstLetter;
		System.out.println("after initializ : " + this.firstLetter);
	}
	
	public void setPrice(double price){
		System.out.println("before initializ : " + this.price);
		this.price = price;
		System.out.println("after initializ : "+ this.price);
	}
	
	public void setDeliveryCost(float deliveryCost){
		System.out.println("before initializ : "+ this.deliveryCost);
		this.deliveryCost = deliveryCost;
		System.out.println("after initializ : "+ this.deliveryCost);
	}
	
	public void setisLid(boolean isLid){
		System.out.println("before initializ : "+ this.isLid);
		this.isLid = isLid;
		System.out.println("after initializ : "+ this.isLid);
	}
	
	
	public String getbrand(){
		return brand;
	}
	public int getTotalSetOfCup(){
		return totalSetOfCup;
	}
	public long getCustomerCare(){
		return customerCare;
	}
	public char getFirstLetter(){
		return firstLetter;
	}
	public double getPrice(){
		return price;
	}
	public float getDeliveryCost(){
		return deliveryCost;
	}
	public boolean isLid(){
		return isLid;
	}	
}