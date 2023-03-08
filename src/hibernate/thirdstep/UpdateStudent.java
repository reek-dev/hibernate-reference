/*
 * This demonstrates the create operation 
 */

package hibernate.thirdstep;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import hibernate.entity.Student;

public class UpdateStudent {

	private static SessionFactory factory;
	private static Session session;

	public static void main(String[] args) {

		// create the SessionFactory object
		factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class)
				.buildSessionFactory();

		try {

			/* use the session object to perform various CRUD operations here */

			// update student: change email address of one student
			session = factory.getCurrentSession();
			session.beginTransaction();
			Student student = session.get(Student.class, 16);
			student.setFirstName("Atanu");
			session.getTransaction().commit();
			System.out.println("\n\nDONE.");

			// update student: change email addresses of all students
			session = factory.getCurrentSession();
			session.beginTransaction();
			session.createQuery("update Student set email = 'foo@bar.com'").executeUpdate();
			session.getTransaction().commit();
			System.out.println("\n\nDONE.");

		} finally {
			factory.close();
		}
	}

}
