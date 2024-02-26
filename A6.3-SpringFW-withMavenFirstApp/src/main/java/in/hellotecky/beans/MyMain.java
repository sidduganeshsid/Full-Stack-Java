package in.hellotecky.beans;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//import org.springframework.context.annotation.ClassPathBeanDefinitionScanner;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class MyMain {

	public static void main(String[] args) {
		
		//old approach now it's depretrecated but working is SpringFW 5
//		Resource resource =  new ClassPathResource("Beans.xml");
//		BeanFactory factory  = new XmlBeanFactory(resource);
//			//object is created and maintained by spring IOC
//			factory.getBean("credit", CreditCard.class);
			
		//new approach
		ApplicationContext factory = new ClassPathXmlApplicationContext("Beans.xml");
		factory.getBean("debit", DebitCard.class); //comment and uncomment 
		
		PaymentProcess process = factory.getBean("paying", PaymentProcess.class);
		System.out.println("able to get the object");
		process.doPayment(15500.00);
		
		
		
	}

}
