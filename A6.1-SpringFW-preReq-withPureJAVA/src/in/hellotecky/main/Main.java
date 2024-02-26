package in.hellotecky.main;

import in.hellotecky.cards.PaymentProcess;

public class Main {

	public static void main(String[] args) {
		
		//composition style of code
		
		//startegic DP => prefer composition over inheritance
		PaymentProcess pp = new PaymentProcess();
		boolean status = pp.doThePayment("CreditCard", 10500.00);
		
		if (status) {
			System.out.println("Payment is success come again");
		} else {
			System.out.println("Payment failed! do again or PAY CASH");
		}
		
		
		}

}
