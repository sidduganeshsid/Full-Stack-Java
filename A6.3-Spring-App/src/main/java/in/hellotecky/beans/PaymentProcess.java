package in.hellotecky.beans;

//Target Class    
public class PaymentProcess {
	private IPay pay;
	
	public PaymentProcess()
	{
//		this.pay=pay;
		System.out.println("PP object is creating");
	}
	
//	public PaymentProcess(IPay pay)
//	{
//		this.pay=pay;
//		System.out.println("PP object is creating");
//	}
	
	//setter injection
	public void setPay(IPay pay)
	{
		System.out.println("setter is called");
		this.pay=pay;
	}
	
	public void doPayment(Double amt)
	{
		boolean paymentDone=pay.payBill(amt);
		
		if(paymentDone)
		{
			System.out.println("Payment success");
		}
		else
		{
			System.out.println("Payment failed");
		}
	}
}
