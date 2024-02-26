package in.hellotecky.main;

import in.hellotecky.cards.CreditCard;
import in.hellotecky.cards.PaymentProcess;

public class Main {

	public static void main(String[] args) {
		
		//composition style of code

		//strategy DP => code to interface instead of concrete implementation.
		
		//behavioural DP = algorithm changes at the runtime without effecting the application
		//behavioural DP => during the runtime it is passed
		PaymentProcess pp = new PaymentProcess(new CreditCard());
		
		boolean status = pp.doThePayment(5500.00);
		if (status) {
			System.out.println("Payment is success come again");
		} else {
			System.out.println("Payment failed! do again or PAY CASH");
		}
		
		
		}

}
