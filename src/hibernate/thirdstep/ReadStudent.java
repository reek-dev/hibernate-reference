/*
 * This demonstrates the create operation 
 */

package hibernate.thirdstep;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import hibernate.entity.Student;

public class ReadStudent {

	public static void main(String[] args) {

		// create the SessionFactory object
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class)
				.buildSessionFactory();

		// create the Session
		Session session = factory.getCurrentSession();

		try {

			/* use the session object to perform various CRUD operations here */

			// create a new student
			Student student1 = new Student("Rahul", "Singh", "rahulg021@gmail.com");

			// start transaction no. 1
			session.beginTransaction();

			// save the student
			session.save(student1);

			// commit the current transaction
			session.getTransaction().commit();
			System.out.println("create successful.");

			// create a new session
			session = factory.getCurrentSession();

			// start transaction no. 2
			session.beginTransaction();

			Student student2 = session.get(Student.class, student1.getId());

			System.out.println("found the student");
			System.out.println(student2);

			// commit the current transaction
			session.getTransaction().commit();
			System.out.println("retrieve successful.");

		} finally {
			factory.close();
		}
	}

}
