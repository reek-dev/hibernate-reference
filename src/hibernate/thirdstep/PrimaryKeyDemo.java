package hibernate.thirdstep;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import hibernate.entity.Student;

public class PrimaryKeyDemo {

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

			// create 3 Student objects
			System.out.println("creating 3 new Student objects");
			Student student1 = new Student("Reekdev", "Ray", "ray.reekdev@gmail.com");
			Student student2 = new Student("Akash", "Halder", "halder78@gmail.com");
			Student student3 = new Student("Sudipta", "Mondal", "sudipta.mond0l@gmail.com");

			// start a transaction
			session.beginTransaction();

			// save the Student object
			System.out.println("saving the Students ...");
			session.save(student1);
			session.save(student2);
			session.save(student3);

			// commit the current transaction
			session.getTransaction().commit();
			System.out.println("create successful.");

		} finally {
			factory.close();
		}
	}

}
