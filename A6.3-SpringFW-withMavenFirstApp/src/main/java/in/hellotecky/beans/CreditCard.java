package in.hellotecky.beans;

public class CreditCard implements IPay {

	public CreditCard() {
		System.out.println("Credit Card obj is created by the IOC");
	}
	
	@Override
	public boolean payingBill(Double amt) {
		System.out.println("Paid throught the credit card -> bill : "+amt);
		return true;
	}

}
