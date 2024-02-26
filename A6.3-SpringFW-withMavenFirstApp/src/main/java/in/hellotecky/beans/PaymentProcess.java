package in.hellotecky.beans;

public class PaymentProcess {
	
	private IPay pay;

	public PaymentProcess(IPay pay) {
		System.out.println("Payment Process object is created");
		
		this.pay = pay;
	}
	
	public void setPay(IPay pay) {
		System.out.println("setter is called");
		this.pay = pay;
	}
	
	public void doPayment(Double amt) {
		boolean paymentDone = pay.payingBill(amt);
		
		if (paymentDone) {
			System.out.println("Payment success");
		} else {
			System.out.println("Payment Failure");
		}
	}
	
	
	
	
}
