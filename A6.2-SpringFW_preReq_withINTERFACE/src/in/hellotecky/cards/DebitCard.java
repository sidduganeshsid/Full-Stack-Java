package in.hellotecky.cards;

public class DebitCard implements ICards{

	public boolean payingBill(Double billAmount) {
		System.out.println("Paying the bill using the DebitCard -> bill : "+billAmount);
		return true;
	}
}
