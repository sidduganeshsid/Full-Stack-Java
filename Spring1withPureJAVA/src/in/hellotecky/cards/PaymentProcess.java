package in.hellotecky.cards;

public class PaymentProcess {
									//code smell is the unused  //long CardNumber
	public boolean doThePayment(String cardType, Double billAmount) {
		if("CreditCard".equals(cardType)) {
			CreditCard cc = new CreditCard();
			return cc.payingBill(billAmount);
		}
		else if("AmexCard".equals(cardType)) {
			AmexCard ac = new AmexCard();
			return ac.payingBill(billAmount);
			
		}
		
		//cardTye.equals("AmexCard") this leads to null pointer exception.(not good approach)
		else if("DebitCard".equals(cardType)) {
			DebitCard dc = new DebitCard();
			dc.payingBill(billAmount);
			
		}
		else {
			
			return false;
		}
		return true;
	}
}
