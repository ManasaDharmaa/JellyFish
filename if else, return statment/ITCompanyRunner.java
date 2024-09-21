class ITCompanyRunner{
	
	public static void main (String [] args){
		
		System.out.println("Adobe net worth " + ITCompany.adobe('A', "Shantanu Narayen"));
		
		System.out.println("Numbers of emplyees in 2023 " + ITCompany.amazon("Seattle", " Jeff Bezos")); 
		
		System.out.println("the founder of microsoft " + ITCompany.microsoft("Redmond", 221000));
		
		System.out.println("Apple " + ITCompany.apple("Tim Cook", "Jeff Williams"));
		
		
		System.out.println("this is flipkart " + ITCompany.flipkart("Bengaluru", "Walmart"));
		
		System.out.println("The Google" + ITCompany.google("YouTube", "International"));
		
		System.out.println("intal " + ITCompany.intel("Robert Noyce" ,  80042319));
		
		System.out.println("Sales Force " + ITCompany.salesforce("Marc Benioff", "Amy Weaver", "Juan Perez", "Parker Harris"));
	
	}
}