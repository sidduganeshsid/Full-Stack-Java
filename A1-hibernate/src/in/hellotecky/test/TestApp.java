package in.hellotecky.test;




import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import in.hellotecky.model.Student;

public class TestApp {

	public static void main(String[] args) {
		
		//1. inform the JVM to activate the hibernate
		Configuration configuration = new Configuration();
		configuration.configure();
		
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session openSession = sessionFactory.openSession();
		
		Transaction beginTransaction = openSession.beginTransaction();
		
		
		//2 create the persistance object
		Student std = new Student();
		std.setSid(4);
		std.setSname("Jyothi");
		std.setSage(38);
		std.setSaddress("rangampet,warangal");
		
		//3 perform the operation
		openSession.save(std);
		
		beginTransaction.commit();
		System.out.println("Object saved in db...");

	}

}
