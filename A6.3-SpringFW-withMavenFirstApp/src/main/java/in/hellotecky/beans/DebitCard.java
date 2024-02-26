package in.hellotecky.beans;

public class DebitCard implements IPay {
	
	public DebitCard() {
		System.out.println("Debit Card obj is created by the IOC");
	}

	@Override
	public boolean payingBill(Double amt) {
		// TODO Auto-generated method stub
		System.out.println("Paid throught the debit card -> bill : "+amt);
		return true;
	}

}
