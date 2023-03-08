/*
 * This demonstrates the create operation 
 */

package hibernate.thirdstep;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import hibernate.entity.Student;

public class DeleteStudent {
	
	private static SessionFactory factory;
	private static Session session;

	public static void main(String[] args) {

		// create the SessionFactory object
		factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class)
				.buildSessionFactory();

		try {

			/* use the session object to perform various CRUD operations here */

			// delete student: delete one student
			session = factory.getCurrentSession();
			session.beginTransaction();
			Student student = session.get(Student.class, 16);
			session.delete(student);
			session.getTransaction().commit();
			System.out.println("\n\nDONE.");

			// delete student: delete multiple students
			session = factory.getCurrentSession();
			session.beginTransaction();
			session.createQuery("delete from Student where id=9").executeUpdate();
			session.getTransaction().commit();
			System.out.println("\n\nDONE.");

		} finally {
			factory.close();
		}
	}

}
