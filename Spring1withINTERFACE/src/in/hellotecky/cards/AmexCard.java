package in.hellotecky.cards;

public class AmexCard implements ICards{
	
	public boolean payingBill(Double billAmount) {
		System.out.println("Paying the bill using the AmexCard -> bill : "+billAmount);
		return true;
	}

}
