class Horse{
	
	
	String name = "Horse"; 
	int legs = 4;
	long tail = 1;
	char firstLetter = 'H';
	double poil = 2.0f;
	float hoof = 4.0f;
	boolean islive = true;
	
	public void setName(String name){
		System.out.println("before initializ : " + this.name);
		this.name = name;
		System.out.println("after initializ : " + this.name);
	}
	
	public void setLegs(int legs){
		System.out.println("before initializ : "+ this.legs);
		this.legs = legs;
		System.out.println("after initializ : " + this.legs);
	}
	
	public void setTail(long tail){
		System.out.println("before initializ : " + this.tail);
		this.tail = tail;
		System.out.println("after initializ : " + this.tail);
	}
	
	public void setFirstLetter(char firstLetter){
		System.out.println("before initializ : "+ this.firstLetter);
		this.firstLetter = firstLetter;
		System.out.println("after initializ : " + this.firstLetter);
	}
	
	public void setPoil(double poil){
		System.out.println("before initializ : " + this.poil);
		this.poil = poil;
		System.out.println("after initializ : "+ this.poil);
	}
	
	public void setHoof(float hoof){
		System.out.println("before initializ : "+ this.hoof);
		this.hoof = hoof;
		System.out.println("after initializ : "+ this.hoof);
	}
	
	public void setIslive(boolean islive){
		System.out.println("before initializ : "+ this.islive);
		this.islive = islive;
		System.out.println("after initializ : "+ this.islive);
	}
	
	
	public String getName(){
		return name;
	}
	public int getLegs(){
		return legs;
	}
	public long getTail(){
		return tail;
	}
	public char getFirstLetter(){
		return firstLetter;
	}
	public double getPoil(){
		return poil;
	}
	public float getHoof(){
		return hoof;
	}
	public boolean islive(){
		return islive;
	}	
}