package in.hellotecky.beans;

import org.springframework.core.io.ClassPathResource;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.Resource;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;

public class MyMain {

	public static void main(String[] args) {
		//old approach 
//		Resource res = new ClassPathResource("Beans.xml");
//		BeanFactory bf = new XmlBeanFactory(res);
//		bf.getBean("credit",CreditCardPay.class);
		
		//present approach
//		ApplicationContext appc = new ClassPathXmlApplicationContext("Beans.xml");
//			// bean id , object creating class name.
//		appc.getBean("credit",CreditCardPay.class);
		
ApplicationContext factory=new ClassPathXmlApplicationContext("Beans.xml");
		
		factory.getBean("credit", CreditCardPay.class);
//		
//		
		PaymentProcess process=factory.getBean("paying", PaymentProcess.class);
		System.out.println("able to get the object");
		process.doPayment(100.0);
				
	}

}
