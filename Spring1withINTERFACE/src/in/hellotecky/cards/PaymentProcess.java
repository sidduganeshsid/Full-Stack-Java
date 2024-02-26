package in.hellotecky.cards;

public class PaymentProcess {
	
	//field Injection 
	private ICards paymentCard = null; //new CreditCard();
	
	//Constructor Injection
	public PaymentProcess(ICards paymentCard){
		this.paymentCard = paymentCard;
	}
	
	
	  //setter Injection 
		/*
		 * public void setPayment(ICards paymentCard) { this.paymentCard = paymentCard;
		 * }
		 */
	 
									
	public boolean doThePayment(Double billAmount) {
		
		return paymentCard.payingBill(billAmount);
	}
}
