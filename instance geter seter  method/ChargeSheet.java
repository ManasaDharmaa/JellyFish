class ChargeSheet{
	
	String meaning = "police officer records the details"; 
	int section = 173;
	long underSubSection = 2;
	char crpc = 'C';
	double act = 1985.0d;
	float cost = 300.0f;
	boolean isSubmitted = true;
	
	public void setMeaning(String meaning){
		System.out.println("before initializ : " + this.meaning);
		this.meaning = meaning;
		System.out.println("after initializ : " + this.meaning);
	}
	
	public void setSection(int section){
		System.out.println("before initializ : "+ this.section);
		this.section = section;
		System.out.println("after initializ : " + this.section);
	}
	
	public void setUnderSubSection(long underSubSection){
		System.out.println("before initializ : " + this.underSubSection);
		this.underSubSection = underSubSection;
		System.out.println("after initializ : " + this.underSubSection);
	}
	
	public void setCrPC(char crpc){
		System.out.println("before initializ : "+ this.crpc);
		this.crpc = crpc;
		System.out.println("after initializ : " + this.crpc);
	}
	
	public void setAct(double act){
		System.out.println("before initializ : " + this.act);
		this.act = act;
		System.out.println("after initializ : "+ this.act);
	}
	
	public void setCost(float cost){
		System.out.println("before initializ : "+ this.cost);
		this.cost = cost;
		System.out.println("after initializ : "+ this.cost);
	}
	
	public void setIsSubmitted(boolean isSubmitted){
		System.out.println("before initializ : "+ this.isSubmitted);
		this.isSubmitted = isSubmitted;
		System.out.println("after initializ : "+ this.isSubmitted);
	}
	
	
	public String getMeaning(){
		return meaning;
	}
	public int getSection(){
		return section;
	}
	public long getUnderSubSection(){
		return underSubSection;
	}
	public char getCrPC(){
		return crpc;
	}
	public double getAct(){
		return act;
	}
	public float getCost(){
		return cost;
	}
	public boolean isSubmitted(){
		return isSubmitted;
	}	
}