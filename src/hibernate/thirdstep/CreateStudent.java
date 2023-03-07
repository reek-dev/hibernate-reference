/*
 * This demonstrates the create operation 
 */

package hibernate.thirdstep;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import hibernate.secondstep.Student;

public class CreateStudent {

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
			
			// create the Student object
			System.out.println("creating a new Student object");
			Student student = new Student("Reekdev", "Ray", "ray.reekdev@gmail.com");
			
			// start a transaction
			session.beginTransaction();
			
			// save the Student object
			System.out.println("saving the Student");
			session.save(student);
			
			// commit the current transaction
			session.getTransaction().commit();
			System.out.println("create successful.");
			
		} finally {
			factory.close();
		}
	}

}
