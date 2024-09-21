class ChatsRunner{
	
	
	public static void main(String [] args){
		
		
		Chats.panipuri(30);
		
		System.out.println(" chat Name :" + Chats.chatsName("vadapav"));
		
		System.out.println("Gobi cost : " + Chats.gobi(20, 2));
		
		System.out.println("masala cost : " + Chats.masala(5, 40, 1));
		
		System.out.println("dahipuri cost : " + Chats.dahipuri("puri", 50, 5, 1));
		
		System.out.println("bhelpuri : " + Chats.bhelpuri(3, 150,  "puri", "onion", "tomato"));
		
		System.out.println("vadapav : " + Chats.vadapav("gram", "potatoes", "garlic", "gree chili", "mustard seeds", "curry leaves"));
		
		
	}
}