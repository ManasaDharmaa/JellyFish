class Train{
	
	public static void main(String[] args){
		
		float bengloreTicket = 90.5f;
		float belgaumTicket = 80.0f;
		float mysoreTicket = 70.60f;
		float mangloreTicket = 50.50f;
		float gadagTicket = 95.0f;
		
		
		float ticket [] = {bengloreTicket, belgaumTicket, mysoreTicket, mangloreTicket, gadagTicket};
		System.out.println("listed district : " + ticket.length);
		
		ticket[0] = 105.0f;
		
		for(int i=0; i<=4; i++){
			System.out.println("ticket cost of the district : " + ticket[i]);
		}
		
	}
}