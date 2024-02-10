package in.hello.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import in.hello.model.Student;

public class TestApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration configuration = new Configuration();
		configuration.configure();
		
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session openSession = sessionFactory.openSession();
		
		Student std = new Student();
		
		std.setSid(1);
		std.setSname("sidduganesh");
		std.setSaddress("Hyd, Telangana");
		std.setSage(29);
		
		
		openSession.save(std);
	}

}
