class Library{
	static int book = 250;
	static int employee = 5;
	static int bookShelf = 15;
	static int table = 3;
	static int chairs = 12;
	
	static char ratingOfLibrary = 'A'; //Good
	static char silence = 'Y'; //Yes
	static char maintence = 'E'; //Excelent
	static char ratingOfEmployee = 'S'; //OutStanding
	static char digitalLibrary ='N'; //No 
	
	public static void main (String[] args){
		
		System.out.println("Number of the Book in Library : " + book);
		System.out.println("Number of the Employee in Library : " + employee);
		System.out.println("Number of the BookShalf in Library : " + bookShelf);
		System.out.println("Number of the Thable int Library : " + table);
		System.out.println("Number of the Chairs int Library : " + chairs);
		
		System.out.println("Rating of the Library : " + ratingOfLibrary );
		System.out.println("keep silencein Library  :" + silence );
		System.out.println("Maintence of the Library  :" + maintence );
		System.out.println("Rating of the Employee : " + ratingOfEmployee);
		System.out.println("In this library have a Digital Library : " + digitalLibrary );
		
	}
}