class Temple{

    public static void main(String[] args){
		
		
		char iskon = 'I';
		char tirupati = 'T';
		char shabarimalai = 'S';
		char chamundiBeta = 'C';
		char purdamma = 'P';
		
		char [] temple = {iskon, tirupati, shabarimalai, chamundiBeta, purdamma};
		System.out.println("total length of the char : " + temple.length);
		
		temple[2] = 'I';
		
		for(int i=0; i<=4; i++){
			System.out.println("The first letter of the temple is : " + temple[i]);
		}
 
    }
}