package in.hellotecky.cards;

public class CreditCard implements ICards{

	public boolean payingBill(Double billAmount) {
		System.out.println("Paying the bill using the CreditCard -> bill : "+billAmount);
		return true;
	}
}
