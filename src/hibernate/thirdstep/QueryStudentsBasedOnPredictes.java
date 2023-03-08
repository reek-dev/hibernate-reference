/*
 * This demonstrates the create operation 
 */

package hibernate.thirdstep;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import hibernate.entity.Student;

public class QueryStudentsBasedOnPredictes {

	public static void main(String[] args) {

		// create the SessionFactory object
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class)
				.buildSessionFactory();

		// create the Session
		Session session = factory.getCurrentSession();

		try {

			/* use the session object to perform various CRUD operations here */

			// start a transaction
			session.beginTransaction();

			/* ---------------------------------------------------- */

			// query students: all students, no condition
			List<Student> theStudents = session.createQuery("from Student").getResultList();

			// display the students
			System.out.println("\n\nquery no. 1");
			for (Student student : theStudents)
				System.out.println(student);

			/* ---------------------------------------------------- */

			// query students: lastName = 'Ray'
			theStudents = session.createQuery("from Student s where s.lastName = 'Singh'").getResultList();

			// display the students
			System.out.println("\n\nquery no. 2");
			for (Student student : theStudents)
				System.out.println(student);

			/* ---------------------------------------------------- */

			// query students: lastName = 'Ray' OR firstName = 'Akash'

			theStudents = session.createQuery("from Student s where" + " s.lastName = 'Ray' OR s.firstName = 'Akash'")
					.getResultList();

			// display the students
			System.out.println("\n\nquery no. 3");
			for (Student student : theStudents)
				System.out.println(student);

			/* ---------------------------------------------------- */

			// query students: email ends with 'gmail.com'
			theStudents = session.createQuery("from Student s where s.email LIKE '%gmail.com'").getResultList();

			// display the students
			System.out.println("\n\nquery no. 4");
			for (Student student : theStudents)
				System.out.println(student);

			// commit the current transaction
			session.getTransaction().commit();
			System.out.println("\n\nDONE.");

		} finally {
			factory.close();
		}
	}

}
