package com.deloitte.client;

public class PaymentClient {
	public static void main(String[] args) {
		Payment payment1 = Payment.getPayment();
		Payment payment2 = Payment.getPayment();
		Payment payment3 = Payment.getPayment();
		
		payment1.pay(4500);
		payment2.pay(6500);
		payment3.pay(7500);
	}
}
