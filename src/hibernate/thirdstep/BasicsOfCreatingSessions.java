package hibernate.thirdstep;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import hibernate.entity.Student;

public class BasicsOfCreatingSessions {

	public static void main(String[] args) {
		
		// create the SessionFactory object
		SessionFactory factory =
				new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Student.class)
				.buildSessionFactory();
		
		// create the Session
		Session session = factory.getCurrentSession();
		
		
		try {
			
			/* use the session object to perform various CRUD operations here */
			
		} finally {
			factory.close();
		}
	}

}
