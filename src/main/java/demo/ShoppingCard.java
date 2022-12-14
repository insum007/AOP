package demo;

import org.springframework.stereotype.Component;

@Component
public class ShoppingCard {
	
	public void checkOut(String status) {
		
		//Logging
		//Authentication & Authorization
		//Sanitize Data
		System.out.println("checkout method call from ShoppingCard");
	}
	
	public int quantity() {
		return 2;
	}

}
