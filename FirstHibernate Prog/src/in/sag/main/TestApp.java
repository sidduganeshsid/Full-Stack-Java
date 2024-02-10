package in.sag.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import in.sag.model.Student;

public class TestApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. Inform JVM to activate HIBERNATE
		Configuration configuration = new Configuration();
		configuration.configure();
		
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		
		
		// 2. Create Persistance object
		Student std = new Student();
		std.setSid(1);
		std.setSname("sidduganesh");
		std.setSaddress("vattinagullapalli, Hyderabad, Telangana");
		std.setSage(22);
		
		// 2. Perform persistance operation using the Entity / Model/Pojo object
		session.save(std);

	}

}
