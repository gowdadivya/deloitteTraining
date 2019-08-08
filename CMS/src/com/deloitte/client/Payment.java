package com.deloitte.client;

public class Payment {
	static Payment payment = new Payment();
	
	//make constructor as private
	private Payment() {
		System.out.println("Object of Payment created");
	}
		
	public void pay(int amount) {
		System.out.println("Payment done of INR : "+amount);
	}

	 static Payment getPayment() {
		
		return payment;
	}

}
